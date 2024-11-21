package geometricShapes;

public class Triangle extends Shape {
    protected double sideA;
    protected double sideB;
    protected double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        // Проверка на отрицательные значения сторон
        if (!isPositiveSides(sideA, sideB, sideC)) {
            throw new IllegalArgumentException("Стороны треугольника должны быть положительными: " + sideA + ", " + sideB + ", " + sideC);
        }
        // Проверка на корректность треугольника
        if (!isValidTriangle(sideA, sideB, sideC)) {
            throw new IllegalArgumentException("Некорректные стороны треугольника: " + sideA + ", " + sideB + ", " + sideC);
        }
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    // Внутренний метод класса для проверки неравенства сторон треугольника
    private boolean isValidTriangle(double a, double b, double c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    // Внутренний метод класса для проверки на отрицательность значений сторон
    private boolean isPositiveSides(double a, double b, double c) {
        return a > 0 && b > 0 && c > 0;
    }

    @Override
    public double getArea() {
        double s = getPerimeter() / 2; // Полупериметр
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC)); // Формула Герона
    }

    @Override
    public double getPerimeter() {
        return sideA + sideB + sideC;
    }
}
