import org.example.Main;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainTest {

    @Test
    @DisplayName("Test 1")
    public void isLongEnoughTest_whenValueabcd1234_expectTrue() {
        System.out.println("Test of password-length:");

        //GIVEN
        String teststring = "abcd1234";

        //WHEN
        boolean actual = Main.isLongEnough(teststring);

        //THEN
        assertTrue(actual, "Der String sollte lang genug sein (mindestens 8 Zeichen).");
        System.out.println(teststring+" Testergebnis: "+actual);
    }
    @Test
    @DisplayName("Test 2")
    public void isNotLongEnoughTest_whenValueabcd123_expectFalse() {
        System.out.println("Test of password-length:");

        //GIVEN
        String teststring = "abcd123";

        //WHEN
        boolean actual = Main.isLongEnough(teststring);

        //THEN
        assertFalse(actual, "Der String sollte lang genug sein (mindestens 8 Zeichen).");
        System.out.println(teststring+" Testergebnis: "+actual);
    }
}