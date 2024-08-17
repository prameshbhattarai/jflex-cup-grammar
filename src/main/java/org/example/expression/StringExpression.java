package org.example.expression;

public class StringExpression implements Expr {
    private final String value;

    public StringExpression(String e) {
        value = e;
    }

    @Override
    public Object get() {
        return value;
    }
}
