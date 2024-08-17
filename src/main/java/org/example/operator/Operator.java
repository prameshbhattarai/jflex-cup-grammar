package org.example.operator;

import org.example.expression.Expr;

import java.util.HashMap;

public interface Operator {
    int count(Expr e1, Expr e2, HashMap<String, Object> hm);
}
