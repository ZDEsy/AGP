package Tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static com.github.stefanbirkner.systemlambda.SystemLambda.withTextFromSystemIn;
import static org.junit.jupiter.api.Assertions.*;


class Test01Test {

    @Test
    @DisplayName("101: Pismeno a")
    public void testLowercaseLetterA() throws Exception {
        withTextFromSystemIn("a")
                .execute(() -> assertTrue(tapSystemOut(Test01::characterRecognition).trim().contains("Zadany znak je: male pismeno a")));
    }

    @Test
    @DisplayName("102: Pismeno z")
    public void testLowercaseLetterZ() throws Exception {
        withTextFromSystemIn("z")
                .execute(() -> assertTrue(tapSystemOut(Test01::characterRecognition).trim().contains("Zadany znak je: male pismeno z")));
    }

    @Test
    @DisplayName("103: Pismeno A")
    public void testUppercaseLetterA() throws Exception {
        withTextFromSystemIn("A")
                .execute(() -> assertTrue(tapSystemOut(Test01::characterRecognition).trim().contains("Zadany znak je: velke pismeno A")));
    }

    @Test
    @DisplayName("104: Pismeno Z")
    public void testUppercaseLetterZ() throws Exception {
        withTextFromSystemIn("Z")
                .execute(() -> assertTrue(tapSystemOut(Test01::characterRecognition).trim().contains("Zadany znak je: velke pismeno Z")));
    }

    @Test
    @DisplayName("105: Cislo 5")
    public void testDigit() throws Exception {
        withTextFromSystemIn("5")
                .execute(() -> assertTrue(tapSystemOut(Test01::characterRecognition).trim().contains("Zadany znak je: cislice 5")));
    }

    @Test
    @DisplayName("106: Znak !")
    public void testSpecialCharacterExclamation() throws Exception {
        withTextFromSystemIn("!")
                .execute(() -> assertTrue(tapSystemOut(Test01::characterRecognition).trim().contains("Zadany znak je: vykricnik")));
    }

    @Test
    @DisplayName("107: Znak ?")
    public void testSpecialCharacterQuestionMark() throws Exception {
        withTextFromSystemIn("?")
                .execute(() -> assertTrue(tapSystemOut(Test01::characterRecognition).trim().contains("Zadany znak je: otaznik")));
    }

    @Test
    @DisplayName("108: Znak *")
    public void testSpecialCharacterStar() throws Exception {
        withTextFromSystemIn("*")
                .execute(() -> assertTrue(tapSystemOut(Test01::characterRecognition).trim().contains("Zadany znak je: hvezdicka")));
    }

    @Test
    @DisplayName("109: Znak @")
    public void testSpecialCharacterAt() throws Exception {
        withTextFromSystemIn("@")
                .execute(() -> assertTrue(tapSystemOut(Test01::characterRecognition).trim().contains("Zadany znak je: zavinac")));
    }

    @Test
    @DisplayName("110: Znak #")
    public void testSpecialCharacterHash() throws Exception {
        withTextFromSystemIn("#")
                .execute(() -> assertTrue(tapSystemOut(Test01::characterRecognition).trim().contains("Zadany znak je: krizek")));
    }

    @Test
    @DisplayName("111: Znak ^")
    public void testSpecialCharacterCaret() throws Exception {
        withTextFromSystemIn("^")
                .execute(() -> assertTrue(tapSystemOut(Test01::characterRecognition).trim().contains("Zadany znak je: striska")));
    }

    @Test
    @DisplayName("112: Znak %")
    public void testOtherCharacterPercent() throws Exception {
        withTextFromSystemIn("%")
                .execute(() -> assertTrue(tapSystemOut(Test01::characterRecognition).trim().contains("Zadany znak je: jiny znak")));
    }

    @Test
    @DisplayName("113: Znak }")
    public void testOtherCharacterBracket() throws Exception {
        withTextFromSystemIn("}")
                .execute(() -> assertTrue(tapSystemOut(Test01::characterRecognition).trim().contains("Zadany znak je: jiny znak")));
    }

    @Test
    @DisplayName("201: Nejvìtší èíslo")
    void determiningTheGreatestNumber1() throws Exception {
        withTextFromSystemIn("3", "5", "8")
                .execute(() -> {
                    assertTrue(tapSystemOut(Test01::determiningTheGreatestNumber).trim().contains("Nejvìtší èíslo je: 8"));

                });
    }
    @Test
    @DisplayName("202: Nejvìtší èíslo")
    void determiningTheGreatestNumber2() throws Exception {
        withTextFromSystemIn("5", "3", "8")
                .execute(() -> {
                    assertTrue(tapSystemOut(Test01::determiningTheGreatestNumber).trim().contains("Nejvìtší èíslo je: 8"));

                });
    }
    @Test
    @DisplayName("203: Nejvìtší èíslo")
    void determiningTheGreatestNumber3() throws Exception {
        withTextFromSystemIn("8", "5", "3")
                .execute(() -> {
                    assertTrue(tapSystemOut(Test01::determiningTheGreatestNumber).trim().contains("Nejvìtší èíslo je: 8"));

                });
    }
    @Test
    @DisplayName("204: Nejvìtší èíslo")
    void determiningTheGreatestNumber4() throws Exception {
        withTextFromSystemIn("3", "8", "5")
                .execute(() -> {
                    assertTrue(tapSystemOut(Test01::determiningTheGreatestNumber).trim().contains("Nejvìtší èíslo je: 8"));

                });
    }
    @Test
    @DisplayName("205: Nejvìtší èíslo")
    void determiningTheGreatestNumber5() throws Exception {
        withTextFromSystemIn("8", "3", "5")
                .execute(() -> {
                    assertTrue(tapSystemOut(Test01::determiningTheGreatestNumber).trim().contains("Nejvìtší èíslo je: 8"));

                });
    }
    @Test
    @DisplayName("206: Nejvìtší èíslo")
    void determiningTheGreatestNumber6() throws Exception {
        withTextFromSystemIn("5", "8", "3")
                .execute(() -> {
                    assertTrue(tapSystemOut(Test01::determiningTheGreatestNumber).trim().contains("Nejvìtší èíslo je: 8"));

                });
    }
}