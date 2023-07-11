package com.regularExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FourDigitSentenceChecker {

	private static final String FOUR_DIGIT_REGEX = "^\\d{4}";
	
	public boolean matchFourDigitPattern(String text) {
		Pattern pattern = Pattern.compile(FOUR_DIGIT_REGEX);
		Matcher matcher = pattern.matcher(text);
		return matcher.matches();
	}

}
