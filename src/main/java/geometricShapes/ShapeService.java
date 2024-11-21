package geometricShapes;



public class ShapeService {
    public static Shape[] getArrayOfSixtyShapes() {
        Shape[] shapes = new Shape[60];
        //10 прямоугольников
        for (int i = 0; i < 10; i++) {
            double width = 1 + Math.random() * 10;
            double height = 1 + Math.random() * 10;
            shapes[i] = new Rectangle(width, height);
        }
        //10 квадратов
        for (int i = 10; i < 20; i++) {
            double side = 1 + Math.random() * 10;
            shapes[i] = new Square(side);
        }
        //10 тругольников c проверкой на валидность треугольника
        for (int i = 20; i < 30; i++) {
            double sideA = 1 + Math.random() * 10;
            double sideB = 1 + Math.random() * 10;
            double sideC = 1 + Math.random() * 10;

            if ((sideA + sideB > sideC) && (sideA + sideC > sideB) && (sideB + sideC > sideA)) {
                shapes[i] = new Triangle(sideA, sideB, sideC);
            } else {
                i--; // Если треугольник невалидный, уменьшаем индекс для повторной попытки
            }
        }

        //10 правильных треугольников
        for (int i = 30; i < 40; i++) {
            double side = 1 + Math.random() * 10;
            shapes[i] = new RegularTriangle(side);
        }
        //10 еллипсов
        for (int i = 40; i < 50; i++) {
            double semiMajorAxis = 1 + Math.random() * 10;
            double semiMinorAxis = 1 + Math.random() * 10;
            //
            shapes[i] = new Ellipse(semiMajorAxis, semiMinorAxis);
        }
        //10 окружностей
        for (int i = 50; i < 60; i++) {
            double radius = 1 + Math.random() * 10;
            shapes[i] = new Circle(radius);
        }
        return shapes;
    }

    public static double calculateTotalShapeArea(Shape[] shapes) {
        double result = 0.0;
        for (Shape shape : shapes) {
            result += shape.getArea();
        }
        return result;
    }

    public static double calculateTotalShapePerimeter(Shape[] shapes) {
        double result = 0.0;
        for (Shape shape : shapes) {
            result += shape.getPerimeter();
        }
        return result;
    }

    // Рассчитываем суммарную площадь Triangle, не учитывая подтип RegularTriangle
    public static double calculateTriangleTotalArea(Shape[] shapes) {
        double result = 0.0;
        for (Shape shape : shapes) {
            if ((shape instanceof Triangle && !(shape instanceof RegularTriangle))) {
                result += shape.getArea();
            }
        }
        return result;
    }

    //Рассчитываем общий периметр Triangle, не учитывая подтип RegularTriangle
    public static double calculateTriangleTotalPerimeter(Shape[] shapes) {
        double result = 0.0;
        for (Shape shape : shapes) {
            if ((shape instanceof Triangle && !(shape instanceof RegularTriangle))) {
                result += shape.getPerimeter();
            }
        }
        return result;
    }

    // Рассчитываем суммарную площадь Rectangle, не учитывая подтип Square
    public static double calculateRectangleTotalArea(Shape[] shapes) {
        double result = 0.0;
        for (Shape shape : shapes) {
            if ((shape instanceof Rectangle && !(shape instanceof Square))) {
                result += shape.getArea();
            }
        }
        return result;
    }

    // Рассчитываем общий периметр Rectangle, не учитывая подтип Square
    public static double calculateRectangleTotalPerimeter(Shape[] shapes) {
        double result = 0.0;
        for (Shape shape : shapes) {
            if ((shape instanceof Rectangle && !(shape instanceof Square))) {
                result += shape.getPerimeter();
            }
        }
        return result;
    }


}

