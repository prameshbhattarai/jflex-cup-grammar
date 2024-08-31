package org.example.expression;

import java.util.HashMap;

public class NegativeIntExpression implements Expr {
    private final int value;

    public NegativeIntExpression(int i) {
        value = i;
    }

    @Override
    public Object get(HashMap<String, Object> assignmentLookup) {
        return -value;
    }
}
