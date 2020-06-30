from pythonic_dsl.semantics.ast_visitor import CustomVisitor
from pythonic_dsl.grammar.PythonicDslLexer import PythonicDslLexer
from pythonic_dsl.grammar.PythonicDslParser import PythonicDslParser
from antlr4 import InputStream, CommonTokenStream
from argparse import ArgumentParser

def parse_args():
    parser = ArgumentParser(description='Pythonic DSL interpreter')
    parser.add_argument("-f","--filename", type=str, help="Filename to parse")
    return parser.parse_args()

if __name__ == '__main__':
    args = parse_args()

    if not args.filename:
        filename = '../test_input.txt'
    else:
        filename = args.filename
    with open(filename) as f:
        text = f.read()
        inp_stream = InputStream(text)
        lexer = PythonicDslLexer(inp_stream)
        tokens = CommonTokenStream(lexer)
        parser = PythonicDslParser(tokens)
        visitor = CustomVisitor()
        visitor.visit(parser.program())