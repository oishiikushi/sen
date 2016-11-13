package com.granatapfel;
// Generated from src/com/granatapfel/KI.g by ANTLR 4.5.3
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class KILexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LineBreak=1, PrefixValue=2, SimpleValue=3;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"LineBreak", "PrefixValue", "SimpleValue"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'Der Computer feuert '"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "LineBreak", "PrefixValue", "SimpleValue"
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


	public KILexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "KI.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\5_\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\3\2\5\2\13\n\2\3\2\3\2\5\2\17\n\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5"+
		"\4\\\n\4\3\4\3\4\2\2\5\3\3\5\4\7\5\3\2\2a\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\3\16\3\2\2\2\5\20\3\2\2\2\7[\3\2\2\2\t\13\7\17\2\2\n\t\3\2\2"+
		"\2\n\13\3\2\2\2\13\f\3\2\2\2\f\17\7\f\2\2\r\17\7\17\2\2\16\n\3\2\2\2\16"+
		"\r\3\2\2\2\17\4\3\2\2\2\20\21\7F\2\2\21\22\7g\2\2\22\23\7t\2\2\23\24\7"+
		"\"\2\2\24\25\7E\2\2\25\26\7q\2\2\26\27\7o\2\2\27\30\7r\2\2\30\31\7w\2"+
		"\2\31\32\7v\2\2\32\33\7g\2\2\33\34\7t\2\2\34\35\7\"\2\2\35\36\7h\2\2\36"+
		"\37\7g\2\2\37 \7w\2\2 !\7g\2\2!\"\7t\2\2\"#\7v\2\2#$\7\"\2\2$\6\3\2\2"+
		"\2%&\7c\2\2&\'\7w\2\2\'(\7h\2\2()\7\"\2\2)*\3\2\2\2*+\4CI\2+\\\4\639\2"+
		",-\7r\2\2-.\7g\2\2./\7t\2\2/\60\7\"\2\2\60\61\7\\\2\2\61\62\7w\2\2\62"+
		"\63\7h\2\2\63\64\7c\2\2\64\65\7n\2\2\65\66\7n\2\2\66\67\7\"\2\2\678\7"+
		"c\2\289\7w\2\29:\7h\2\2:;\7\"\2\2;<\7g\2\2<=\7k\2\2=>\7p\2\2>?\7g\2\2"+
		"?@\7\"\2\2@A\7p\2\2AB\7q\2\2BC\7e\2\2CD\7j\2\2DE\7\"\2\2EF\7p\2\2FG\7"+
		"k\2\2GH\7e\2\2HI\7j\2\2IJ\7v\2\2JK\7\"\2\2KL\7i\2\2LM\7g\2\2MN\7v\2\2"+
		"NO\7t\2\2OP\7q\2\2PQ\7h\2\2QR\7h\2\2RS\7g\2\2ST\7p\2\2TU\7g\2\2UV\7\""+
		"\2\2VW\7\\\2\2WX\7g\2\2XY\7n\2\2YZ\7n\2\2Z\\\7g\2\2[%\3\2\2\2[,\3\2\2"+
		"\2\\]\3\2\2\2]^\7\60\2\2^\b\3\2\2\2\6\2\n\16[\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}