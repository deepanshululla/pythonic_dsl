"""
Collection of Node types used in the Moatlang AST.
"""
from enum import Enum

from typing import List


class Node:
    pass


# class AbstractSymbol:
#     type
#     category
#     name


class BrandType(Enum):
    VIDEO = 'video'
    CONTENT = 'content'
    DISPLAY = 'display'


class DBColumn(Node):
    def __init__(self, db_column_name):
        self.name = db_column_name

    def __iter__(self):
        yield from []


class MetricDefinition(Node):
    def __init__(self, api_key, statements):
        self.name = api_key
        self.block = statements

    def __iter__(self):
        yield from self.block

    @property
    def symbol(self):
        return self.name


class Moatlang(Node):
    # TODO: include epochs
    def __init__(self, metric_definitions: List[MetricDefinition], db_columns: List[DBColumn]):
        self.definitions = metric_definitions
        self.db_columns = db_columns

    def __iter__(self):
        yield from self.db_columns
        yield from self.definitions


class Window(Node):
    def __init__(self, method, db_column, epoch):
        self.method = method
        self.db_column = db_column
        self.epoch = epoch

    def __iter__(self):
        yield from [self.db_column, self.epoch]


class MetricValue(Node):
    def __init__(self, api_key):
        self.api_key = api_key

    def __iter__(self):
        yield from []


class Variable(Node):
    def __init__(self, variable):
        self.name = variable

    def __iter__(self):
        yield from []


class Method(Node):
    def __init__(self, method_name, db_column, epoch):
        self.name = method_name
        self.db_column = db_column
        self.epoch = epoch

    def __iter__(self):
        yield from []


class Function(Node):
    def __init__(self, function_name, *operands):
        self.name = function_name
        self.operands = operands

    def __iter__(self):
        yield from []


class BinOp(Node):
    def __init__(self, operator, operands):
        self.operator = operator
        self.operands = operands

    def __iter__(self):
        yield from []


class Epoch(Node):
    def __init__(self, epoch_name):
        self.name = epoch_name

    def __iter__(self):
        yield from []


class Assignment(Node):
    def __init__(self, var, val):
        self.varname = var
        self.expression = val

    def __iter__(self):
        yield self.expression
        yield from self.expression


class Return(Node):
    def __init__(self, expr):
        self.value = expr

    def __iter__(self):
        yield from [self.value]
