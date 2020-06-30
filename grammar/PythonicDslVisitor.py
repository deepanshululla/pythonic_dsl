# Generated from ./grammar/PythonicDsl.g4 by ANTLR 4.7.1
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .PythonicDslParser import PythonicDslParser
else:
    from PythonicDslParser import PythonicDslParser

# This class defines a complete generic visitor for a parse tree produced by PythonicDslParser.

class PythonicDslVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by PythonicDslParser#program.
    def visitProgram(self, ctx:PythonicDslParser.ProgramContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonicDslParser#statement.
    def visitStatement(self, ctx:PythonicDslParser.StatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonicDslParser#assignment_statement.
    def visitAssignment_statement(self, ctx:PythonicDslParser.Assignment_statementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonicDslParser#eqInt.
    def visitEqInt(self, ctx:PythonicDslParser.EqIntContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonicDslParser#eqDbl.
    def visitEqDbl(self, ctx:PythonicDslParser.EqDblContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonicDslParser#eqHashmap.
    def visitEqHashmap(self, ctx:PythonicDslParser.EqHashmapContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonicDslParser#eqFunc.
    def visitEqFunc(self, ctx:PythonicDslParser.EqFuncContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonicDslParser#eqPar.
    def visitEqPar(self, ctx:PythonicDslParser.EqParContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonicDslParser#eqStr.
    def visitEqStr(self, ctx:PythonicDslParser.EqStrContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonicDslParser#eqAdd.
    def visitEqAdd(self, ctx:PythonicDslParser.EqAddContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonicDslParser#eqArrayIdx.
    def visitEqArrayIdx(self, ctx:PythonicDslParser.EqArrayIdxContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonicDslParser#eqVar.
    def visitEqVar(self, ctx:PythonicDslParser.EqVarContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonicDslParser#eqMUL.
    def visitEqMUL(self, ctx:PythonicDslParser.EqMULContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonicDslParser#eqList.
    def visitEqList(self, ctx:PythonicDslParser.EqListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonicDslParser#boolEq.
    def visitBoolEq(self, ctx:PythonicDslParser.BoolEqContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonicDslParser#boolGt.
    def visitBoolGt(self, ctx:PythonicDslParser.BoolGtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonicDslParser#boolLt.
    def visitBoolLt(self, ctx:PythonicDslParser.BoolLtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonicDslParser#function_statement.
    def visitFunction_statement(self, ctx:PythonicDslParser.Function_statementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonicDslParser#arguments_list.
    def visitArguments_list(self, ctx:PythonicDslParser.Arguments_listContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonicDslParser#if_statement.
    def visitIf_statement(self, ctx:PythonicDslParser.If_statementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonicDslParser#elif_statement.
    def visitElif_statement(self, ctx:PythonicDslParser.Elif_statementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonicDslParser#else_statement.
    def visitElse_statement(self, ctx:PythonicDslParser.Else_statementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonicDslParser#if_fragment.
    def visitIf_fragment(self, ctx:PythonicDslParser.If_fragmentContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonicDslParser#elif_fragment.
    def visitElif_fragment(self, ctx:PythonicDslParser.Elif_fragmentContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonicDslParser#else_fragment.
    def visitElse_fragment(self, ctx:PythonicDslParser.Else_fragmentContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonicDslParser#code_block.
    def visitCode_block(self, ctx:PythonicDslParser.Code_blockContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonicDslParser#list_def.
    def visitList_def(self, ctx:PythonicDslParser.List_defContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonicDslParser#array_idx.
    def visitArray_idx(self, ctx:PythonicDslParser.Array_idxContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonicDslParser#values_list.
    def visitValues_list(self, ctx:PythonicDslParser.Values_listContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonicDslParser#list_value.
    def visitList_value(self, ctx:PythonicDslParser.List_valueContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonicDslParser#hashmap.
    def visitHashmap(self, ctx:PythonicDslParser.HashmapContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonicDslParser#keyvaluepairs.
    def visitKeyvaluepairs(self, ctx:PythonicDslParser.KeyvaluepairsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonicDslParser#hashmapvalue.
    def visitHashmapvalue(self, ctx:PythonicDslParser.HashmapvalueContext):
        return self.visitChildren(ctx)



del PythonicDslParser