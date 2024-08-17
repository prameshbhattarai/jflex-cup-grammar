package org.example.operator;

import org.example.expression.Expr;

public interface Operator {
    int count(Expr e1, Expr e2);
}
