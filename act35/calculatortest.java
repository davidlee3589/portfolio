import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    
    @Test
    public void testAddPositiveNumbers() {
        Calculator calc = new Calculator();
        int result = calc.add(2, 3);
        assertEquals(5, result);
    }
    
    @Test
    public void testAddNegativeNumbers() {
        Calculator calc = new Calculator();
        int result = calc.add(-2, -3);
        assertEquals(-5, result);
    }
}
