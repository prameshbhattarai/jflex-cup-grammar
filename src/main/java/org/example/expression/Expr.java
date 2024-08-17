package org.example.expression;

import java.util.HashMap;

public interface Expr {
    Object run(HashMap<String, Object> hm);
}
