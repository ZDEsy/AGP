package Exercises;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.*;

class Exercises_01_DataTypesTest {

    @Test
    @DisplayName("00: Hello world")
    void helloWorld() throws Exception {
        String text = tapSystemOut(Exercises_01_DataTypes::helloWorld);
        assertEquals("Hello world!", text.trim());
    }

    @Test
    @DisplayName("01: Name of teacher")
    void nameOfTeacher() throws Exception {
        String text = tapSystemOut(Exercises_01_DataTypes::nameOfTeacher);
        assertEquals("Petr Helešic", text.trim());
    }

    @Test
    @DisplayName("02: Namespace")
    void exercise002() throws Exception {
        String text = tapSystemOut(Exercises_01_DataTypes::exercise002);
        assertEquals("25" + System.lineSeparator() + "Hello world!", text.trim());

    }

    @Test
    @DisplayName("03: Data type: byte")
    void exercise003() throws Exception {
        String text = tapSystemOut(Exercises_01_DataTypes::exercise003);
        assertEquals("10" + System.lineSeparator() + "40" + System.lineSeparator() + "128", text.trim());
    }

    @Test
    @DisplayName("05: Integer")
    void exercise005() throws Exception {
        String text = tapSystemOut(Exercises_01_DataTypes::exercise005);
        String result = "" + (-327 + 542) + System.lineSeparator() +
                (-327 - 542) + System.lineSeparator() +
                (-327 * 542) + System.lineSeparator() +
                (-327 / 542);
        assertEquals(result, text.trim());
    }

    @Test
    @DisplayName("06: Integer II")
    void exercise006() throws Exception {
        String text = tapSystemOut(Exercises_01_DataTypes::exercise006);
        assertEquals("56567" + System.lineSeparator() + "101100110" +
                System.lineSeparator() + "1011" + System.lineSeparator() + "10110011000000", text.trim());
    }

    @Test
    @DisplayName("07: Integer III")
    void exercise007() throws Exception{
        String text = tapSystemOut(Exercises_01_DataTypes::exercise007);
        assertEquals("386530" + System.lineSeparator() + "386531" +
                System.lineSeparator() + "386530", text.trim());

    }

    @Test
    @DisplayName("08: Integer - Boolean")
    void exercise008() throws Exception {
        String text = tapSystemOut(Exercises_01_DataTypes::exercise008);
        assertEquals("true", text.trim());
    }

    @Test
    @DisplayName("10: Double, Float")
    void exercise010() throws Exception {
        String text = tapSystemOut(Exercises_01_DataTypes::exercise010);
        assertEquals("1.12345678" + System.lineSeparator() + "1.1234568" +
                System.lineSeparator() + "8.826087", text.trim());
    }

    @Test
    @DisplayName("11: Char")
    void exercise011() throws Exception {
        String text = tapSystemOut(Exercises_01_DataTypes::exercise011);
        assertEquals("97" + System.lineSeparator() + "a", text.trim());
    }
}