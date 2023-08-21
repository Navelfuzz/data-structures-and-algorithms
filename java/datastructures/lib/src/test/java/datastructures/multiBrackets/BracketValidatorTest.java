package datastructures.multiBrackets;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BracketValidatorTest {

    @Test
    void testValidBrackets() {
        assertTrue(BracketValidator.validateBrackets("{}"));
        assertTrue(BracketValidator.validateBrackets("{}(){}"));
        assertTrue(BracketValidator.validateBrackets("()[[Extra Characters]]"));
        assertTrue(BracketValidator.validateBrackets("(){}[[]]"));
        assertTrue(BracketValidator.validateBrackets("{}{Code}[Fellows](())"));
    }

    @Test
    void testInvalidBrackets() {
        assertFalse(BracketValidator.validateBrackets("[({}]"));
        assertFalse(BracketValidator.validateBrackets("(]"));
        assertFalse(BracketValidator.validateBrackets("{(})"));
    }
}
