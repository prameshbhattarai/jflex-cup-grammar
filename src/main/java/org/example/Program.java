package org.example;

import org.example.instruction.InstructionList;

public class Program {
    private final InstructionList instructionList;

    public Program(InstructionList instructionList) {
        this.instructionList = instructionList;
    }

    public void exec() {
        instructionList.run();
    }

}
