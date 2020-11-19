package main.java.collections.main.java.corejava.example_annotations.two;

public class App1  extends App {

    @Override
    public void MyMethod1() {
        System.out.println("Child Class Method");
    }

    public static void main(String[] args) {

        App1 obj1 = new App1();
        obj1.MyMethod1(); //this will print child class method since its overridden

    }
}
