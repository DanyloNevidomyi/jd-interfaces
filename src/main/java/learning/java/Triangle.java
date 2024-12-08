package learning.java;

public class Triangle implements Shape {
    private double a, b, c; // сторони трикутника

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double calculateArea() {
        double s = (a + b + c) / 2; // напівпериметр
        return Math.sqrt(s * (s - a) * (s - b) * (s - c)); // формула Герона
    }

    @Override
    public double calculatePerimeter() {
        return a + b + c;
    }
}