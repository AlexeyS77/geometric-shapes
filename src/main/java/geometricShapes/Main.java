package geometricShapes;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = ShapeService.getArrayOfSixtyShapes();
        System.out.println(ShapeService.calculateTotalShapeArea(shapes));
        System.out.println(ShapeService.calculateTotalShapePerimeter(shapes));
        System.out.println(ShapeService.calculateTriangleTotalArea(shapes));
        System.out.println(ShapeService.calculateTriangleTotalPerimeter(shapes));
        System.out.println(ShapeService.calculateRectangleTotalArea(shapes));
        System.out.println(ShapeService.calculateRectangleTotalPerimeter(shapes));

    }
}