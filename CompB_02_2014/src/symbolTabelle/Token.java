package symbolTabelle;


// Tokens for Clite

public class Token {
	private static final boolean DEBUG = false;

	/*
	 * in der enum TokenType stehen alle reservierten Worte
	 * vor dem Symbol for EOF.
	 */
	private static final int NOF_KEYWORDS = TokenType.Eof.ordinal();

	private static final String[] reserved = new String[NOF_KEYWORDS];
	private static Token[] token = new Token[NOF_KEYWORDS];
	
	/*
	 * Der Lexer braucht kein grosses Gedächnis da er ja jeweils nur die Tokens via
	 * .next() an den Parser weitergibt. d.h. private TokenType & String ist alles was
	 * er konkret weiss.
	 */
	private TokenType type;
	private String value = "";

	//jetzt folgen die einzelnen Token Objekte:
	public static final Token eofTok = new Token(TokenType.Eof, "<<EOF>>");
	public static final Token boolTok = new Token(TokenType.Bool, "bool");
	public static final Token charTok = new Token(TokenType.Char, "char");
	public static final Token elseTok = new Token(TokenType.Else, "else");
	public static final Token falseTok = new Token(TokenType.False, "false");
	public static final Token floatTok = new Token(TokenType.Float, "float");
	public static final Token ifTok = new Token(TokenType.If, "if");
	public static final Token intTok = new Token(TokenType.Int, "int");
	public static final Token mainTok = new Token(TokenType.Main, "main");
	public static final Token trueTok = new Token(TokenType.True, "true");
	public static final Token whileTok = new Token(TokenType.While, "while");
	public static final Token leftBraceTok = new Token(TokenType.LeftBrace, "{");
	public static final Token rightBraceTok = new Token(TokenType.RightBrace,"}");
	public static final Token leftBracketTok = new Token(TokenType.LeftBracket,"[");
	public static final Token rightBracketTok = new Token(TokenType.RightBracket, "]");
	public static final Token leftParenTok = new Token(TokenType.LeftParen, "(");
	public static final Token rightParenTok = new Token(TokenType.RightParen,")");
	public static final Token semicolonTok = new Token(TokenType.Semicolon, ";");
	public static final Token commaTok = new Token(TokenType.Comma, ",");
	public static final Token assignTok = new Token(TokenType.Assign, "=");
	public static final Token eqeqTok = new Token(TokenType.Equals, "==");
	public static final Token ltTok = new Token(TokenType.Less, "<");
	public static final Token lteqTok = new Token(TokenType.LessEqual, "<=");
	public static final Token gtTok = new Token(TokenType.Greater, ">");
	public static final Token gteqTok = new Token(TokenType.GreaterEqual, ">=");
	public static final Token notTok = new Token(TokenType.Not, "!");
	public static final Token noteqTok = new Token(TokenType.NotEqual, "!=");
	public static final Token plusTok = new Token(TokenType.Plus, "+");
	public static final Token minusTok = new Token(TokenType.Minus, "-");
	public static final Token multiplyTok = new Token(TokenType.Multiply, "*");
	public static final Token divideTok = new Token(TokenType.Divide, "/");
	public static final Token andTok = new Token(TokenType.And, "&&");
	public static final Token orTok = new Token(TokenType.Or, "||");

	private Token(TokenType t, String v) {
		type = t;
		value = v;
		if (t.compareTo(TokenType.Eof) < 0) {
			/* Eintragen der reservierten W�rter
			 * in das Array token[]
			 */
			// Debug Info: reserviertes Wort
			if (DEBUG) System.out.println("IF reserviertes Wort: "+ t.ordinal()+ " ; "+ v);
			int ti = t.ordinal();
			reserved[ti] = v;
			token[ti] = this;
		}
	}

	public TokenType type() {
		return type;
	}

	public String value() {
		return value;
	}

	public static Token keyword(String name) {
		char ch = name.charAt(0);
		// Keywords werden klein geschrieben
		if (ch >= 'A' && ch <= 'Z') {
			// das muss ein Identifier sein
			// Debug Info
			if (DEBUG) System.out.println("[IDENTIFIER] "+ name);
			return mkIdentTok(name);
		}
		// Kleinbuchstaben: k�nnte Keyword sein
		for (int i = 0; i < NOF_KEYWORDS; i++) {
			if (name.equals(reserved[i])) {
				// Debug Info
				if (DEBUG) System.out.println("[KEYWORD] "+ name);
				return token[i];
			}
		}
		// Kleinbuchstabe aber kein Keyword
		// Debug Info
		if (DEBUG) System.out.println("[IDENTIFIER] "+ name);
		return mkIdentTok(name);
	} 

	public static Token mkIdentTok(String name) {
		return new Token(TokenType.Identifier, name);
	}

	public static Token mkIntLiteral(String name) {
		return new Token(TokenType.IntLiteral, name);
	}

	public static Token mkFloatLiteral(String name) {
		return new Token(TokenType.FloatLiteral, name);
	}

	public static Token mkCharLiteral(String name) {
		return new Token(TokenType.CharLiteral, name);
	}

	public String toString() {
		if (type.compareTo(TokenType.Identifier) < 0)
			return value;
		return type + "\t" + value;
	} 

	public static void main(String[] args) {
		System.out.println("[Token]Ausgabe von EOF und while Tab und ...");
		System.out.println("Keywords: "+ NOF_KEYWORDS);
		System.out.println(eofTok);
		System.out.println(whileTok);
		System.out.println(mkIdentTok("alfa"));
		System.out.println(mkCharLiteral("beta"));
		System.out.println(mkIntLiteral("15"));
		//
		TokenType[] tt = TokenType.values();
		System.out.println("[TokenTypes] " + tt.length);
		for (TokenType t : tt) {
			System.out.println(t);
		}
	}
} 
