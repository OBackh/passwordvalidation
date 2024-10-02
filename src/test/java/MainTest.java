import org.example.Main;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainTest {

    @Test
    @DisplayName("Test isLongEnough 1")
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
    @DisplayName("Test isLongEnough 2")
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
    @Test
    @DisplayName("Test containsDigits")
    public void containsDigitsTest_whenValueHasDigits_expectTrue() {
        System.out.println("Test if password has digits:");

        //GIVEN
        String teststring = "abcd1234";

        //WHEN
        boolean actual = Main.containsDigits(teststring);

        //THEN
        assertTrue(actual, "Der String sollte auch mindestens eine Zahl beinhalten.");
        System.out.println("Enthält \""+teststring+"\" eine Zahl? Ergebnis: "+(actual? "Ja" : "Nein"));
    }
    @Test
    @DisplayName("Test containsNoDigits")
    public void containsDigitsTest_whenValueHasNoDigits_expectFalse() {
        System.out.println("Test if password has no digits:");

        //GIVEN
        String teststring = "abcdefgh";

        //WHEN
        boolean actual = Main.containsDigits(teststring);

        //THEN
        assertFalse(actual, "Der String sollte auch mindestens eine Zahl beinhalten.");
        System.out.println("Enthält \""+teststring+"\" eine Zahl? Ergebnis: "+(actual? "Ja" : "Nein"));
    }
    @Test
    @DisplayName("Test hasMixedCase")
    public void hasMixedCaseTest_whenValueHasMixedCase_expectTrue() {
        System.out.println("Test if the password contains mixed cases:");

        //GIVEN
        String teststring = "aBcDeFgH";

        //WHEN
        boolean actual = Main.hasMixedCase(teststring);

        //THEN
        assertTrue(actual, "Mindestens einen Groß- und einen Kleinbuchstaben verwenden!");
        System.out.println("Enthält \""+teststring+"\" Groß- UND Kleinbuchstaben? Ergebnis: "+(actual? "Ja" : "Nein"));
    }
    @Test
    @DisplayName("Test isCommonPassword")
    public void isCommonPasswordTest_whenValueHasCommonWords_expectFalse() {
        System.out.println("Test if the password contains common Words:");

        //GIVEN
        String teststring = "Aa345678";

        //WHEN
        boolean actual = Main.isCommonPassword(teststring);

        //THEN
        assertFalse(actual, "Bitte keine einfachen Zeichenfolgen oder üblichen Wörter verwenden!");
        System.out.println("Enthält \""+teststring+"\" übliche Zeichenfolgen oder Wörter? Ergebnis: "+(actual? "Ja" : "Nein"));
    }
    @Test
    @DisplayName("Test hasSpecialCharacters")
    public void isCommonPasswordTest_whenValueHasSpecialCharacters_expectFalse() {
        System.out.println("Test if the password contains special characters:");

        //GIVEN
        String teststring = "Abcd12345%";

        //WHEN
        boolean actual = Main.hasSpecialCharacters(teststring);

        //THEN
        assertFalse(actual, "Bitte keine Sonderzeichen verwenden!");
        System.out.println("Enthält \""+teststring+"\" Sonderzeichen? Ergebnis: "+(actual? "Ja" : "Nein"));
    }
}