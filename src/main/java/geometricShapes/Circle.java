package geometricShapes;

public class Circle extends geometricShapes.Ellipse {

    private final double radius;

    public Circle(double radius) {
        super(radius, radius); //Обеспечиваем равенство полуосей, берем одну из полуосей за радиус
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius; // Площадь круга
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius; // Длина окружности
    }
}
