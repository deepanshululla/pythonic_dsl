from moatlang_pythonic.semantics.ast_visitor import CustomVisitor
from moatlang_pythonic.grammar.MoatlangLexer import MoatlangLexer
from moatlang_pythonic.grammar.MoatlangParser import MoatlangParser
from antlr4 import InputStream, CommonTokenStream


if __name__ == '__main__':
    with open('./test_input.txt') as f:
        text = f.read()
        inp_stream = InputStream(text)
        lexer = MoatlangLexer(inp_stream)
        tokens = CommonTokenStream(lexer)
        parser = MoatlangParser(tokens)
        visitor = CustomVisitor()
        visitor.visit(parser.program())