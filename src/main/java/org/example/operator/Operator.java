package org.example.operator;

import org.example.expression.Expr;
import org.example.expression.IDExpression;

import java.util.HashMap;

public interface Operator {
    Object exec(Expr e1, Expr e2, HashMap<String, Object> assignmentLookup);

    default Object getValue(Expr e, HashMap<String, Object> assignmentLookup) {
        if (e instanceof IDExpression) {
            return e.get(assignmentLookup);
        } else if (e.get(assignmentLookup) instanceof Integer integer) {
            return integer;
        } else if (e.get(assignmentLookup) instanceof String str) {
            return str;
        }
        System.out.println("Error: wrong objects type provided for Operation");
        System.exit(1);
        return 0;
    }
}
