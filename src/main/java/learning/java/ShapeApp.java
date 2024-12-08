package learning.java;

public class ShapeApp {
    public static void main(String[] args) {
        Shape circle = new Circle(5.0);
        Shape rectangle = new Rectangle(4.0, 6.0);
        Shape square = new Square(3.0);
        Shape triangle = new Triangle(3.0, 4.0, 5.0);

        printShapeInfo("Коло", circle);
        printShapeInfo("Прямокутник", rectangle);
        printShapeInfo("Квадрат", square);
        printShapeInfo("Трикутник", triangle);
    }

    private static void printShapeInfo(String name, Shape shape) {
        System.out.println(name + ":");
        System.out.println("Площа: " + shape.calculateArea());
        System.out.println("Периметр: " + shape.calculatePerimeter());
        System.out.println();
    }
}
