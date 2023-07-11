package com.regularExp.test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.regularExp.FourDigitSentenceChecker;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class FourDigitSentenceCheckerTest {
	
	private FourDigitSentenceChecker textCheckService = new FourDigitSentenceChecker();

	@ParameterizedTest
	@ValueSource(strings = {
			"1234",
			"1998"
	})
	void 四桁の半角数字の文字列を使ったらtrueを返すこと(String text) {
		assertTrue(textCheckService.matchFourDigitPattern(text));
	}
	
	@ParameterizedTest
	@ValueSource(strings = {
			"123456",
			"123",
			"12",
			"0",
			""
	})
	void 四桁の半角数字ではない文字列を使ったらfalseを返すこと(String text) {
		assertFalse(textCheckService.matchFourDigitPattern(text));
	}

}
