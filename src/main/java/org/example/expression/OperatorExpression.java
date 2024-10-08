package org.example.expression;

import org.example.operator.Operator;

import java.util.HashMap;

public class OperatorExpression implements Expr {
    private final Expr e1;
    private final Expr e2;
    private final Operator operator;

    public OperatorExpression(Expr e1, Operator operator, Expr e2) {
        this.e1 = e1;
        this.operator = operator;
        this.e2 = e2;
    }

    @Override
    public Object get(HashMap<String, Object> assignmentLookup) {
        return operator.exec(e1, e2, assignmentLookup);
    }
}
