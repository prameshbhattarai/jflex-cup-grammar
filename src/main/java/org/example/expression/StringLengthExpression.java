package org.example.expression;

import java.util.HashMap;

public class StringLengthExpression implements Expr {
    private final Expr expr;

    public StringLengthExpression(Expr e) {
        expr = e;
    }

    @Override
    public Object get(HashMap<String, Object> assignmentLookup) {
        if (expr instanceof StringExpression s) {
            return s.get(assignmentLookup).toString().length();
        } else if (expr instanceof IDExpression i) {
            return i.get(assignmentLookup).toString().length();
        }
        System.out.println("Error: wrong objects type");
        System.exit(1);
        return 0;
    }
}
