package Tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static com.github.stefanbirkner.systemlambda.SystemLambda.withTextFromSystemIn;
import static org.junit.jupiter.api.Assertions.*;

class Test02Test {

    @Test
    @DisplayName("101: Násobení 0")
    public void testMultiplication0() throws Exception {
        withTextFromSystemIn("0")
                .execute(() -> assertTrue(tapSystemOut(Test02::multiplication).trim().contains("wrong input")));
    }

    @Test
    @DisplayName("102: Násobení -10")
    public void testMultiplicationMinus() throws Exception {
        withTextFromSystemIn("-10")
                .execute(() -> assertTrue(tapSystemOut(Test02::multiplication).trim().contains("wrong input")));
    }

    @Test
    @DisplayName("103: Násobení 1000")
    public void testMultiplication1000() throws Exception {
        withTextFromSystemIn("1000")
                .execute(() -> assertTrue(tapSystemOut(Test02::multiplication).trim().contains("wrong input")));
    }

    @Test
    @DisplayName("104: Násobení 15")
    public void testMultiplication15() throws Exception {
        withTextFromSystemIn("15")
                .execute(() -> assertTrue(tapSystemOut(Test02::multiplication).trim().contains("15" +
                        System.lineSeparator() + "30" +
                        System.lineSeparator() + "45" +
                        System.lineSeparator() + "60" +
                        System.lineSeparator() + "75" +
                        System.lineSeparator() + "90")));
    }

    @Test
    @DisplayName("201: Prvoèísla")
    public void testPrime() throws Exception {
        withTextFromSystemIn("15")
                .execute(() -> assertTrue(tapSystemOut(Test02::primeNumbers).trim().contains("2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97")));
    }

    @Test
    @DisplayName("301: Násobení 15")
    public void testSquare1() throws Exception {
        withTextFromSystemIn("1")
                .execute(() -> assertTrue(tapSystemOut(Test02::square).trim().contains("*")));
    }

    @Test
    @DisplayName("302: Násobení 15")
    public void testSquare5() throws Exception {
        withTextFromSystemIn("5")
                .execute(() -> assertTrue(tapSystemOut(Test02::square).trim().contains("*****" +
                        System.lineSeparator() + "*   *" +
                        System.lineSeparator() + "*   *" +
                        System.lineSeparator() + "*   *" +
                        System.lineSeparator() + "*****")));
    }
}