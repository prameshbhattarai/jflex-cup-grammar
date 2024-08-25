package org.example.operator;

import org.example.expression.Expr;
import org.example.expression.IDExpression;

import java.util.HashMap;

public interface Operator {
    int exec(Expr e1, Expr e2, HashMap<String, Object> assignmentLookup);

    default int getValue(Expr e, HashMap<String, Object> assignmentLookup) {
        if (e instanceof IDExpression) {
            return (int) e.get(assignmentLookup);
        }
        if (e.get(assignmentLookup) instanceof Integer integer) {
            return integer;
        } else {
            System.out.println("Error: wrong objects type");
            System.exit(1);
            return 0;
        }
    }
}
