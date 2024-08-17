package org.example.instruction;

import java.util.HashMap;

public interface Instruction {
    void run(HashMap<String, Object> hm);
    void run(Object instruction);
    void run();
}
