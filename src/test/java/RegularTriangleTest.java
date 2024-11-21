package test;

import geometricShapes.RegularTriangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class RegularTriangleTest {

    @Test
    public void testRegularTriangleGetArea_withValidSides_returnsCorrectArea() {
        RegularTriangle triangle = new RegularTriangle(4); // Сторона равна 4
        double area = triangle.getArea();
        assertEquals(6.928203230275509, area, "Площадь должна быть 6.928 при стороне 4");
    }

    @Test
    public void testRegularTriangleGetPerimeter_withValidSides_returnsCorrectPerimeter() {
        RegularTriangle triangle = new RegularTriangle(4); // Сторона равна 4
        double perimeter = triangle.getPerimeter();
        assertEquals(12, perimeter, "Периметр должен быть 12 при стороне 4");
    }

    @Test
    public void testRegularTriangleConstructor_withZeroSide_throwsException() {
        Exception exception = null;
        try {
            RegularTriangle triangle = new RegularTriangle(0); // В конструкторе должно выбрасываться исключение
        } catch (Exception e) {
            exception = e;
        }
        assertNotNull(exception, "Ожидалось исключение для нулевого значения стороны");
    }

    @Test
    public void testRegularTriangleConstructor_withNegativeSide_throwsException() {
        Exception exception = null;
        try {
            RegularTriangle triangle = new RegularTriangle(-3); // В конструкторе должно выбрасываться исключение
        } catch (Exception e) {
            exception = e;
        }
        assertNotNull(exception, "Ожидалось исключение для отрицательного значения стороны");
    }
}
