package test;

import geometricShapes.Ellipse;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class EllipseTest {

    @Test
    public void testEllipseGetArea_withValidDimensions_returnsCorrectArea() {
        Ellipse ellipse = new Ellipse(5.0, 3.0); // Полуоси 5.0 и 3.0
        double area = ellipse.getArea();
        assertEquals(15 * Math.PI, area, 0.001, "Площадь должна быть 15π при полуосях 5 и 3");
    }

    @Test
    public void testEllipseGetPerimeter_withValidDimensions_returnsCorrectPerimeter() {
        Ellipse ellipse = new Ellipse(5, 3); // Пример с полуосями 5 и 3
        double expectedPerimeter = Math.PI * (3 * (5 + 3) - Math.sqrt((3 * 5 + 3) * (5 + 3 * 3)));
        assertEquals(expectedPerimeter, ellipse.getPerimeter(), 0.001);
    }


    @Test
    public void testEllipseConstructor_withZeroSemiMajorAxis_throwsException() {
        Exception exception = null;
        try {
            Ellipse ellipse = new Ellipse(0, 3); // В конструкторе выбрасывается исключение
        } catch (Exception e) {
            exception = e;
        }
        assertNotNull(exception, "Ожидалось исключение для нулевой полуоси");
    }

    @Test
    public void testEllipseConstructor_withZeroSemiMinorAxis_throwsException() {
        Exception exception = null;
        try {
            Ellipse ellipse = new Ellipse(5, 0); // В конструкторе выбрасывается исключение
        } catch (Exception e) {
            exception = e;
        }
        assertNotNull(exception, "Ожидалось исключение для нулевой полуоси");
    }

    @Test
    public void testEllipseConstructor_withNegativeSemiMajorAxis_throwsException() {
        Exception exception = null;
        try {
            Ellipse ellipse = new Ellipse(-5, 3); // В конструкторе должно выбрасываться исключение
        } catch (Exception e) {
            exception = e;
        }
        assertNotNull(exception, "Ожидалось исключение для отрицательной полуоси");
    }

    @Test
    public void testEllipseConstructor_withNegativeSemiMinorAxis_throwsException() {
        Exception exception = null;
        try {
            Ellipse ellipse = new Ellipse(5, -3); // В конструкторе выбрасывается исключение
        } catch (Exception e) {
            exception = e;
        }
        assertNotNull(exception, "Ожидалось исключение для отрицательной полуоси");
    }
}

