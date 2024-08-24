package org.example.expression;

public class IDExpression implements Expr {

    private final String id;

    public IDExpression(String id) {
        this.id = id;
    }

    @Override
    public Object get() {
        return id;
    }
}
