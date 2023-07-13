package com.regularexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TxtSentenceChecker {

	private static final Pattern pattern = Pattern.compile(".*\\.txt$");
	
	public boolean matchTxtPattern(String text) {
		Matcher matcher = pattern.matcher(text);
		return matcher.matches();
	}

}
