// Generated from /Users/deepanshululla/PycharmProjects/metrics_dsl/metrics/moatlang_pythonic/grammar/Moatlang.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MoatlangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, INT=12, DOUBLE=13, ID=14, COMMENT=15, MUL=16, DIV=17, 
		SUB=18, ADD=19, STRING=20, NEWLINE=21, WS=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "INT", "DOUBLE", "ID", "COMMENT", "MUL", "DIV", "SUB", 
		"ADD", "STRING", "NEWLINE", "WS"
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


	public MoatlangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Moatlang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\30\u0091\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n"+
		"\3\n\3\n\3\13\3\13\3\f\3\f\3\r\5\rL\n\r\3\r\6\rO\n\r\r\r\16\rP\3\16\5"+
		"\16T\n\16\3\16\6\16W\n\16\r\16\16\16X\3\16\3\16\6\16]\n\16\r\16\16\16"+
		"^\3\17\5\17b\n\17\3\17\7\17e\n\17\f\17\16\17h\13\17\3\20\3\20\7\20l\n"+
		"\20\f\20\16\20o\13\20\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23"+
		"\3\24\3\24\3\25\3\25\7\25\177\n\25\f\25\16\25\u0082\13\25\3\25\3\25\3"+
		"\26\6\26\u0087\n\26\r\26\16\26\u0088\3\27\6\27\u008c\n\27\r\27\16\27\u008d"+
		"\3\27\3\27\4m\u0080\2\30\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30\3\2\7\3\2\62"+
		";\4\2C\\c|\5\2C\\aac|\4\2\f\f\17\17\4\2\13\13\"\"\2\u009a\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\3/\3\2\2\2\5\61\3\2\2"+
		"\2\7\63\3\2\2\2\t\65\3\2\2\2\13\67\3\2\2\2\r:\3\2\2\2\17?\3\2\2\2\21A"+
		"\3\2\2\2\23C\3\2\2\2\25F\3\2\2\2\27H\3\2\2\2\31K\3\2\2\2\33S\3\2\2\2\35"+
		"a\3\2\2\2\37i\3\2\2\2!t\3\2\2\2#v\3\2\2\2%x\3\2\2\2\'z\3\2\2\2)|\3\2\2"+
		"\2+\u0086\3\2\2\2-\u008b\3\2\2\2/\60\7?\2\2\60\4\3\2\2\2\61\62\7*\2\2"+
		"\62\6\3\2\2\2\63\64\7+\2\2\64\b\3\2\2\2\65\66\7.\2\2\66\n\3\2\2\2\678"+
		"\7k\2\289\7h\2\29\f\3\2\2\2:;\7g\2\2;<\7n\2\2<=\7u\2\2=>\7g\2\2>\16\3"+
		"\2\2\2?@\7}\2\2@\20\3\2\2\2AB\7\177\2\2B\22\3\2\2\2CD\7?\2\2DE\7?\2\2"+
		"E\24\3\2\2\2FG\7@\2\2G\26\3\2\2\2HI\7>\2\2I\30\3\2\2\2JL\7/\2\2KJ\3\2"+
		"\2\2KL\3\2\2\2LN\3\2\2\2MO\t\2\2\2NM\3\2\2\2OP\3\2\2\2PN\3\2\2\2PQ\3\2"+
		"\2\2Q\32\3\2\2\2RT\7/\2\2SR\3\2\2\2ST\3\2\2\2TV\3\2\2\2UW\t\2\2\2VU\3"+
		"\2\2\2WX\3\2\2\2XV\3\2\2\2XY\3\2\2\2YZ\3\2\2\2Z\\\7\60\2\2[]\t\2\2\2\\"+
		"[\3\2\2\2]^\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_\34\3\2\2\2`b\t\3\2\2a`\3\2\2"+
		"\2bf\3\2\2\2ce\t\4\2\2dc\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2g\36\3\2"+
		"\2\2hf\3\2\2\2im\7%\2\2jl\13\2\2\2kj\3\2\2\2lo\3\2\2\2mn\3\2\2\2mk\3\2"+
		"\2\2np\3\2\2\2om\3\2\2\2pq\5+\26\2qr\3\2\2\2rs\b\20\2\2s \3\2\2\2tu\7"+
		",\2\2u\"\3\2\2\2vw\7\61\2\2w$\3\2\2\2xy\7/\2\2y&\3\2\2\2z{\7-\2\2{(\3"+
		"\2\2\2|\u0080\7$\2\2}\177\13\2\2\2~}\3\2\2\2\177\u0082\3\2\2\2\u0080\u0081"+
		"\3\2\2\2\u0080~\3\2\2\2\u0081\u0083\3\2\2\2\u0082\u0080\3\2\2\2\u0083"+
		"\u0084\7$\2\2\u0084*\3\2\2\2\u0085\u0087\t\5\2\2\u0086\u0085\3\2\2\2\u0087"+
		"\u0088\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089,\3\2\2\2"+
		"\u008a\u008c\t\6\2\2\u008b\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008b"+
		"\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090\b\27\2\2"+
		"\u0090.\3\2\2\2\17\2KPSX^adfm\u0080\u0088\u008d\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}