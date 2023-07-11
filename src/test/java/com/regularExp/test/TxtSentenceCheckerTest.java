package com.regularExp.test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.regularExp.TxtSentenceChecker;

public class TxtSentenceCheckerTest {
	
	private TxtSentenceChecker checkTextService = new TxtSentenceChecker();

	@Test
	void txtで終わる文字列を使ってテストする() {
		assertTrue(checkTextService.matchTxtPattern("Hello.txt"));
		assertTrue(checkTextService.matchTxtPattern("a.txt"));
	}

	@Test
	void txtで終わらない文字列を使ってテストする() {
		assertFalse(checkTextService.matchTxtPattern("Hello.t"));
		assertFalse(checkTextService.matchTxtPattern("Hello.txt.pdf"));
		assertFalse(checkTextService.matchTxtPattern("Hello"));
		assertFalse(checkTextService.matchTxtPattern(""));
	}
}
