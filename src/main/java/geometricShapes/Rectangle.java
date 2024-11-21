package geometricShapes;

public class Rectangle extends Shape {
    private final double width;
    private final double height;

    public Rectangle(double width, double height) {
        if (!validateDimensions(width, height)) {
            throw new IllegalArgumentException("Значения сторон не могут быть отрицательными или равными 0.");
        }
        this.height = height;
        this.width = width;
    }

    //Метод для проверки сторон прямоугольника на отрицательные значения, а также на 0
    private boolean validateDimensions(double width, double height) {
        return width > 0 && height > 0;
    }


    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }
}
