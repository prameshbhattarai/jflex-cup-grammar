package org.example.operator;

import org.example.expression.Expr;

import java.util.HashMap;

public class PlusOperator implements Operator {
    @Override
    public Object exec(Expr e1, Expr e2, HashMap<String, Object> assignmentLookup) {
        var v1 = getValue(e1, assignmentLookup);
        var v2 = getValue(e2, assignmentLookup);

        if (v1 instanceof Integer a && v2 instanceof Integer b) {
            return a + b;
        } else if (v1 instanceof String a && v2 instanceof String b) {
            return a + b;
        }
        System.out.println("Error: wrong objects type provided for PlusOperator");
        System.exit(1);
        return 0;
    }
}
