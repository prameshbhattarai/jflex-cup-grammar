package org.example.operator;

import org.example.expression.Expr;

public class DivideOperator implements Operator {
    @Override
    public int exec(Expr e1, Expr e2) {
        var v1 = e1.get();
        var v2 = e2.get();

        if (v1 instanceof Integer a && v2 instanceof Integer b) {
            if (b == 0) {
                System.out.println("Error: divide by 0");
                System.exit(1);
                return 0;
            }
            return a / b;
        }
        System.out.println("Error: wrong objects type");
        System.exit(1);
        return 0;
    }
}
