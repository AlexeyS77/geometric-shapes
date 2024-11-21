package test;

import geometricShapes.Square;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class SquareTest {

    @Test
    public void testSquareGetArea_withValidSide_returnsCorrectArea() {
        Square square = new Square(5);
        double area = square.getArea();
        assertEquals(25, area, "Площадь должна быть 25.0 при стороне 5.0");
    }

    //дописать метод для перимерта
    @Test
    public void testSquareGetPerimeter_withValidSide_returnsCorrectPerimeter() {
        Square square = new Square(5.0);
        double perimeter = square.getPerimeter();
        assertEquals(20.0, perimeter, "Периметер должен быть 20.0 при стороне 5.0");
    }

    @Test
    public void testSquareConstructor_withZeroSide_throwsException() {
        Exception exception = null;
        try {
            Square square = new Square(0); // В конструкторе выбрасывается исключение
        } catch (Exception e) {
            exception = e;
        }
        assertNotNull(exception, "Ожидалось исключение для нулевого значения стороны");
    }

    @Test
    public void testSquareConstructor_withNegativeSide_throwsException() {
        Exception exception = null;
        try {
            Square square = new Square(-5); // В конструкторе выбрасывается исключение
        } catch (Exception e) {
            exception = e;
        }
        assertNotNull(exception, "Ожидалось исключение для отрицательного значения стороны");
    }


}
