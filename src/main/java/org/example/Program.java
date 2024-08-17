package org.example;

import org.example.instruction.InstructionList;

import java.util.HashMap;

public class Program {
    private final HashMap<String, Object> hm = new HashMap<>();
    private final Object obj = new Object();
    private final InstructionList instructionList;

    public Program(InstructionList instructionList) {
        this.instructionList = instructionList;
    }

    public void exec() {
        instructionList.run();
    }

}
