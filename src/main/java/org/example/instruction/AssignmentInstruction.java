package org.example.instruction;

import org.example.expression.Expr;

public class AssignmentInstruction implements Instruction {
    private final String id;
    private final Expr expr;

    public AssignmentInstruction(String id, Expr expr) {
        this.id = id;
        this.expr = expr;
    }

    @Override
    public void run() {
        expr.get();
    }
}
