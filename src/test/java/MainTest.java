import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class MainTest {
    @Test
    void shouldReverseLettersInMixedString() {

        assertEquals("t@eb eht av$J!123", Main.reverseLetter("J@va the be$t!123"));
    }

    @Test
    void shouldReturnEmptyStringForEmptyInput() {

        assertEquals("", Main.reverseLetter(""));
    }

    @Test
    void shouldReturnSameStringForSingleLetter() {

        assertEquals("a", Main.reverseLetter("a"));
    }

    @Test
    void shouldReturnUnchangedStringWhenNoLettersPresent() {

        assertEquals("123 !@#", Main.reverseLetter("123 !@#"));
    }

    @Test
    void shouldReverseCompletelyWhenOnlyLettersPresent() {

        assertEquals("dcba", Main.reverseLetter("abcd"));
    }

    @Test
    void shouldKeepNonLettersAtEdgesInPlace() {

        assertEquals("!a@", Main.reverseLetter("!a@"));
    }

    @Test
    void shouldPreserveLetterCaseDuringReversal() {

        assertEquals("DcBa", Main.reverseLetter("aBcD"));
    }

    @Test
    void shouldReturnNullForNullInput() {

        assertNull(Main.reverseLetter(null));
    }
}
