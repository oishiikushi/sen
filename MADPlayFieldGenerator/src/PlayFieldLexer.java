// Generated from src/PlayField.g by ANTLR 4.5.3
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PlayFieldLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Separator=1, LineBreak=2, SimpleValue=3, WayValue=4, StartValue=5, GoalValue=6, 
		ToGoalValue=7, HomeValue=8;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"Separator", "LineBreak", "SimpleValue", "WayValue", "StartValue", "GoalValue", 
		"ToGoalValue", "HomeValue"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", null, "'NO'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "Separator", "LineBreak", "SimpleValue", "WayValue", "StartValue", 
		"GoalValue", "ToGoalValue", "HomeValue"
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


	public PlayFieldLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PlayField.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\n\u00d1\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\3"+
		"\5\3\27\n\3\3\3\3\3\5\3\33\n\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\5\5(\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6"+
		"Z\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\5\7\u0094\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\5\b\u00c6\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00d0"+
		"\n\t\2\2\n\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\3\2\2\u0105\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\3\23\3\2\2\2\5\32\3\2\2\2\7\34\3\2\2\2\t\'\3\2\2\2\13"+
		"Y\3\2\2\2\r\u0093\3\2\2\2\17\u00c5\3\2\2\2\21\u00cf\3\2\2\2\23\24\7=\2"+
		"\2\24\4\3\2\2\2\25\27\7\17\2\2\26\25\3\2\2\2\26\27\3\2\2\2\27\30\3\2\2"+
		"\2\30\33\7\f\2\2\31\33\7\17\2\2\32\26\3\2\2\2\32\31\3\2\2\2\33\6\3\2\2"+
		"\2\34\35\7P\2\2\35\36\7Q\2\2\36\b\3\2\2\2\37 \7Y\2\2 (\7P\2\2!\"\7Y\2"+
		"\2\"(\7U\2\2#$\7Y\2\2$(\7Y\2\2%&\7Y\2\2&(\7G\2\2\'\37\3\2\2\2\'!\3\2\2"+
		"\2\'#\3\2\2\2\'%\3\2\2\2(\n\3\2\2\2)*\7U\2\2*+\7\63\2\2+Z\7P\2\2,-\7U"+
		"\2\2-.\7\64\2\2.Z\7P\2\2/\60\7U\2\2\60\61\7\65\2\2\61Z\7P\2\2\62\63\7"+
		"U\2\2\63\64\7\66\2\2\64Z\7P\2\2\65\66\7U\2\2\66\67\7\63\2\2\67Z\7U\2\2"+
		"89\7U\2\29:\7\64\2\2:Z\7U\2\2;<\7U\2\2<=\7\65\2\2=Z\7U\2\2>?\7U\2\2?@"+
		"\7\66\2\2@Z\7U\2\2AB\7U\2\2BC\7\63\2\2CZ\7Y\2\2DE\7U\2\2EF\7\64\2\2FZ"+
		"\7Y\2\2GH\7U\2\2HI\7\65\2\2IZ\7Y\2\2JK\7U\2\2KL\7\66\2\2LZ\7Y\2\2MN\7"+
		"U\2\2NO\7\63\2\2OZ\7G\2\2PQ\7U\2\2QR\7\64\2\2RZ\7G\2\2ST\7U\2\2TU\7\65"+
		"\2\2UZ\7G\2\2VW\7U\2\2WX\7\66\2\2XZ\7G\2\2Y)\3\2\2\2Y,\3\2\2\2Y/\3\2\2"+
		"\2Y\62\3\2\2\2Y\65\3\2\2\2Y8\3\2\2\2Y;\3\2\2\2Y>\3\2\2\2YA\3\2\2\2YD\3"+
		"\2\2\2YG\3\2\2\2YJ\3\2\2\2YM\3\2\2\2YP\3\2\2\2YS\3\2\2\2YV\3\2\2\2Z\f"+
		"\3\2\2\2[\\\7I\2\2\\\u0094\7\63\2\2]^\7I\2\2^\u0094\7\64\2\2_`\7I\2\2"+
		"`\u0094\7\65\2\2ab\7I\2\2b\u0094\7\66\2\2cd\7I\2\2de\7\63\2\2e\u0094\7"+
		"P\2\2fg\7I\2\2gh\7\63\2\2h\u0094\7U\2\2ij\7I\2\2jk\7\63\2\2k\u0094\7Y"+
		"\2\2lm\7I\2\2mn\7\63\2\2n\u0094\7G\2\2op\7I\2\2pq\7\64\2\2q\u0094\7P\2"+
		"\2rs\7I\2\2st\7\64\2\2t\u0094\7U\2\2uv\7I\2\2vw\7\64\2\2w\u0094\7Y\2\2"+
		"xy\7I\2\2yz\7\64\2\2z\u0094\7G\2\2{|\7I\2\2|}\7\65\2\2}\u0094\7P\2\2~"+
		"\177\7I\2\2\177\u0080\7\65\2\2\u0080\u0094\7U\2\2\u0081\u0082\7I\2\2\u0082"+
		"\u0083\7\65\2\2\u0083\u0094\7Y\2\2\u0084\u0085\7I\2\2\u0085\u0086\7\65"+
		"\2\2\u0086\u0094\7G\2\2\u0087\u0088\7I\2\2\u0088\u0089\7\66\2\2\u0089"+
		"\u0094\7P\2\2\u008a\u008b\7I\2\2\u008b\u008c\7\66\2\2\u008c\u0094\7U\2"+
		"\2\u008d\u008e\7I\2\2\u008e\u008f\7\66\2\2\u008f\u0094\7Y\2\2\u0090\u0091"+
		"\7I\2\2\u0091\u0092\7\66\2\2\u0092\u0094\7G\2\2\u0093[\3\2\2\2\u0093]"+
		"\3\2\2\2\u0093_\3\2\2\2\u0093a\3\2\2\2\u0093c\3\2\2\2\u0093f\3\2\2\2\u0093"+
		"i\3\2\2\2\u0093l\3\2\2\2\u0093o\3\2\2\2\u0093r\3\2\2\2\u0093u\3\2\2\2"+
		"\u0093x\3\2\2\2\u0093{\3\2\2\2\u0093~\3\2\2\2\u0093\u0081\3\2\2\2\u0093"+
		"\u0084\3\2\2\2\u0093\u0087\3\2\2\2\u0093\u008a\3\2\2\2\u0093\u008d\3\2"+
		"\2\2\u0093\u0090\3\2\2\2\u0094\16\3\2\2\2\u0095\u0096\7Y\2\2\u0096\u0097"+
		"\7P\2\2\u0097\u0098\7I\2\2\u0098\u00c6\7G\2\2\u0099\u009a\7Y\2\2\u009a"+
		"\u009b\7U\2\2\u009b\u009c\7I\2\2\u009c\u00c6\7G\2\2\u009d\u009e\7Y\2\2"+
		"\u009e\u009f\7Y\2\2\u009f\u00a0\7I\2\2\u00a0\u00c6\7G\2\2\u00a1\u00a2"+
		"\7Y\2\2\u00a2\u00a3\7G\2\2\u00a3\u00a4\7I\2\2\u00a4\u00c6\7P\2\2\u00a5"+
		"\u00a6\7Y\2\2\u00a6\u00a7\7P\2\2\u00a7\u00a8\7I\2\2\u00a8\u00c6\7Y\2\2"+
		"\u00a9\u00aa\7Y\2\2\u00aa\u00ab\7U\2\2\u00ab\u00ac\7I\2\2\u00ac\u00c6"+
		"\7Y\2\2\u00ad\u00ae\7Y\2\2\u00ae\u00af\7Y\2\2\u00af\u00b0\7I\2\2\u00b0"+
		"\u00c6\7P\2\2\u00b1\u00b2\7Y\2\2\u00b2\u00b3\7G\2\2\u00b3\u00b4\7I\2\2"+
		"\u00b4\u00c6\7U\2\2\u00b5\u00b6\7Y\2\2\u00b6\u00b7\7P\2\2\u00b7\u00b8"+
		"\7I\2\2\u00b8\u00c6\7U\2\2\u00b9\u00ba\7Y\2\2\u00ba\u00bb\7U\2\2\u00bb"+
		"\u00bc\7I\2\2\u00bc\u00c6\7P\2\2\u00bd\u00be\7Y\2\2\u00be\u00bf\7Y\2\2"+
		"\u00bf\u00c0\7I\2\2\u00c0\u00c6\7U\2\2\u00c1\u00c2\7Y\2\2\u00c2\u00c3"+
		"\7G\2\2\u00c3\u00c4\7I\2\2\u00c4\u00c6\7Y\2\2\u00c5\u0095\3\2\2\2\u00c5"+
		"\u0099\3\2\2\2\u00c5\u009d\3\2\2\2\u00c5\u00a1\3\2\2\2\u00c5\u00a5\3\2"+
		"\2\2\u00c5\u00a9\3\2\2\2\u00c5\u00ad\3\2\2\2\u00c5\u00b1\3\2\2\2\u00c5"+
		"\u00b5\3\2\2\2\u00c5\u00b9\3\2\2\2\u00c5\u00bd\3\2\2\2\u00c5\u00c1\3\2"+
		"\2\2\u00c6\20\3\2\2\2\u00c7\u00c8\7J\2\2\u00c8\u00d0\7\63\2\2\u00c9\u00ca"+
		"\7J\2\2\u00ca\u00d0\7\64\2\2\u00cb\u00cc\7J\2\2\u00cc\u00d0\7\65\2\2\u00cd"+
		"\u00ce\7J\2\2\u00ce\u00d0\7\66\2\2\u00cf\u00c7\3\2\2\2\u00cf\u00c9\3\2"+
		"\2\2\u00cf\u00cb\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0\22\3\2\2\2\n\2\26\32"+
		"\'Y\u0093\u00c5\u00cf\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}