import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    @DisplayName("Add two numbers")
    void add() {
        assertAll(() -> assertEquals(6, Calculator.add(2, 2, 2)),
                () -> assertEquals(7, Calculator.add(3, 4)));
    }


    @Test
    @DisplayName("Multiply two numbers")
    void multiply() {
        assertAll(() -> assertEquals(8, Calculator.multiply(2, 2, 2)),
                () -> assertEquals(-4, Calculator.multiply(2, -2)),
                () -> assertEquals(4, Calculator.multiply(-2, -2)),
                () -> assertEquals(0, Calculator.multiply(1, 0)));
    }

    @Test
    @DisplayName("letras")
    void letras() {
        assertAll(() -> assertEquals("2a1d1e1r2t1d2a", Calculator.cadena("aaderttdaa")),
                () -> assertEquals("2a1d1e1r2t1d1a", Calculator.cadena("aaderttda")));
    }
}
