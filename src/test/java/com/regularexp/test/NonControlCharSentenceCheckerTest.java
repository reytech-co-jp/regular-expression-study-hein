package com.regularexp.test;

import com.regularexp.NonControlCharSentenceChecker;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NonControlCharSentenceCheckerTest {
    private NonControlCharSentenceChecker textCheckService = new NonControlCharSentenceChecker();

    @ParameterizedTest
    @ValueSource(strings = {
            "Good Evening!",
            "Goodnight"
    })
    void 制御文字を含まない文字列を使ったらtrueを返す(String text) {
        assertTrue(textCheckService.matchNonControlCharPattern(text));
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "\n",
            "Hello\u0007Fella",
            "Good\nEvening",
            "Good\tAfternoon",
            "Good\bMorning"
    })
    void 制御文字を含む文字列を使ったらfalseを返す(String text) {
        assertFalse(textCheckService.matchNonControlCharPattern(text));
    }
}
