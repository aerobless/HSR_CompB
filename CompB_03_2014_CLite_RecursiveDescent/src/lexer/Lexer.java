package lexer;

// Lexical Analyzer f�r Clite

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import symbolTabelle.Token;

public class Lexer {
	private char ch = ' ';
	private BufferedReader input;
	private String line = "";
	private int lineno = 1;
	private int col = 1;
	private final String letters = "abcdefghijklmnopqrstuvwxyz"
			+ "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private final String digits = "0123456789";
	private final char eolnCh = '\n';
	private final char eofCh = '\004';
	
	private final boolean showInput=false;

	public Lexer(String fileName) { // source filename
		try {
			input = new BufferedReader(new FileReader(fileName));
		} catch (FileNotFoundException e) {
			System.out.println("Datei nicht gefunden: " + fileName);
			System.exit(1);
		}
	}

	private char nextChar() { 
		// Return: naechstes Zeichen
		if (ch == eofCh)
			error("EOF erreicht");
		col++;
		if (col >= line.length()) {
			try {
				line = input.readLine();
			} catch (IOException e) {
				System.err.println(e);
				System.exit(1);
			} // try
			if (line == null) // EOF
				line = "" + eofCh;
			else {
				// Debug Info
				if (showInput)
				System.out.println("[Programmzeile] "+ lineno + ":\t" + line);
				lineno++;
				line += eolnCh;
			} // if line
			col = 0;
		} // if col
		return line.charAt(col);
	}

	public Token next() { 
		// next Token
		do {
			if (isLetter(ch)) { // ident oder keyword
				String spelling = concat(letters + digits);
				return Token.keyword(spelling);
			} else if (isDigit(ch)) { // int oder float literal
				String number = concat(digits);
				if (ch != '.') // int Literal
					return Token.mkIntLiteral(number);
				number += concat(digits);
				return Token.mkFloatLiteral(number);
			} else
				switch (ch) {
				case ' ':
				case '\t':
				case '\r':
				case eolnCh:
					ch = nextChar();
					break;

				case '/': // divide oder comment
					/* Falls das n�chste Zeichen noch ein'/' ist 
					 * dann ist die Zeile ein Kommentar 
					 * und kann �berlesen werden!
					 */
					ch = nextChar();
					if (ch != '/')
						return Token.divideTok;
					// comment
					do {
						ch = nextChar();
					} while (ch != eolnCh);
					ch = nextChar();
					break;

				case '\'': // char literal
					char ch1 = nextChar();
					nextChar(); // get '
					ch = nextChar();
					return Token.mkCharLiteral("" + ch1);

				case eofCh:
					return Token.eofTok;

				case '+':
					ch = nextChar();
					return Token.plusTok;
				case '-':
					ch = nextChar();
					return Token.minusTok;
				case '*':
					ch = nextChar();
					return Token.multiplyTok;
				case '(':
					ch = nextChar();
					return Token.leftParenTok;
				case ')':
					ch = nextChar();
					return Token.rightParenTok;
				case '{':
					ch = nextChar();
					return Token.leftBraceTok;
				case '}':
					ch = nextChar();
					return Token.rightBraceTok;
				case ';':
					ch = nextChar();
					return Token.semicolonTok;
				case ',':
					ch = nextChar();
					return Token.commaTok;

				case '&':
					check('&');
					return Token.andTok;
				case '|':
					check('|');
					return Token.orTok;

				case '=':
					return chkOpt('=', Token.assignTok, Token.eqeqTok);
				case '<':
					return chkOpt('=', Token.ltTok, Token.lteqTok);
				case '>':
					return chkOpt('=', Token.gtTok, Token.gteqTok);
				case '!':
					return chkOpt('=', Token.notTok, Token.noteqTok);

				default:
					error("Ungueltiges Zeichen " + ch);
				} // switch
		} while (true);
	} // next

	private boolean isLetter(char c) {
		return (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z');
	}

	private boolean isDigit(char c) {
		return (c >= '0' && c <= '9');
	}

	private void check(char c) {
		ch = nextChar();
		if (ch != c)
			error("Unueltiges Zeichen! Erwartet: " + c);
		ch = nextChar();
	}

	private Token chkOpt(char c, Token one, Token two) {
		ch = nextChar();
		if (ch != c)
			return one;
		ch = nextChar();
		return two;
	}

	private String concat(String set) {
		String r = "";
		do {
			r += ch;
			ch = nextChar();
		} while (set.indexOf(ch) >= 0);
		return r;
	}

	public void error(String msg) {
		System.err.print(line);
		System.err.println("Fehler: Spalte " + col + " " + msg);
		System.exit(1);
	}
 
	static public void main(String[] args) {
		/*
		 * Source File Quellcode erst einmal ausgeben!
		 */
		String fName = "src/programme/hello.cpp";
		try {
			BufferedReader fRead = new BufferedReader(new FileReader(fName));
			String zeile = null;
			while ((zeile = fRead.readLine()) != null) {
				System.out.println("[scr]" + zeile);
			}			
			System.out.println();
			fRead.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		if (args.length == 1) {
			fName = args[0];
		}
		Lexer lexer = new Lexer(fName);
		Token tok = lexer.next();
		while (tok != Token.eofTok) {
			System.out.println(tok.toString());
			tok = lexer.next();
		}
	}
}