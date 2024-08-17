package org.example.instruction;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class InstructionList {
    private final List<Instruction> instructions;

    public InstructionList(Instruction instruction){
        instructions = new ArrayList<>();
        instructions.add(instruction);
    }

    public void add(Instruction instruction) {
        instructions.add(instruction);
    }

    public void run(HashMap<String, Object> hm){
        instructions.forEach(i -> i.run(hm));
    }
}
