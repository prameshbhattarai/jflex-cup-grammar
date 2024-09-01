package org.example.operator;

import org.example.expression.Expr;

import java.util.HashMap;

public class DivideOperator implements Operator {
    @Override
    public Object exec(Expr e1, Expr e2, HashMap<String, Object> assignmentLookup) {
        var a = (Integer) getValue(e1, assignmentLookup);
        var b = (Integer) getValue(e2, assignmentLookup);

        if (b == 0) {
            System.out.println("Error: divide by 0");
            System.exit(1);
            return 0;
        }
        return a / b;
    }
}
