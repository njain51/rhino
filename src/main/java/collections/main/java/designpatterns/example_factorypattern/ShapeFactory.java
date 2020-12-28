package main.java.collections.main.java.designpatterns.example_factorypattern;

//Create a Factory to generate object of concrete class based on given information.
public class ShapeFactory {

    //use getShape method to get object of type shape
    // This method getShape returns object of type "Shaper" which is interface but can only be instantiated by class object.
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();

        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();

        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }

        return null;
    }
}
