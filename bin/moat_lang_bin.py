from pythonic_dsl.semantics.ast_visitor import CustomVisitor
from pythonic_dsl.grammar.PythonicDslLexer import PythonicDslLexer
from pythonic_dsl.grammar.PythonicDslParser import PythonicDslParser
from antlr4 import InputStream, CommonTokenStream


if __name__ == '__main__':
    with open('./test_input.txt') as f:
        text = f.read()
        inp_stream = InputStream(text)
        lexer = PythonicDslLexer(inp_stream)
        tokens = CommonTokenStream(lexer)
        parser = PythonicDslParser(tokens)
        visitor = CustomVisitor()
        visitor.visit(parser.program())