package org.example.instruction;

import java.util.ArrayList;
import java.util.List;

public class InstructionList implements Instruction {
    private final List<Instruction> instructions;

    public InstructionList(Instruction instruction) {
        instructions = new ArrayList<>();
        instructions.add(instruction);
    }

    public void add(Instruction instruction) {
        instructions.add(instruction);
    }

    @Override
    public void run() {
        instructions.forEach(Instruction::run);
    }
}
