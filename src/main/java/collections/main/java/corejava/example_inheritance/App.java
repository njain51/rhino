package main.java.collections.main.java.corejava.example_inheritance;

public class App {
    public static void main(String[] args) {
        //create object of Machine class and run its methods
        Machine m1 = new Machine();

        // print Machine methods output:
        m1.start();
        m1.stop();

        // Create instance of empty Car class which is inheriting Machine class, it will print same output unless method is overridden in child class.
        // here we are overriding start and stop method only so for running method output will remain same.
        Car c1 = new Car();
        c1.start();
        c1.running();
        c1.stop();


    }


}
