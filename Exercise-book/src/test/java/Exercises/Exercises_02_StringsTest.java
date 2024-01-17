package Exercises;

import org.junit.jupiter.api.Test;

import static com.github.stefanbirkner.systemlambda.SystemLambda.*;
import static org.junit.jupiter.api.Assertions.*;

class Exercises_02_StringsTest {

    @Test
    void exercise012() throws Exception {
        withTextFromSystemIn("Petr Helesic")
                .execute(() -> assertEquals("Petr Helesic", tapSystemOut(Exercises_02_Strings::exercise012).trim()));
    }

    @Test
    void exercise015() throws Exception {
        String text = tapSystemOut(Exercises_02_Strings::exercise015);
        assertEquals("--------------------------------" + System.lineSeparator() +
                " Datov� typy v JAVA" + System.lineSeparator() +
                "--------------------------------" + System.lineSeparator() +
                "| KATEGORIE  | JMENO    | BITY |" + System.lineSeparator() +
                "--------------------------------" + System.lineSeparator() +
                "| Desetinn�  | double   |   64 |" + System.lineSeparator() +
                "| Desetinn�  | float    |   32 |" + System.lineSeparator() +
                "| Cel� ��slo | long     |   64 |" + System.lineSeparator() +
                "| Cel� ��slo | int      |   32 |" + System.lineSeparator() +
                "| Cel� ��slo | short    |   16 |" + System.lineSeparator() +
                "| Cel� ��slo | byte     |    8 |" + System.lineSeparator() +
                "| Cel� ��slo | char     |   16 |" + System.lineSeparator() +
                "| Boolean    | boolean  |    1 |" + System.lineSeparator() +
                "--------------------------------", text.trim());
    }
}