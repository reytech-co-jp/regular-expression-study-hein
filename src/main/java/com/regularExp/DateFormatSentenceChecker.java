package com.regularExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateFormatSentenceChecker {

    private static final Pattern pattern = Pattern.compile("^\\d{4}-(0[1-9]|1[0-2])-(0[1-9]|[12]\\d|3[01])+$");

    public boolean matchDateFormatPattern(String text) {
        Matcher matcher = pattern.matcher(text);
        return matcher.matches();
    }
}
