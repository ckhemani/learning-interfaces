package shapes;

import interfaces.Shape;

public class Rectangle implements Shape {

    private final double width;
    private final double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println(LABEL + " Drawing Rectangle");
    }

    @Override
    public double getArea() {
        return this.height * this.width;
    }
}
