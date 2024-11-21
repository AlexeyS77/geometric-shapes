package test;

import geometricShapes.Rectangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class RectangleTest {

    @Test
    public void testRectangleGetArea_withValidDimensions_returnsCorrectArea() {
        Rectangle rectangle = new Rectangle(5.0, 10.0);
        double area = rectangle.getArea();
        assertEquals(50.0, area, 0.001, "Площадь должна быть 50.0 при ширине 5.0 и высоте 10.0");
    }

    @Test
    public void testRectangleGetPerimeter_withValidDimensions_returnsCorrectPerimeter() {
        Rectangle rectangle = new Rectangle(5.0, 3.0);
        double perimeter = rectangle.getPerimeter();
        assertEquals(16.0, perimeter, 0.001, "Периметр должен быть 16.0 при ширине 5.0 и высоте 10.0");
    }

    @Test
    public void testRectangleConstructor_withZeroDimensions_throwsException() {
        Exception exception = null;
        try {
            Rectangle rectangle = new Rectangle(0, 10); // В кострукторе выбрасывается исключение
        } catch (Exception e) {
            exception = e;
        }
        // Используем статический метод Assertions.assertNotNull(). Если исключение не было выброшено, переменная exception останется равной null
        assertNotNull(exception, "Ожидалось исключение для нулевого значения ширины");
    }

    @Test
    public void testRectangleConstructor_withNegativeDimensions_throwsException() {
        Exception exception = null;
        try {
            Rectangle rectangle = new Rectangle(-5, 10); // В кострукторе выбрасывается исключение
        } catch (Exception e) {
            exception = e;
        }
        // Используем статический метод Assertions.assertNotNull(). Если исключение не было выброшено, переменная exception останется равной null
        assertNotNull(exception, "Ожидалось исключение для отрицательного значения ширины");
    }
}
