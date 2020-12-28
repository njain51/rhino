package main.java.collections.main.java.designpatterns.example_abstractfactory;

//Create an Abstract class to get factories for Normal and Rounded Shape Objects.
public abstract class AbstractFactory {
    abstract Shape getShape(String shapeType);
}

//Create Factory classes extending AbstractFactory to generate object of concrete class based on given information.
// ShapeFactory.java
//RoundedShapeFactory.java
