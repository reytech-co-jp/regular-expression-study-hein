package com.regularexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HiraganaSentenceChecker {

    private static final Pattern pattern = Pattern.compile("^[\u3040-\u309F]+$");

    public boolean matchHiraganaPattern(String text) {
        Matcher matcher = pattern.matcher(text);
        return matcher.matches();
    }
}
