package geometricShapes;

public class Square extends Rectangle {

    private final double side;

    // Обеспечиваем равенство сторон квадрата при вывозове конструктора и инициализируем поле side
    public Square(double side) {
        super(side, side);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }


}

