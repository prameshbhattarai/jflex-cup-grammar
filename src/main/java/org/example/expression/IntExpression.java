package org.example.expression;

import java.util.HashMap;

public class IntExpression implements Expr {
    private final int value;

    public IntExpression(int i) {
        value = i;
    }

    @Override
    public Object get(HashMap<String, Object> assignmentLookup) {
        return value;
    }
}
