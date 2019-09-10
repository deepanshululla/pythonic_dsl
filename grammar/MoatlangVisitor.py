# Generated from ./grammar/Moatlang.g4 by ANTLR 4.7.1
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .MoatlangParser import MoatlangParser
else:
    from MoatlangParser import MoatlangParser

# This class defines a complete generic visitor for a parse tree produced by MoatlangParser.

class MoatlangVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by MoatlangParser#program.
    def visitProgram(self, ctx:MoatlangParser.ProgramContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MoatlangParser#statement.
    def visitStatement(self, ctx:MoatlangParser.StatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MoatlangParser#assignment_statement.
    def visitAssignment_statement(self, ctx:MoatlangParser.Assignment_statementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MoatlangParser#eqInt.
    def visitEqInt(self, ctx:MoatlangParser.EqIntContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MoatlangParser#eqDbl.
    def visitEqDbl(self, ctx:MoatlangParser.EqDblContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MoatlangParser#eqHashmap.
    def visitEqHashmap(self, ctx:MoatlangParser.EqHashmapContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MoatlangParser#eqFunc.
    def visitEqFunc(self, ctx:MoatlangParser.EqFuncContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MoatlangParser#eqPar.
    def visitEqPar(self, ctx:MoatlangParser.EqParContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MoatlangParser#eqStr.
    def visitEqStr(self, ctx:MoatlangParser.EqStrContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MoatlangParser#eqAdd.
    def visitEqAdd(self, ctx:MoatlangParser.EqAddContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MoatlangParser#eqArrayIdx.
    def visitEqArrayIdx(self, ctx:MoatlangParser.EqArrayIdxContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MoatlangParser#eqVar.
    def visitEqVar(self, ctx:MoatlangParser.EqVarContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MoatlangParser#eqMUL.
    def visitEqMUL(self, ctx:MoatlangParser.EqMULContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MoatlangParser#eqList.
    def visitEqList(self, ctx:MoatlangParser.EqListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MoatlangParser#boolEq.
    def visitBoolEq(self, ctx:MoatlangParser.BoolEqContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MoatlangParser#boolGt.
    def visitBoolGt(self, ctx:MoatlangParser.BoolGtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MoatlangParser#boolLt.
    def visitBoolLt(self, ctx:MoatlangParser.BoolLtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MoatlangParser#function_statement.
    def visitFunction_statement(self, ctx:MoatlangParser.Function_statementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MoatlangParser#arguments_list.
    def visitArguments_list(self, ctx:MoatlangParser.Arguments_listContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MoatlangParser#if_statement.
    def visitIf_statement(self, ctx:MoatlangParser.If_statementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MoatlangParser#elif_statement.
    def visitElif_statement(self, ctx:MoatlangParser.Elif_statementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MoatlangParser#else_statement.
    def visitElse_statement(self, ctx:MoatlangParser.Else_statementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MoatlangParser#if_fragment.
    def visitIf_fragment(self, ctx:MoatlangParser.If_fragmentContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MoatlangParser#elif_fragment.
    def visitElif_fragment(self, ctx:MoatlangParser.Elif_fragmentContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MoatlangParser#else_fragment.
    def visitElse_fragment(self, ctx:MoatlangParser.Else_fragmentContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MoatlangParser#code_block.
    def visitCode_block(self, ctx:MoatlangParser.Code_blockContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MoatlangParser#list_def.
    def visitList_def(self, ctx:MoatlangParser.List_defContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MoatlangParser#array_idx.
    def visitArray_idx(self, ctx:MoatlangParser.Array_idxContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MoatlangParser#values_list.
    def visitValues_list(self, ctx:MoatlangParser.Values_listContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MoatlangParser#list_value.
    def visitList_value(self, ctx:MoatlangParser.List_valueContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MoatlangParser#hashmap.
    def visitHashmap(self, ctx:MoatlangParser.HashmapContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MoatlangParser#keyvaluepairs.
    def visitKeyvaluepairs(self, ctx:MoatlangParser.KeyvaluepairsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MoatlangParser#hashmapvalue.
    def visitHashmapvalue(self, ctx:MoatlangParser.HashmapvalueContext):
        return self.visitChildren(ctx)



del MoatlangParser