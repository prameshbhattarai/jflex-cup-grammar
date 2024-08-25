package org.example.operator;

import org.example.expression.Expr;

import java.util.HashMap;

public class PlusOperator implements Operator {
    @Override
    public int exec(Expr e1, Expr e2, HashMap<String, Object> assignmentLookup) {
        var a = getValue(e1, assignmentLookup);
        var b = getValue(e2, assignmentLookup);
        return a + b;
    }
}
