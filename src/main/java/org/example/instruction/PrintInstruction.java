package org.example.instruction;

import org.example.expression.Expr;

public class PrintInstruction implements Instruction {
    private final Expr expr;

    public PrintInstruction(Expr expr) {
        this.expr = expr;
    }

    @Override
    public void run() {
        System.out.println(expr.get());
    }
}
