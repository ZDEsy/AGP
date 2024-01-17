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
                " Datové typy v JAVA" + System.lineSeparator() +
                "--------------------------------" + System.lineSeparator() +
                "| KATEGORIE  | JMENO    | BITY |" + System.lineSeparator() +
                "--------------------------------" + System.lineSeparator() +
                "| Desetinné  | double   |   64 |" + System.lineSeparator() +
                "| Desetinné  | float    |   32 |" + System.lineSeparator() +
                "| Celé èíslo | long     |   64 |" + System.lineSeparator() +
                "| Celé èíslo | int      |   32 |" + System.lineSeparator() +
                "| Celé èíslo | short    |   16 |" + System.lineSeparator() +
                "| Celé èíslo | byte     |    8 |" + System.lineSeparator() +
                "| Celé èíslo | char     |   16 |" + System.lineSeparator() +
                "| Boolean    | boolean  |    1 |" + System.lineSeparator() +
                "--------------------------------", text.trim());
    }
}