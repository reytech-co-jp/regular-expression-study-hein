package com.regularexp.test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.regularexp.TxtSentenceChecker;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class TxtSentenceCheckerTest {
	
	private TxtSentenceChecker checkTextService = new TxtSentenceChecker();

	@ParameterizedTest
	@ValueSource(strings = {
			"Hello.txt",
			"a.txt"
	})
	void txtで終わる文字列を使ったらtrueを返すこと(String text) {
		assertTrue(checkTextService.matchTxtPattern(text));
	}

	@ParameterizedTest
	@ValueSource(strings = {
			"Hello.t",
			"Hello.txt.pdf",
			"Hello",
			""
	})
	void txtで終わらない文字列を使ったらfalseを返すこと(String text) {
		assertFalse(checkTextService.matchTxtPattern(text));
	}
}
