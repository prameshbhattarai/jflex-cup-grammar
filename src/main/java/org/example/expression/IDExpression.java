package org.example.expression;

import java.util.HashMap;

public class IDExpression implements Expr {

    private final String id;

    public IDExpression(String id) {
        this.id = id;
    }

    @Override
    public Object get(HashMap<String, Object> assignmentLookup) {
        return assignmentLookup.get(id);
    }
}
