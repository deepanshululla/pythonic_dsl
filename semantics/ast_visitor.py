from pythonic_dsl.grammar.PythonicDslVisitor import PythonicDslVisitor
from pythonic_dsl.grammar.PythonicDslParser import PythonicDslParser
from pythonic_dsl.grammar.PythonicDslLexer import PythonicDslLexer
from pythonic_dsl.semantics.type_checkers import TypeChecker

class CustomVisitor(PythonicDslVisitor):
    def __init__(self):
        self.variable_storage = {}
        self.type_checker = TypeChecker()

    def visitAssignment_statement(self, ctx:PythonicDslParser.Assignment_statementContext):
        variable_name = str(ctx.ID().getText())
        variable_value = self.visit(ctx.expression())
        self.variable_storage[variable_name] = variable_value

    def visitEqPar(self, ctx:PythonicDslParser.EqParContext):
        return self.visit(ctx.expression())

    def visitEqInt(self, ctx:PythonicDslParser.EqIntContext):
        return int(ctx.INT().getText())

    def visitEqStr(self, ctx:PythonicDslParser.EqStrContext):
        return str(ctx.STRING().getText().strip('"'))

    def visitEqDbl(self, ctx:PythonicDslParser.EqDblContext):
        return float(ctx.DOUBLE().getText())

    def visitEqVar(self, ctx:PythonicDslParser.EqVarContext):
        var_name = ctx.ID().getText()
        return self.variable_storage[var_name]

    def visitEqAdd(self, ctx:PythonicDslParser.EqAddContext):
        operator = ctx.operator
        left = self.visit(ctx.left)
        right = self.visit(ctx.right)
        if operator.type == PythonicDslLexer.ADD:
            return left + right
        else:
            return left - right

    def visitEqMUL(self, ctx:PythonicDslParser.EqMULContext):
        operator = ctx.operator
        left = self.visit(ctx.left)
        right = self.visit(ctx.right)
        if operator.type == PythonicDslLexer.MUL:
            return left * right
        else:
            return float(left) / float(right)

    def visitArguments_list(self, ctx:PythonicDslParser.Arguments_listContext):
        result = []
        expressions = ctx.expression()
        for expression in expressions:
            result.append(self.visit(expression))
        return result


    def visitFunction_statement(self, ctx:PythonicDslParser.Function_statementContext):
        arguments = None
        arguments_list = ctx.arguments_list()
        if arguments_list:
            arguments = self.visit(arguments_list)
        function_name = ctx.ID().getText()
        try:
            func = globals()['__builtins__'][function_name]
            return func(*arguments)

        except Exception as err:
            print(f"UnDefined function: {err}")
            raise err

    def visitBoolEq(self, ctx:PythonicDslParser.BoolEqContext):
        left = self.visit(ctx.left)
        right = self.visit(ctx.right)
        return left == right

    def visitBoolLt(self, ctx:PythonicDslParser.BoolLtContext):
        left = self.visit(ctx.left)
        right = self.visit(ctx.right)
        return left < right

    def visitBoolGt(self, ctx:PythonicDslParser.BoolGtContext):
        left = self.visit(ctx.left)
        right = self.visit(ctx.right)
        return left > right

    def visitIf_statement(self, ctx:PythonicDslParser.If_statementContext):
        elif_statement = ctx.elif_statement()
        else_statement = ctx.else_statement()
        if self.visit(ctx.if_fragment()):
            self.visit(ctx.code_block())
        elif elif_statement is not None:
            self.visit(elif_statement)
        elif else_statement is not None:
            self.visit(else_statement)

    def visitIf_fragment(self, ctx:PythonicDslParser.If_fragmentContext):
        return self.visit(ctx.boolean_expression())

    def visitElif_fragment(self, ctx:PythonicDslParser.Elif_fragmentContext):
        return self.visit(ctx.boolean_expression())

    def visitElif_statement(self, ctx:PythonicDslParser.Elif_statementContext):
        elif_statement = ctx.elif_statement()
        else_statement = ctx.else_statement()
        if self.visit(ctx.elif_fragment()):
            self.visit(ctx.code_block())
        elif elif_statement is not None:
            self.visit(elif_statement)
        elif else_statement is not None:
            self.visit(else_statement)

    def visitElse_statement(self, ctx:PythonicDslParser.Else_statementContext):
        self.visit(ctx.code_block())

    def visitList_def(self, ctx:PythonicDslParser.List_defContext):
        values = None
        values_list = ctx.values_list()
        if values_list:
            values = self.visit(values_list)
        return values

    def visitValues_list(self, ctx:PythonicDslParser.Values_listContext):
        result = []
        values = ctx.list_value()
        for expr in values:
            val = self.visit(expr)
            result.append(val)
        return result

    def visitHashmap(self, ctx:PythonicDslParser.HashmapContext):
        result = {}
        kv_pairs = ctx.keyvaluepairs()
        if kv_pairs:
            for kv_pair in kv_pairs:
                values_tuple = self.visit(kv_pair)
                result[str(values_tuple[0])]=values_tuple[1]
        return result

    def visitKeyvaluepairs(self, ctx:PythonicDslParser.KeyvaluepairsContext):
        value = self.visit(ctx.hashmapvalue())
        key = ctx.STRING().getText().strip('"')
        return key, value