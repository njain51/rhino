package main.java.collections.main.java.corejava.example_annotations.three;

public class App1  extends App {

    @Override
    @SuppressWarnings("deprecation")  // This will supress warning caused by deprecation.
    public void MyMethod1() {
        System.out.println("Child Class Method");
    }

    public static void main(String[] args) {

        App1 obj1 = new App1();
        obj1.MyMethod1(); //this will print child class method since its overridden

    }
}
