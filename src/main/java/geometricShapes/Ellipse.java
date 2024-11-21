package geometricShapes;

public class Ellipse extends geometricShapes.Shape {
    private final double semiMajorAxis; // Полуось по большей стороне
    private final double semiMinorAxis; // Полуось по меньшей стороне

    public Ellipse(double semiMajorAxis, double semiMinorAxis) {
        if (validateSemiAxes(semiMajorAxis, semiMinorAxis)) {
            throw new IllegalArgumentException("Полуоси должны быть положительными и больше нуля.");
        }
        this.semiMajorAxis = semiMajorAxis;
        this.semiMinorAxis = semiMinorAxis;
    }

    // Внутренний метод класса для проверки полуосей на отрицательные значения, а также на 0
    private boolean validateSemiAxes(double semiMajorAxis, double semiMinorAxis) {
        return semiMajorAxis <= 0 || semiMinorAxis <= 0;
    }

    @Override
    public double getArea() {
        return Math.PI * semiMajorAxis * semiMinorAxis; // Площадь эллипса
    }

    @Override
    public double getPerimeter() {
        // Приближенная формула для периметра эллипса
        return Math.PI * (3 * (semiMajorAxis + semiMinorAxis) -
                Math.sqrt((3 * semiMajorAxis + semiMinorAxis) *
                        (semiMajorAxis + 3 * semiMinorAxis)));
    }

}
