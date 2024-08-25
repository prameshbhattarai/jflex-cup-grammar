package org.example.expression;

import java.util.HashMap;

public class StringExpression implements Expr {
    private final String value;

    public StringExpression(String e) {
        value = e;
    }

    @Override
    public Object get(HashMap<String, Object> assignmentLookup) {
        return value;
    }
}
