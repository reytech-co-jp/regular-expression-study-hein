package com.regularExp.test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


import com.regularExp.DateFormatSentenceChecker;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class DateFormatSentenceCheckerTest {
    private DateFormatSentenceChecker textCheckService = new DateFormatSentenceChecker();

    @ParameterizedTest
    @ValueSource(strings = {
            "2023-07-11",
            "2022-08-08"
    })
    void 正しい日程文字列を使ったらtrueを返すこと(String text) {
        assertTrue(textCheckService.matchDateFormatPattern(text));
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "",
            "1",
            "6-4",
            "1-3-8",
            "6-3-12",
            "7-11-30",
            "23-091-20",
            "566-11-25",
            "2000-6-4",
            "2000-10-3",
            "2000-109-03",
            "2000-15-30",
            "2022-10-50"
    })
    void 正しくない日程文字列を使ったらfalseを返すこと(String text) {
        assertFalse(textCheckService.matchDateFormatPattern(text));
    }
}
