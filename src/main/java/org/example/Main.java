package org.example;
import java_cup.runtime.ComplexSymbolFactory;

public class Main {
    private static final String EXPRESSION = "print(1+2)";

    public static void main(String[] args) throws Exception {
        var factory = new ComplexSymbolFactory();
        var lexer = new Lexer(EXPRESSION, factory);
        var parser = new Parser(lexer, factory);
        parser.parse();
    }
}
