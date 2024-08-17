package org.example.instruction;

import org.example.expression.Expr;

import java.util.HashMap;

public class PrintInstruction implements Instruction{
    private final Expr expr;

    public PrintInstruction(Expr expr) {
        this.expr = expr;
    }
    @Override
    public void run(HashMap<String, Object> hm) {
        System.out.println(expr.run(hm));
    }
}
