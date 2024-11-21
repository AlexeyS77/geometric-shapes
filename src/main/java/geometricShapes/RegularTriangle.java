package geometricShapes;

public class RegularTriangle extends Triangle {

    private final double side;

    public RegularTriangle(double side) {
        super(side, side, side); //Обеспечиваем равенство сторон
        this.side = side;
    }

    public double getArea() {
        return (Math.sqrt(3) / 4) * Math.pow(side, 2); // Площадь правильного треугольника
    }

    public double getPerimeter() {
        return 3 * side; // Периметр правильного треугольника
    }

}
