package org.example;
import java_cup.runtime.SymbolFactory;
import java.io.StringReader;

%%

%public
%class Lexer
%unicode
%cupsym ParserSym
%cup

%{
    SymbolFactory sf;

    public Lexer(String line, SymbolFactory sf) {
        this(new StringReader(line));
        this.sf = sf;
    }
%}

%eofval{
    return sf.newSymbol("EOF", ParserSym.EOF);
%eofval}

NUMBER = [0-9]+
STRING = \"([^\\\"]|\\.)*\"

%%
"print"     { return sf.newSymbol("print", ParserSym.PRINT); }

"+"         { return sf.newSymbol("+", ParserSym.PLUS); }
"-"         { return sf.newSymbol("-", ParserSym.MINUS); }
"*"         { return sf.newSymbol("*", ParserSym.TIMES); }
"/"         { return sf.newSymbol("/", ParserSym.DIVIDE); }
"("         { return sf.newSymbol("(", ParserSym.LPAREN); }
")"         { return sf.newSymbol(")", ParserSym.RPAREN); }

{NUMBER}    { return sf.newSymbol("NUMBER", ParserSym.NUMBER, Integer.valueOf(yytext())); }
{STRING}    { return sf.newSymbol("STRING", ParserSym.NUMBER, new String(yytext())); }

.           { /* ignore */ }

/* error fallback */
[^]         { throw new Error("Illegal character <" + yytext() + ">");  }