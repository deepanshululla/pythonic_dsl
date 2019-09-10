from moatlang_pythonic.grammar.MoatlangVisitor import MoatlangVisitor
from moatlang_pythonic.grammar.MoatlangParser import MoatlangParser
from moatlang_pythonic.grammar.MoatlangLexer import MoatlangLexer
from moatlang_pythonic.semantics.type_checkers import TypeChecker

class CustomVisitor(MoatlangVisitor):
    def __init__(self):
        self.variable_storage = {}
        self.type_checker = TypeChecker()

    def visitAssignment_statement(self, ctx:MoatlangParser.Assignment_statementContext):
        variable_name = str(ctx.ID().getText())
        variable_value = self.visit(ctx.expression())
        self.variable_storage[variable_name] = variable_value

    def visitEqPar(self, ctx:MoatlangParser.EqParContext):
        return self.visit(ctx.expression())

    def visitEqInt(self, ctx:MoatlangParser.EqIntContext):
        return int(ctx.INT().getText())

    def visitEqStr(self, ctx:MoatlangParser.EqStrContext):
        return str(ctx.STRING().getText().strip('"'))

    def visitEqDbl(self, ctx:MoatlangParser.EqDblContext):
        return float(ctx.DOUBLE().getText())

    def visitEqVar(self, ctx:MoatlangParser.EqVarContext):
        var_name = ctx.ID().getText()
        return self.variable_storage[var_name]

    def visitEqAdd(self, ctx:MoatlangParser.EqAddContext):
        operator = ctx.operator
        left = self.visit(ctx.left)
        right = self.visit(ctx.right)
        if operator.type == MoatlangLexer.ADD:
            return left + right
        else:
            return left - right

    def visitEqMUL(self, ctx:MoatlangParser.EqMULContext):
        operator = ctx.operator
        left = self.visit(ctx.left)
        right = self.visit(ctx.right)
        if operator.type == MoatlangLexer.MUL:
            return left * right
        else:
            return float(left) / float(right)

    def visitArguments_list(self, ctx:MoatlangParser.Arguments_listContext):
        result = []
        expressions = ctx.expression()
        for expression in expressions:
            result.append(self.visit(expression))
        return result


    def visitFunction_statement(self, ctx:MoatlangParser.Function_statementContext):
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

    def visitBoolEq(self, ctx:MoatlangParser.BoolEqContext):
        left = self.visit(ctx.left)
        right = self.visit(ctx.right)
        return left == right

    def visitBoolLt(self, ctx:MoatlangParser.BoolLtContext):
        left = self.visit(ctx.left)
        right = self.visit(ctx.right)
        return left < right

    def visitBoolGt(self, ctx:MoatlangParser.BoolGtContext):
        left = self.visit(ctx.left)
        right = self.visit(ctx.right)
        return left > right

    def visitIf_statement(self, ctx:MoatlangParser.If_statementContext):
        elif_statement = ctx.elif_statement()
        else_statement = ctx.else_statement()
        if self.visit(ctx.if_fragment()):
            self.visit(ctx.code_block())
        elif elif_statement is not None:
            self.visit(elif_statement)
        elif else_statement is not None:
            self.visit(else_statement)

    def visitIf_fragment(self, ctx:MoatlangParser.If_fragmentContext):
        return self.visit(ctx.boolean_expression())

    def visitElif_fragment(self, ctx:MoatlangParser.Elif_fragmentContext):
        return self.visit(ctx.boolean_expression())

    def visitElif_statement(self, ctx:MoatlangParser.Elif_statementContext):
        elif_statement = ctx.elif_statement()
        else_statement = ctx.else_statement()
        if self.visit(ctx.elif_fragment()):
            self.visit(ctx.code_block())
        elif elif_statement is not None:
            self.visit(elif_statement)
        elif else_statement is not None:
            self.visit(else_statement)

    def visitElse_statement(self, ctx:MoatlangParser.Else_statementContext):
        self.visit(ctx.code_block())

    def visitList_def(self, ctx:MoatlangParser.List_defContext):
        values = None
        values_list = ctx.values_list()
        if values_list:
            values = self.visit(values_list)
        return values

    def visitValues_list(self, ctx:MoatlangParser.Values_listContext):
        result = []
        values = ctx.list_value()
        for expr in values:
            val = self.visit(expr)
            result.append(val)
        return result

    def visitHashmap(self, ctx:MoatlangParser.HashmapContext):
        result = {}
        kv_pairs = ctx.keyvaluepairs()
        if kv_pairs:
            for kv_pair in kv_pairs:
                values_tuple = self.visit(kv_pair)
                result[str(values_tuple[0])]=values_tuple[1]
        return result

    def visitKeyvaluepairs(self, ctx:MoatlangParser.KeyvaluepairsContext):
        value = self.visit(ctx.hashmapvalue())
        key = ctx.STRING().getText().strip('"')
        return key, value