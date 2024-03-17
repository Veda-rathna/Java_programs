abstract class Shape {
    protected int side1;
    protected int side2;

    public Shape(int side1, int side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    public abstract void printArea();

    public abstract void printNumberOfSides();
}

class Rectangle extends Shape {
    public Rectangle(int length, int width) {
        super(length, width);
    }

    @Override
    public void printArea() {
        System.out.println("Area of Rectangle: " + (side1 * side2));
    }

    @Override
    public void printNumberOfSides() {
        System.out.println("Number of sides of Rectangle: 4");
    }
}

class Triangle extends Shape {
    public Triangle(int base, int height) {
        super(base, height);
    }

    @Override
    public void printArea() {
        System.out.println("Area of Triangle: " + (0.5 * side1 * side2));
    }

    @Override
    public void printNumberOfSides() {
        System.out.println("Number of sides of Triangle: 3");
    }
}

class Circle extends Shape {
    public Circle(int radius) {
        super(radius, radius);
    }

    @Override
    public void printArea() {
        System.out.println("Area of Circle: " + (Math.PI * side1 * side1));
    }

    @Override
    public void printNumberOfSides() {
        System.out.println("Number of sides of Circle: 0");
    }
}

public class Shapes {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4, 5);
        rectangle.printArea();
        rectangle.printNumberOfSides();

        Triangle triangle = new Triangle(3, 6);
        triangle.printArea();
        triangle.printNumberOfSides();

        Circle circle = new Circle(7);
        circle.printArea();
        circle.printNumberOfSides();
    }
}
