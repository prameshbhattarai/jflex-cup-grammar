package org.example;

import java_cup.runtime.ComplexSymbolFactory;
import java_cup.runtime.ComplexSymbolFactory.Location;
import java.io.Reader;

%%

%public
%class Lexer
%unicode
%cupsym ParserSym
%cup
%implements Symbols

%{
    ComplexSymbolFactory sf;

    public Lexer(Reader reader, ComplexSymbolFactory sf) {
        this(reader);
        this.sf = sf;
    }
%}

%eofval{
    return sf.newSymbol(
        "EOF",
        EOF,
        new Location(yyline+1, yycolumn+1, (int)yychar),
        new Location(yyline+1, yycolumn+1, (int)yychar+1)
    );
%eofval}

NUMBER = [0-9]+
STRING = \"([^\\\"]|\\.)*\"
NEWLINE =  \r|\n|\r\n
WHITESPACE = {NEWLINE} | [ \f\t\v]

%%
"print"         { return sf.newSymbol("print", PRINT); }
"function"      { return sf.newSymbol("function", FUNCTION); }

"+"             { return sf.newSymbol("+", PLUS); }
"-"             { return sf.newSymbol("-", MINUS); }
"*"             { return sf.newSymbol("*", TIMES); }
"/"             { return sf.newSymbol("/", DIVIDE); }
"("             { return sf.newSymbol("(", LPAREN); }
")"             { return sf.newSymbol(")", RPAREN); }
"{"             { return sf.newSymbol("{", LBRACE); }
"}"             { return sf.newSymbol("}", RBRACE); }
";"             { return sf.newSymbol(";", SEMI); }

{NUMBER}        { return sf.newSymbol("NUMBER", NUMBER, Integer.valueOf(yytext())); }
{STRING}        { return sf.newSymbol("STRING", STRING, new String(yytext())); }
{WHITESPACE}    { /* do nothing */ }

/* error fallback */
[^]         { throw new Error("Illegal character <" + yytext() + ">");  }