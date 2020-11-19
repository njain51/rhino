package main.java.collections.main.java.corejava.example_static;

public class App {

    //define static variable and reference through class

    static String str = "this is static varialbe";

    public static void main(String[] args) {

        System.out.println(App.str); // static variable directly referenced by class name.
        App obj1 = new App(); // created object  of App class
        System.out.println(obj1.toString()); // will print object reference address
        System.out.println(obj1.str); // to print static variable value using object of this class
        System.out.println(obj1.str.length()); // will print length of variable value.

    }





}
