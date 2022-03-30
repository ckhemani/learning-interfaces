package shapes;

import interfaces.Shape;

public class Circle implements Shape {

    private final double radius;

    public Circle(double radius){
        this.radius= radius;
    }

    @Override
    public void draw() {
        System.out.println(LABEL + " Drawing Circle!");
    }

    @Override
    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    public double getRadius(){
        return getRadius();
    }
}
