// Generated from CLite.g4 by ANTLR 4.2.2
package cLite;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CLiteLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__17=1, T__16=2, T__15=3, T__14=4, T__13=5, T__12=6, T__11=7, T__10=8, 
		T__9=9, T__8=10, T__7=11, T__6=12, T__5=13, T__4=14, T__3=15, T__2=16, 
		T__1=17, T__0=18, EquOp=19, RelOp=20, AddOp=21, MulOp=22, Unaryop=23, 
		Identifier=24, LETTER=25, DIGIT=26, LITERAL=27, IntegerType=28, BooleanType=29, 
		FloatType=30, CharType=31, CharacterLiteral=32, SingleCharacter=33, CharLiteral=34, 
		WS=35, COMMENT=36;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'main'", "'char'", "'float'", "'||'", "'while'", "'['", "';'", "'{'", 
		"'&&'", "'='", "']'", "'}'", "'if'", "'bool'", "' '", "'int'", "'('", 
		"')'", "EquOp", "RelOp", "AddOp", "MulOp", "Unaryop", "Identifier", "LETTER", 
		"DIGIT", "LITERAL", "IntegerType", "BooleanType", "FloatType", "CharType", 
		"CharacterLiteral", "SingleCharacter", "CharLiteral", "WS", "COMMENT"
	};
	public static final String[] ruleNames = {
		"T__17", "T__16", "T__15", "T__14", "T__13", "T__12", "T__11", "T__10", 
		"T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", 
		"T__0", "EquOp", "RelOp", "AddOp", "MulOp", "Unaryop", "Identifier", "LETTER", 
		"DIGIT", "LITERAL", "IntegerType", "BooleanType", "FloatType", "CharType", 
		"CharacterLiteral", "SingleCharacter", "CharLiteral", "WS", "COMMENT"
	};


	public CLiteLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CLite.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 34: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:  skip(); break;
		}
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2&\u00ec\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3"+
		"\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3"+
		"\23\3\24\3\24\3\24\3\24\5\24\u008a\n\24\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\5\25\u0092\n\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31\7\31\u009d"+
		"\n\31\f\31\16\31\u00a0\13\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\34\5"+
		"\34\u00aa\n\34\3\35\6\35\u00ad\n\35\r\35\16\35\u00ae\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\5\36\u00ba\n\36\3\37\3\37\3\37\3\37\3 \3"+
		" \3!\3!\3!\3!\3\"\3\"\3#\3#\3$\6$\u00cb\n$\r$\16$\u00cc\3$\3$\3%\3%\3"+
		"%\3%\7%\u00d5\n%\f%\16%\u00d8\13%\3%\5%\u00db\n%\3%\3%\3%\3%\3%\7%\u00e2"+
		"\n%\f%\16%\u00e5\13%\3%\3%\5%\u00e9\n%\3%\3%\3\u00e3\2&\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G"+
		"%I&\3\2\13\4\2--//\5\2\'\',,\61\61\4\2##//\4\2C\\c|\3\2\62;\4\2))^^\5"+
		"\2\62;C\\c|\5\2\13\f\17\17\"\"\4\2\f\f\17\17\u00fb\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\3K\3\2\2"+
		"\2\5P\3\2\2\2\7U\3\2\2\2\t[\3\2\2\2\13^\3\2\2\2\rd\3\2\2\2\17f\3\2\2\2"+
		"\21h\3\2\2\2\23j\3\2\2\2\25m\3\2\2\2\27o\3\2\2\2\31q\3\2\2\2\33s\3\2\2"+
		"\2\35v\3\2\2\2\37{\3\2\2\2!}\3\2\2\2#\u0081\3\2\2\2%\u0083\3\2\2\2\'\u0089"+
		"\3\2\2\2)\u0091\3\2\2\2+\u0093\3\2\2\2-\u0095\3\2\2\2/\u0097\3\2\2\2\61"+
		"\u0099\3\2\2\2\63\u00a1\3\2\2\2\65\u00a3\3\2\2\2\67\u00a9\3\2\2\29\u00ac"+
		"\3\2\2\2;\u00b9\3\2\2\2=\u00bb\3\2\2\2?\u00bf\3\2\2\2A\u00c1\3\2\2\2C"+
		"\u00c5\3\2\2\2E\u00c7\3\2\2\2G\u00ca\3\2\2\2I\u00e8\3\2\2\2KL\7o\2\2L"+
		"M\7c\2\2MN\7k\2\2NO\7p\2\2O\4\3\2\2\2PQ\7e\2\2QR\7j\2\2RS\7c\2\2ST\7t"+
		"\2\2T\6\3\2\2\2UV\7h\2\2VW\7n\2\2WX\7q\2\2XY\7c\2\2YZ\7v\2\2Z\b\3\2\2"+
		"\2[\\\7~\2\2\\]\7~\2\2]\n\3\2\2\2^_\7y\2\2_`\7j\2\2`a\7k\2\2ab\7n\2\2"+
		"bc\7g\2\2c\f\3\2\2\2de\7]\2\2e\16\3\2\2\2fg\7=\2\2g\20\3\2\2\2hi\7}\2"+
		"\2i\22\3\2\2\2jk\7(\2\2kl\7(\2\2l\24\3\2\2\2mn\7?\2\2n\26\3\2\2\2op\7"+
		"_\2\2p\30\3\2\2\2qr\7\177\2\2r\32\3\2\2\2st\7k\2\2tu\7h\2\2u\34\3\2\2"+
		"\2vw\7d\2\2wx\7q\2\2xy\7q\2\2yz\7n\2\2z\36\3\2\2\2{|\7\"\2\2| \3\2\2\2"+
		"}~\7k\2\2~\177\7p\2\2\177\u0080\7v\2\2\u0080\"\3\2\2\2\u0081\u0082\7*"+
		"\2\2\u0082$\3\2\2\2\u0083\u0084\7+\2\2\u0084&\3\2\2\2\u0085\u0086\7?\2"+
		"\2\u0086\u008a\7?\2\2\u0087\u0088\7#\2\2\u0088\u008a\7?\2\2\u0089\u0085"+
		"\3\2\2\2\u0089\u0087\3\2\2\2\u008a(\3\2\2\2\u008b\u0092\7>\2\2\u008c\u008d"+
		"\7>\2\2\u008d\u0092\7?\2\2\u008e\u0092\7@\2\2\u008f\u0090\7@\2\2\u0090"+
		"\u0092\7?\2\2\u0091\u008b\3\2\2\2\u0091\u008c\3\2\2\2\u0091\u008e\3\2"+
		"\2\2\u0091\u008f\3\2\2\2\u0092*\3\2\2\2\u0093\u0094\t\2\2\2\u0094,\3\2"+
		"\2\2\u0095\u0096\t\3\2\2\u0096.\3\2\2\2\u0097\u0098\t\4\2\2\u0098\60\3"+
		"\2\2\2\u0099\u009e\5\63\32\2\u009a\u009d\5\63\32\2\u009b\u009d\5\65\33"+
		"\2\u009c\u009a\3\2\2\2\u009c\u009b\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009c"+
		"\3\2\2\2\u009e\u009f\3\2\2\2\u009f\62\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1"+
		"\u00a2\t\5\2\2\u00a2\64\3\2\2\2\u00a3\u00a4\t\6\2\2\u00a4\66\3\2\2\2\u00a5"+
		"\u00aa\59\35\2\u00a6\u00aa\5;\36\2\u00a7\u00aa\5=\37\2\u00a8\u00aa\5?"+
		" \2\u00a9\u00a5\3\2\2\2\u00a9\u00a6\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9"+
		"\u00a8\3\2\2\2\u00aa8\3\2\2\2\u00ab\u00ad\5\65\33\2\u00ac\u00ab\3\2\2"+
		"\2\u00ad\u00ae\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af:"+
		"\3\2\2\2\u00b0\u00b1\7v\2\2\u00b1\u00b2\7t\2\2\u00b2\u00b3\7w\2\2\u00b3"+
		"\u00ba\7g\2\2\u00b4\u00b5\7h\2\2\u00b5\u00b6\7c\2\2\u00b6\u00b7\7n\2\2"+
		"\u00b7\u00b8\7u\2\2\u00b8\u00ba\7g\2\2\u00b9\u00b0\3\2\2\2\u00b9\u00b4"+
		"\3\2\2\2\u00ba<\3\2\2\2\u00bb\u00bc\59\35\2\u00bc\u00bd\7\60\2\2\u00bd"+
		"\u00be\59\35\2\u00be>\3\2\2\2\u00bf\u00c0\5E#\2\u00c0@\3\2\2\2\u00c1\u00c2"+
		"\7)\2\2\u00c2\u00c3\5C\"\2\u00c3\u00c4\7)\2\2\u00c4B\3\2\2\2\u00c5\u00c6"+
		"\n\7\2\2\u00c6D\3\2\2\2\u00c7\u00c8\t\b\2\2\u00c8F\3\2\2\2\u00c9\u00cb"+
		"\t\t\2\2\u00ca\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc"+
		"\u00cd\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cf\b$\2\2\u00cfH\3\2\2\2\u00d0"+
		"\u00d1\7\61\2\2\u00d1\u00d2\7\61\2\2\u00d2\u00d6\3\2\2\2\u00d3\u00d5\n"+
		"\n\2\2\u00d4\u00d3\3\2\2\2\u00d5\u00d8\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6"+
		"\u00d7\3\2\2\2\u00d7\u00da\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d9\u00db\7\17"+
		"\2\2\u00da\u00d9\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc"+
		"\u00e9\7\f\2\2\u00dd\u00de\7\61\2\2\u00de\u00df\7,\2\2\u00df\u00e3\3\2"+
		"\2\2\u00e0\u00e2\13\2\2\2\u00e1\u00e0\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3"+
		"\u00e4\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e4\u00e6\3\2\2\2\u00e5\u00e3\3\2"+
		"\2\2\u00e6\u00e7\7,\2\2\u00e7\u00e9\7\61\2\2\u00e8\u00d0\3\2\2\2\u00e8"+
		"\u00dd\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00eb\b%\3\2\u00ebJ\3\2\2\2\17"+
		"\2\u0089\u0091\u009c\u009e\u00a9\u00ae\u00b9\u00cc\u00d6\u00da\u00e3\u00e8"+
		"\4\3$\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}