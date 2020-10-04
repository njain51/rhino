package main.java.collections.main.java.corejava.example_interface;

public class Machine implements Info {
     
    private int id = 7; // variable accessible to this class only.
     
    public void start() {
        System.out.println("Machine started.");
    }
 
    public void showInfo() {
        System.out.println("Machine ID is: " + id);
    }
}