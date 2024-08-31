package org.example.expression;

import java.util.HashMap;

public class StringConcatExpression implements Expr {
    private final String str1;
    private final String str2;

    public StringConcatExpression(String s1, String s2) {
        str1 = s1;
        str2 = s2;
    }

    @Override
    public Object get(HashMap<String, Object> assignmentLookup) {
        return str1.concat(str2);
    }
}
