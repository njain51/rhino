package main.java.collections.main.java.corejava.example_abstract;

public class App {
 
    public static void main(String[] args) {
        Camera cam1 = new Camera();  // we are not instantiating Machine class which is Abstract but only Car and Camera which are child classes.
        cam1.setId(5);
         
        Car car1 = new Car();
        car1.setId(4);

        Machine car2= new Car(); // this is perfectly valid as we can use reference of abstract class.
         
        car1.run();
        car2.run();

        //Machine machine1 = new Machine();
    }
 
}