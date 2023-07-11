package com.regularExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TxtSentenceChecker {
	private static final String TXT_REGEX = ".*\\.txt$";
	
	public boolean matchTxtPattern(String text) {
		Pattern pattern = Pattern.compile(TXT_REGEX);
		Matcher matcher = pattern.matcher(text);
		return matcher.matches();
	}

}
