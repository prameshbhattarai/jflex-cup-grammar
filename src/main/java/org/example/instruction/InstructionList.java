package org.example.instruction;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class InstructionList implements Instruction {
    private final List<Instruction> instructions;
    private final HashMap<String, Object> assignmentLookup;

    public InstructionList(Instruction instruction) {
        instructions = new ArrayList<>();
        assignmentLookup = new HashMap<>();
        instructions.add(instruction);
    }

    public void add(Instruction instruction) {
        instructions.add(instruction);
    }

    public void run() {
        this.run(assignmentLookup);
    }

    @Override
    public void run(HashMap<String, Object> assignmentLookup) {
        instructions.forEach(instruction -> instruction.run(assignmentLookup));
    }
}
