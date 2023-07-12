package com.regularexp.test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.regularexp.HiraganaSentenceChecker;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class HiraganaSentenceCheckerTest {
    private HiraganaSentenceChecker textCheckService = new HiraganaSentenceChecker();

    @ParameterizedTest
    @ValueSource(strings = {
            "あいうえお",
            "かきくけこ",
            "さしすせそ"
    })
    void 文字列はひらがなである場合trueを返すこと(String text) {
        assertTrue(textCheckService.matchHiraganaPattern(text));
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "",
            "アイウエオ",
            "ｱｲｳｴｵ",
            "漢字",
            "12345",
            "abc",
            "ABC"
    })
    void 文字列はひらがなではない場合falseを返すこと(String text) {
        assertFalse(textCheckService.matchHiraganaPattern(text));
    }
}
