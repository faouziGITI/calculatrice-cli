
package dz.univ.calculatrice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DivideOperationTest {

    private final DivideOperation operation = new DivideOperation();

    @Test
    void shouldDivideTwoPositiveNumbers() {
        assertEquals(5.0, operation.execute(10.0, 2.0));
    }

    @Test
    void shouldDivideAndReturnDecimalResult() {
        assertEquals(3.5, operation.execute(7.0, 2.0));
    }

    @Test
    void shouldDivideZeroByPositiveNumber() {
        assertEquals(0.0, operation.execute(0.0, 5.0));
    }

    @Test
    void shouldDivideNegativeNumbers() {
        assertEquals(-5.0, operation.execute(-10.0, 2.0));
    }

    @Test
    void shouldThrowExceptionWhenDividingByZero() {
        assertThrows(ArithmeticException.class,
                () -> operation.execute(10.0, 0.0));
    }

    @Test
    void shouldReturnDivisionSymbol() {
        assertEquals("/", operation.symbol());
    }
}
