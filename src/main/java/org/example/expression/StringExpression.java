package org.example.expression;

import java.util.HashMap;

public class StringExpression implements Expr {
    private final String value;

    public StringExpression(String e) {
        value = e;
    }

    public Object run(HashMap<String, Object> hm) {
        return value;
    }
}
