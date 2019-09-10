"""
The DSL engine for Moatlang.
"""
from antlr4 import FileStream, CommonTokenStream, ParseTreeWalker

from metrics.antlr.MoatlangParser import MoatlangParser
from metrics.antlr.MoatlangLexer import MoatlangLexer

from metrics.models import Brand
from metrics.stats_api import HashableStatsRequest
from metrics.visitors import ASTVisitor
from metrics.semantics import semantically_analyze


class AbstractEngine:
    def __init__(self, ast):
        self._ast = ast

    def execute(self, request: HashableStatsRequest, brand: Brand):
        """
        Generate the SQL that will produce
        """
        raise NotImplementedError

    @classmethod
    def from_file(cls, defs_file: str) -> 'SQLEngine':
        lexer = MoatlangLexer(FileStream(defs_file))
        stream = CommonTokenStream(lexer)
        parser = MoatlangParser(stream)
        cst = parser.moatlang()
        ast_visitor = ASTVisitor()
        ast = ast_visitor.visitMoatlang(cst)
        semantically_analyze(ast)
        return cls(ast)


class SQLEngine(AbstractEngine):
    def __init__(self, ast):
        self._ast = ast

    def execute(self, request: HashableStatsRequest, brand: Brand):
        """
        Generate a SQL query that once ran, can populate the `.results`
        attribute of the API resposne.
        """
        raise NotImplementedError


class MarkdownEngine(AbstractEngine):
    def execute(self, request: HashableStatsRequest, brand: Brand):
        """
        Prune the AST of extraneous nodes and generate a markdown file that
        describes the metric definitions.
        """
        raise NotImplementedError
