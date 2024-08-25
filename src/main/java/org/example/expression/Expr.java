package org.example.expression;

import java.util.HashMap;

public interface Expr {
    Object get(HashMap<String, Object> assignmentLookup);
}
