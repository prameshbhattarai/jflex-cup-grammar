package org.example.expression;

public class IntExpression implements Expr {
    private final int value;

    public IntExpression(int i) {
        value = i;
    }

    @Override
    public Object get() {
        return value;
    }
}
