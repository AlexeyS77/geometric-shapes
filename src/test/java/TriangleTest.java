package test;

import geometricShapes.Triangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TriangleTest {
    @Test
    public void testTriangleGetArea_withValidDimensions_returnsCorrectArea() {
        Triangle triangle = new Triangle(3, 4, 5); // Прямоугольный треугольник
        double area = triangle.getArea();
        assertEquals(6, area, "Площадь должна быть 6.0 при сторонах 3, 4 и 5");
    }

    @Test
    public void testTriangleGetPerimeter_withValidSides_returnsCorrectPerimeter() {
        Triangle triangle = new Triangle(3, 4, 5); // Стороны треугольника равны 3, 4 и 5
        double perimeter = triangle.getPerimeter();
        assertEquals(12, perimeter, "Периметр должен быть 12 при сторонах 3, 4 и 5");
    }

    @Test
    public void testTriangleConstructor_withZeroDimensions_throwsException() {
        Exception exception = null;
        try {
            Triangle triangle = new Triangle(0, 4, 5); // В конструкторе должно выбрасываться исключение
        } catch (Exception e) {
            exception = e;
        }
        assertNotNull(exception, "Ожидалось исключение для нулевого значения стороны");
    }

    @Test
    public void testTriangleConstructor_withNegativeDimensions_throwsException() {
        Exception exception = null;
        try {
            Triangle triangle = new Triangle(-3, 4, 5); // В конструкторе должно выбрасываться исключение
        } catch (Exception e) {
            exception = e;
        }
        assertNotNull(exception, "Ожидалось исключение для отрицательного значения стороны");
    }

    @Test
    public void testTriangleConstructor_withInvalidTriangle_throwsException() {
        Exception exception = null;
        try {
            Triangle triangle = new Triangle(1, 2, 3); // Эти стороны не могут образовать треугольник
        } catch (Exception e) {
            exception = e;
        }
        assertNotNull(exception, "Ожидалось исключение для некорректных сторон треугольника");
    }
}
