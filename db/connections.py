from psycopg2 import connect

from psycopg2.extensions import cursor
from psycopg2.extras import DictCursor


class ConnectionInterface:
    def connect(self):
        raise NotImplementedError

    def create_cursor(self):
        raise NotImplementedError

    def rollback(self, exc_type, exc_val, exc_tb):
        raise NotImplementedError

    def commit(self):
        raise NotImplementedError

    def close(self):
        raise NotImplementedError

    def __enter__(self):
        raise NotImplementedError

    def __exit__(self, exc_type, exc_val, exc_tb):
        raise NotImplementedError


class AbstractConnection(ConnectionInterface):

    def __enter__(self):
        self.connect()
        return self.create_cursor()

    def __exit__(self, exc_type, exc_val, exc_tb):
        if exc_type:
            self.rollback(exc_type, exc_val, exc_tb)
        else:
            self.commit()
        self.close()


class Connection(AbstractConnection):
    _db = None
    _uri = None
    _cursor_factory = None

    @property
    def _db_factory(self):
        return connect(self._uri, self._cursor_factory)

    def connect(self):
        self._db = self._db_factory()

    def create_cursor(self):
        return self._db.cursor()

    def rollback(self, exc_type, exc_val, exc_tb):
        self._db.rollback()

    def commit(self):
        self._db.commit()

    def close(self):
        self._db.close()
        self._db = None


class ReaderConnection(Connection):
    def __init__(self, uri: str, cursor_factory: cursor = DictCursor):
        self._uri = uri
        self._cursor_factory = cursor_factory
