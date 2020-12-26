package a_review.week14;

public class Cylinder extends Shape implements hasVolume {

    double radius;
    double height;
    double volume;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
        area = calculateArea();
        perimeter = calculatePerimeter();
        volume = calculateVolume();
    }

    static {
        name = "Cylinder";
    }

    @Override
    public double calculateArea() {
        return (2 * Math.PI * radius * height) + (2 * Math.PI * Math.pow(radius, 2));
    }

    @Override
    public double calculatePerimeter() {
        return (2 * Math.PI * height) + (4 * Math.PI * Math.pow(radius, 2));
    }

    @Override
    public double calculateVolume() {
        return Math.pow(radius, 2) * height * Math.PI;
    }
}
