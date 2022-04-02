import interfaces.Shape;
import shapes.Circle;
import shapes.Rectangle;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");

        //Coding to an Interface and not the implementation
        Shape shape = new Circle(10);

        //Drawing the shape
        shape.draw();
        System.out.println("Area of Circle " + shape.getArea());

        //Switching from one implementation to another easily
        shape = new Rectangle(10,10);
        shape.draw();
        System.out.println( "Area of Rectangle = " + shape.getArea());

        //Default in the Interface
        shape.defaultTest();
    }
}
