package ss07_abstract_class_and_interface.bai_tap.implement_colorable_interface_for_geometry_assignment_classes;

public class Circle extends Shape {
    private double radius;
    public Circle() {
        this(1.0);
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }
    public double getRadius () {
        return this.radius;
    }
    public void setRadius (double radius) {
        this.radius = radius;
    }
    public double getArea () {
        return this.radius * this.radius * Math.PI;
    }
    public double getPerimeter () {
        return 2 * this.radius * Math.PI;
    }
    @Override
    public String toString () {
        return "A Circle with radius = " + getRadius() + ", which is a subclass of " + super.toString();
    }
}