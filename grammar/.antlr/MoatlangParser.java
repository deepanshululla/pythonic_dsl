// Generated from /Users/deepanshululla/PycharmProjects/metrics_dsl/metrics/moatlang_pythonic/grammar/Moatlang.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MoatlangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, INT=12, DOUBLE=13, ID=14, COMMENT=15, MUL=16, DIV=17, 
		SUB=18, ADD=19, STRING=20, NEWLINE=21, WS=22;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_assignment_statement = 2, RULE_expression = 3, 
		RULE_function_statement = 4, RULE_function_list = 5, RULE_if_statement = 6, 
		RULE_if_fragment = 7, RULE_else_fragment = 8, RULE_code_block = 9, RULE_boolean_expression = 10;
	public static final String[] ruleNames = {
		"program", "statement", "assignment_statement", "expression", "function_statement", 
		"function_list", "if_statement", "if_fragment", "else_fragment", "code_block", 
		"boolean_expression"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "'('", "')'", "','", "'if'", "'else'", "'{'", "'}'", "'=='", 
		"'>'", "'<'", null, null, null, null, "'*'", "'/'", "'-'", "'+'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"INT", "DOUBLE", "ID", "COMMENT", "MUL", "DIV", "SUB", "ADD", "STRING", 
		"NEWLINE", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Moatlang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MoatlangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(MoatlangParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(22);
				statement();
				}
				}
				setState(25); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__4 || _la==ID );
			setState(27);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public Assignment_statementContext assignment_statement() {
			return getRuleContext(Assignment_statementContext.class,0);
		}
		public Function_statementContext function_statement() {
			return getRuleContext(Function_statementContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(32);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(29);
				assignment_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(30);
				function_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(31);
				if_statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assignment_statementContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MoatlangParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(MoatlangParser.NEWLINE, 0); }
		public Assignment_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_statement; }
	}

	public final Assignment_statementContext assignment_statement() throws RecognitionException {
		Assignment_statementContext _localctx = new Assignment_statementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_assignment_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			match(ID);
			setState(35);
			match(T__0);
			setState(36);
			expression(0);
			setState(37);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EqIntContext extends ExpressionContext {
		public TerminalNode INT() { return getToken(MoatlangParser.INT, 0); }
		public EqIntContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class EqParContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public EqParContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class EqStrContext extends ExpressionContext {
		public TerminalNode STRING() { return getToken(MoatlangParser.STRING, 0); }
		public EqStrContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class EqAddContext extends ExpressionContext {
		public ExpressionContext left;
		public Token operator;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ADD() { return getToken(MoatlangParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(MoatlangParser.SUB, 0); }
		public EqAddContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class EqVarContext extends ExpressionContext {
		public TerminalNode ID() { return getToken(MoatlangParser.ID, 0); }
		public EqVarContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class EqMULContext extends ExpressionContext {
		public ExpressionContext left;
		public Token operator;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MUL() { return getToken(MoatlangParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(MoatlangParser.DIV, 0); }
		public EqMULContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class EqDoubleContext extends ExpressionContext {
		public TerminalNode DOUBLE() { return getToken(MoatlangParser.DOUBLE, 0); }
		public EqDoubleContext(ExpressionContext ctx) { copyFrom(ctx); }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				_localctx = new EqParContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(40);
				match(T__1);
				setState(41);
				expression(0);
				setState(42);
				match(T__2);
				}
				break;
			case ID:
				{
				_localctx = new EqVarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(44);
				match(ID);
				}
				break;
			case INT:
				{
				_localctx = new EqIntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(45);
				match(INT);
				}
				break;
			case DOUBLE:
				{
				_localctx = new EqDoubleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(46);
				match(DOUBLE);
				}
				break;
			case STRING:
				{
				_localctx = new EqStrContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(47);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(58);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(56);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new EqMULContext(new ExpressionContext(_parentctx, _parentState));
						((EqMULContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(50);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(51);
						((EqMULContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
							((EqMULContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(52);
						((EqMULContext)_localctx).right = expression(7);
						}
						break;
					case 2:
						{
						_localctx = new EqAddContext(new ExpressionContext(_parentctx, _parentState));
						((EqAddContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(53);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(54);
						((EqAddContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==SUB || _la==ADD) ) {
							((EqAddContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(55);
						((EqAddContext)_localctx).right = expression(6);
						}
						break;
					}
					} 
				}
				setState(60);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Function_statementContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MoatlangParser.ID, 0); }
		public Function_listContext function_list() {
			return getRuleContext(Function_listContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(MoatlangParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(MoatlangParser.NEWLINE, i);
		}
		public Function_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_statement; }
	}

	public final Function_statementContext function_statement() throws RecognitionException {
		Function_statementContext _localctx = new Function_statementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_function_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(ID);
			setState(62);
			match(T__1);
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << INT) | (1L << DOUBLE) | (1L << ID) | (1L << STRING))) != 0)) {
				{
				setState(63);
				function_list();
				}
			}

			setState(66);
			match(T__2);
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(67);
				match(NEWLINE);
				}
				}
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_listContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Function_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_list; }
	}

	public final Function_listContext function_list() throws RecognitionException {
		Function_listContext _localctx = new Function_listContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_function_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			expression(0);
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(74);
				match(T__3);
				setState(75);
				expression(0);
				}
				}
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_statementContext extends ParserRuleContext {
		public If_fragmentContext if_fragment() {
			return getRuleContext(If_fragmentContext.class,0);
		}
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public Else_fragmentContext else_fragment() {
			return getRuleContext(Else_fragmentContext.class,0);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_if_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			if_fragment();
			setState(82);
			code_block();
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(83);
				else_fragment();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_fragmentContext extends ParserRuleContext {
		public Boolean_expressionContext boolean_expression() {
			return getRuleContext(Boolean_expressionContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(MoatlangParser.NEWLINE, 0); }
		public If_fragmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_fragment; }
	}

	public final If_fragmentContext if_fragment() throws RecognitionException {
		If_fragmentContext _localctx = new If_fragmentContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_if_fragment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(T__4);
			setState(87);
			boolean_expression();
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(88);
				match(NEWLINE);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Else_fragmentContext extends ParserRuleContext {
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(MoatlangParser.NEWLINE, 0); }
		public Else_fragmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_fragment; }
	}

	public final Else_fragmentContext else_fragment() throws RecognitionException {
		Else_fragmentContext _localctx = new Else_fragmentContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_else_fragment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(T__5);
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(92);
				match(NEWLINE);
				}
			}

			setState(95);
			code_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Code_blockContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(MoatlangParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(MoatlangParser.NEWLINE, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Code_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code_block; }
	}

	public final Code_blockContext code_block() throws RecognitionException {
		Code_blockContext _localctx = new Code_blockContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_code_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(T__6);
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(98);
				match(NEWLINE);
				}
			}

			setState(102); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(101);
				statement();
				}
				}
				setState(104); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__4 || _la==ID );
			setState(106);
			match(T__7);
			setState(107);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Boolean_expressionContext extends ParserRuleContext {
		public Boolean_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_expression; }
	 
		public Boolean_expressionContext() { }
		public void copyFrom(Boolean_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BoolLtContext extends Boolean_expressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public BoolLtContext(Boolean_expressionContext ctx) { copyFrom(ctx); }
	}
	public static class BoolGtContext extends Boolean_expressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public BoolGtContext(Boolean_expressionContext ctx) { copyFrom(ctx); }
	}
	public static class BoolEqContext extends Boolean_expressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public BoolEqContext(Boolean_expressionContext ctx) { copyFrom(ctx); }
	}

	public final Boolean_expressionContext boolean_expression() throws RecognitionException {
		Boolean_expressionContext _localctx = new Boolean_expressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_boolean_expression);
		try {
			setState(121);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new BoolEqContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				((BoolEqContext)_localctx).left = expression(0);
				setState(110);
				match(T__8);
				setState(111);
				((BoolEqContext)_localctx).right = expression(0);
				}
				break;
			case 2:
				_localctx = new BoolGtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
				((BoolGtContext)_localctx).left = expression(0);
				setState(114);
				match(T__9);
				setState(115);
				((BoolGtContext)_localctx).right = expression(0);
				}
				break;
			case 3:
				_localctx = new BoolLtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(117);
				((BoolLtContext)_localctx).left = expression(0);
				setState(118);
				match(T__10);
				setState(119);
				((BoolLtContext)_localctx).right = expression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\30~\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\3\2\6\2\32\n\2\r\2\16\2\33\3\2\3\2\3\3\3\3\3\3\5\3#\n\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\63\n\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\7\5;\n\5\f\5\16\5>\13\5\3\6\3\6\3\6\5\6C\n\6\3\6\3\6\7"+
		"\6G\n\6\f\6\16\6J\13\6\3\7\3\7\3\7\7\7O\n\7\f\7\16\7R\13\7\3\b\3\b\3\b"+
		"\5\bW\n\b\3\t\3\t\3\t\5\t\\\n\t\3\n\3\n\5\n`\n\n\3\n\3\n\3\13\3\13\5\13"+
		"f\n\13\3\13\6\13i\n\13\r\13\16\13j\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f|\n\f\3\f\2\3\b\r\2\4\6\b\n\f\16\20\22"+
		"\24\26\2\4\3\2\22\23\3\2\24\25\2\u0085\2\31\3\2\2\2\4\"\3\2\2\2\6$\3\2"+
		"\2\2\b\62\3\2\2\2\n?\3\2\2\2\fK\3\2\2\2\16S\3\2\2\2\20X\3\2\2\2\22]\3"+
		"\2\2\2\24c\3\2\2\2\26{\3\2\2\2\30\32\5\4\3\2\31\30\3\2\2\2\32\33\3\2\2"+
		"\2\33\31\3\2\2\2\33\34\3\2\2\2\34\35\3\2\2\2\35\36\7\2\2\3\36\3\3\2\2"+
		"\2\37#\5\6\4\2 #\5\n\6\2!#\5\16\b\2\"\37\3\2\2\2\" \3\2\2\2\"!\3\2\2\2"+
		"#\5\3\2\2\2$%\7\20\2\2%&\7\3\2\2&\'\5\b\5\2\'(\7\27\2\2(\7\3\2\2\2)*\b"+
		"\5\1\2*+\7\4\2\2+,\5\b\5\2,-\7\5\2\2-\63\3\2\2\2.\63\7\20\2\2/\63\7\16"+
		"\2\2\60\63\7\17\2\2\61\63\7\26\2\2\62)\3\2\2\2\62.\3\2\2\2\62/\3\2\2\2"+
		"\62\60\3\2\2\2\62\61\3\2\2\2\63<\3\2\2\2\64\65\f\b\2\2\65\66\t\2\2\2\66"+
		";\5\b\5\t\678\f\7\2\289\t\3\2\29;\5\b\5\b:\64\3\2\2\2:\67\3\2\2\2;>\3"+
		"\2\2\2<:\3\2\2\2<=\3\2\2\2=\t\3\2\2\2><\3\2\2\2?@\7\20\2\2@B\7\4\2\2A"+
		"C\5\f\7\2BA\3\2\2\2BC\3\2\2\2CD\3\2\2\2DH\7\5\2\2EG\7\27\2\2FE\3\2\2\2"+
		"GJ\3\2\2\2HF\3\2\2\2HI\3\2\2\2I\13\3\2\2\2JH\3\2\2\2KP\5\b\5\2LM\7\6\2"+
		"\2MO\5\b\5\2NL\3\2\2\2OR\3\2\2\2PN\3\2\2\2PQ\3\2\2\2Q\r\3\2\2\2RP\3\2"+
		"\2\2ST\5\20\t\2TV\5\24\13\2UW\5\22\n\2VU\3\2\2\2VW\3\2\2\2W\17\3\2\2\2"+
		"XY\7\7\2\2Y[\5\26\f\2Z\\\7\27\2\2[Z\3\2\2\2[\\\3\2\2\2\\\21\3\2\2\2]_"+
		"\7\b\2\2^`\7\27\2\2_^\3\2\2\2_`\3\2\2\2`a\3\2\2\2ab\5\24\13\2b\23\3\2"+
		"\2\2ce\7\t\2\2df\7\27\2\2ed\3\2\2\2ef\3\2\2\2fh\3\2\2\2gi\5\4\3\2hg\3"+
		"\2\2\2ij\3\2\2\2jh\3\2\2\2jk\3\2\2\2kl\3\2\2\2lm\7\n\2\2mn\7\27\2\2n\25"+
		"\3\2\2\2op\5\b\5\2pq\7\13\2\2qr\5\b\5\2r|\3\2\2\2st\5\b\5\2tu\7\f\2\2"+
		"uv\5\b\5\2v|\3\2\2\2wx\5\b\5\2xy\7\r\2\2yz\5\b\5\2z|\3\2\2\2{o\3\2\2\2"+
		"{s\3\2\2\2{w\3\2\2\2|\27\3\2\2\2\20\33\"\62:<BHPV[_ej{";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}