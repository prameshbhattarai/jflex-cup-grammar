package org.example;

import java_cup.runtime.ComplexSymbolFactory;

import java.io.FileNotFoundException;
import java.io.InputStreamReader;

public class Main {

    private static final String CODE_FILE_NAME = "code";

    public static void main(String[] args) throws Exception {
        var factory = new ComplexSymbolFactory();
        var codeInputStream = Main.class.getClassLoader().getResourceAsStream(CODE_FILE_NAME);
        if (codeInputStream == null) {
            throw new FileNotFoundException("Code file not found");
        }
        var lexer = new Lexer(new InputStreamReader(codeInputStream), factory);
        var parser = new ParserInternal(lexer, factory);
        parser.parse();
    }
}
