package com.regularExp.test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.regularExp.FourDigitSentenceChecker;

public class FourDigitSentenceCheckerTest {
	
	private FourDigitSentenceChecker textCheckService = new FourDigitSentenceChecker();

	@Test
	void 四桁の半角数字の文字列を使ってテストする() {
		assertTrue(textCheckService.matchFourDigitPattern("1234"));
		assertTrue(textCheckService.matchFourDigitPattern("1998"));
	}
	
	@Test
	void 四桁の半角数字ではない文字列を使ってテストする() {
		assertFalse(textCheckService.matchFourDigitPattern("123456"));
		assertFalse(textCheckService.matchFourDigitPattern("123"));
		assertFalse(textCheckService.matchFourDigitPattern("12"));
		assertFalse(textCheckService.matchFourDigitPattern("0"));
		assertFalse(textCheckService.matchFourDigitPattern(""));
	}

}
