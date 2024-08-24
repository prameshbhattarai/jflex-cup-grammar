package org.example;

import java_cup.runtime.ComplexSymbolFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class Main {

    public static void main(String[] args) throws Exception {

        if (args.length == 0 || args[0].isEmpty()) {
            throw new FileNotFoundException("Please provide file path.");
        }

        String filePath = args[0];
        try (var inputStream = new InputStreamReader(new FileInputStream(filePath), StandardCharsets.UTF_8)) {
            var factory = new ComplexSymbolFactory();
            var lexer = new Lexer(inputStream, factory);
            var parser = new ParserInternal(lexer, factory);
            parser.parse();
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }
}
