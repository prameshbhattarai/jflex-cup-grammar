package org.example;
import java_cup.runtime.ComplexSymbolFactory;

class Main {
    private static final String EXPRESSION = "print(a)";

    public static void main(String[] args) throws Exception {
        ComplexSymbolFactory factory = new ComplexSymbolFactory();
        Lexer lexer = new Lexer(EXPRESSION, factory);
        Parser parser = new Parser(lexer, factory);
        System.out.println(parser.parse().value.toString());
    }
}
