package interfaces;

public interface Shape {
    //Implicitly public, static and final
    String LABEL = "Shape";

    // Interface methods are implicit abstract and public by default
    void draw();

    double getArea();

    //Default
    default void defaultTest(){
        System.out.println("I am a default method in the shape interface implementation!");
    }
}
