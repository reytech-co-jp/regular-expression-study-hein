package com.regularExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NonControlCharSentenceChecker {

    private static final Pattern pattern = Pattern.compile("\\P{Cntrl}*");

    public boolean matchNonControlCharPattern(String text) {
        Matcher matcher = pattern.matcher(text);
        return matcher.matches();
    }
}
