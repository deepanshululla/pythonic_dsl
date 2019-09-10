from enum import Enum
from ..db.connections import ReaderConnection


class NoSuchBrandError(KeyError):
    pass


class BrandType(Enum):
    pass


class VideoBrandType(BrandType):
    VIDEO = 'VIDEO'
    OTT_CTV = 'OTT_CTV'


class DisplayBrandType(BrandType):
    ADMIN = 'ADMIN'
    CONTENT_UNITS = 'CONTENT_UNITS'
    PUBLISHER = 'PUBLISHER'
    ADVERTISER = 'ADVERTISER'


class ContentBrandType(BrandType):
    CONTENT_PAGE = 'CONTENT_PAGE'


VALID_BRAND_TYPES = [
    ContentBrandType,
    DisplayBrandType,
    VideoBrandType
]

_BRAND_QUERY_BY_ID = '''
SELECT id AS brand_id, level0top, brand_type
FROM clients.brands
WHERE id = %(brand_id)s
'''


class Brand:
    def __init__(self, brand_id, level0top, brand_type=None):
        self._id = int(brand_id)
        self._level0top = level0top
        self._brand_type = db_to_brand_type(brand_type)

    @property
    def level0top(self) -> str:
        return self._level0top

    @property
    def id(self) -> int:
        return self._id

    @property
    def type(self) -> BrandType:
        return self._brand_type

    def __hash__(self):
        return hash(self.id)


def raise_n_brand(brand_id: int, dbcx: ReaderConnection):
    with dbcx as cursor:
        cursor.execute(_BRAND_QUERY_BY_ID, {'brand_id': brand_id})
        row = cursor.fetchone()

        if row is None:
            raise NoSuchBrandError(f'No such brand with id={brand_id} exists')

        return Brand(**row)


def db_to_brand_type(raw: str) -> BrandType:
    last_ex = None
    for brand_type in VALID_BRAND_TYPES:
        try:
            return brand_type(raw)
        except ValueError as err:
            last_ex = err

    raise ValueError(f'{raw} is not a valid brand type') from last_ex
