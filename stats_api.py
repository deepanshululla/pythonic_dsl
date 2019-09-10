import hashlib
import shelve

from requests import Response

from statsapi.v1.core import Api
from statsapi.v1.stats import StatsRequest


class HashableStatsRequest(StatsRequest):
    def __hash__(self):
        args = self.get_args().items()
        qs = '&'.join(f'{k}={v}' for k, v in args)
        hash_object = hashlib.md5(qs.encode())
        return int(hash_object.hexdigest(), base=16)

    def __eq__(self, other):
        return hash(self) == hash(other)

    def __str__(self):
        return str(hash(self))

    def __repr__(self):
        args = self.get_args().items()
        qs = '&'.join(f'{k}={v}' for k, v in args)
        return f"GET | {qs}"

    def __getitem__(self, arg):
        return self.get_args()[arg]

    def __contains__(self, qs_param):
        return qs_param in self.get_args()

    @property
    def brand_id(self):
        return self['brandId']

    @staticmethod
    def from_query_string(self, query_string):
        raise NotImplementedError


class CacheStatsAPI(Api):
    """
    The real stats-cache.
    """
    def __init__(self, *args, **kwargs):
        self.db_file = kwargs['fixture_db']
        kwargs.pop('fixture_db', None)
        super(CacheStatsAPI, self).__init__(*args, **kwargs)

    def __getitem__(self, request: HashableStatsRequest) -> Response:
        with shelve.open(self.db_file) as db:
            return db[str(request)]

    def __setitem__(self, request: HashableStatsRequest, response: Response):
        with shelve.open(self.db_file) as db:
            db[str(request)] = response

    def execute(self, request: HashableStatsRequest) -> dict:
        """
        Query a local cache first.

        Query the API if miss.
        """
        try:
            return self[request]
        except KeyError:
            response = super(CacheStatsAPI, self).execute(request)
            content = response.get_results()
            cache_value = content[0]
            self[request] = cache_value

        return cache_value
