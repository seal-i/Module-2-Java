import java.util.Date;
import java.util.Scanner;

// GeometricObject class (provided)
class GeometricObject {
    private String color = "white";
    private boolean filled;
    private Date dateCreated;

    public GeometricObject() {
        dateCreated = new Date();
    }

    public GeometricObject(String color, boolean filled) {
        dateCreated = new Date();
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public String toString() {
        return "created on " + dateCreated +
               "\ncolor: " + color +
               " and filled: " + filled;
    }
}

// Triangle class extending GeometricObject
class Triangle extends GeometricObject {
    private double side1;
    private double side2;
    private double side3;

    // Default constructor
    public Triangle() {
        this(1.0, 1.0, 1.0);
    }

    // Constructor with sides
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // Getters
    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    // Area using Heron's formula
    public double getArea() {
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    // Perimeter
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public String toString() {
        return "Triangle: side1 = " + side1 +
               " side2 = " + side2 +
               " side3 = " + side3;
    }
}

// Main class with test driver
public class TriangleTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get user input
        System.out.print("Enter side1: ");
        double side1 = input.nextDouble();

        System.out.print("Enter side2: ");
        double side2 = input.nextDouble();

        System.out.print("Enter side3: ");
        double side3 = input.nextDouble();

        System.out.print("Enter the color: ");
        String color = input.next();

        System.out.print("Is the triangle filled (true/false)? ");
        boolean filled = input.nextBoolean();

        // Create triangle object
        Triangle triangle = new Triangle(side1, side2, side3);
        triangle.setColor(color);
        triangle.setFilled(filled);

        // Display triangle info
        System.out.println("\n" + triangle);
        System.out.printf("Area: %.2f\n", triangle.getArea());
        System.out.printf("Perimeter: %.2f\n", triangle.getPerimeter());
        System.out.println("Color: " + triangle.getColor());
        System.out.println("Filled: " + triangle.isFilled());
    }
}
