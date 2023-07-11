package com.regularExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FourDigitSentenceChecker {

	private static final Pattern pattern = Pattern.compile("^\\d{4}");

	public boolean matchFourDigitPattern(String text) {
		Matcher matcher = pattern.matcher(text);
		return matcher.matches();
	}

}
