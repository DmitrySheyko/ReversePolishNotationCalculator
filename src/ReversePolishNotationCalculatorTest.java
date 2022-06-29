import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReversePolishNotationCalculatorTest {


    @Test
    public void shouldCalculateAddition() {
        ReversePolishNotationCalculator calculator = new ReversePolishNotationCalculator();
        assertEquals(6, calculator.calculatePolishNotation("1 2 3 + +"));
    }

    @Test
    public void shouldCalculateSubtraction() {
        ReversePolishNotationCalculator calculator = new ReversePolishNotationCalculator();
        assertEquals(5, calculator.calculatePolishNotation("3 2 4 - -"));
    }

    @Test
    public void shouldCalculateMultiplication() {
        ReversePolishNotationCalculator calculator = new ReversePolishNotationCalculator();
        assertEquals(-18, calculator.calculatePolishNotation("3 2 -3 * *"));
    }

    @Test
    public void shouldCalculateAdditionWithSpaces() {
        ReversePolishNotationCalculator calculator = new ReversePolishNotationCalculator();
        assertEquals(5, calculator.calculatePolishNotation("  2 3 +  "));
    }
}