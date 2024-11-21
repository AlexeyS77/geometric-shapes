package test;

import geometricShapes.Circle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CircleTest {

    @Test
    public void testCircleGetArea_withValidRadius_returnsCorrectArea() {
        Circle circle = new Circle(5); // Радиус 5
        double area = circle.getArea();
        assertEquals(25 * Math.PI, area, "Площадь должна быть 25π при радиусе 5");
    }

    @Test
    public void testCircleGetPerimeter_withValidRadius_returnsCorrectPerimeter() {
        Circle circle = new Circle(4); // Пример с радиусом 4
        double expectedPerimeter = 2 * Math.PI * 4;
        assertEquals(expectedPerimeter, circle.getPerimeter(), 0.001);
    }

    @Test
    public void testCircleConstructor_withZeroRadius_throwsException() {
        Exception exception = null;
        try {
            Circle circle = new Circle(0); // В конструкторе должно выбрасываться исключение
        } catch (Exception e) {
            exception = e;
        }
        assertNotNull(exception, "Ожидалось исключение для нулевого радиуса");
    }

    @Test
    public void testCircleConstructor_withNegativeRadius_throwsException() {
        Exception exception = null;
        try {
            Circle circle = new Circle(-5); // В конструкторе должно выбрасываться исключение
        } catch (Exception e) {
            exception = e;
        }
        assertNotNull(exception, "Ожидалось исключение для отрицательного радиуса");
    }
}
