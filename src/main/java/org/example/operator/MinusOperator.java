package org.example.operator;

import org.example.expression.Expr;

import java.util.HashMap;

public class MinusOperator implements Operator {
    @Override
    public int count(Expr e1, Expr e2, HashMap<String, Object> hm) {
        var v1 = e1.run(hm);
        var v2 = e2.run(hm);

        if (v1 instanceof Integer a && v2 instanceof Integer b) {
            return a - b;
        }
        System.out.println("Error: wrong objects type");
        System.exit(1);
        return 0;
    }
}
