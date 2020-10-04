package main.java.collections.main.java.corejava.example_anonymous;

interface Machine {
    public void start(); //
}

public class App1 {

    public static void main(String[] args) {


        // Following snippet we are implementing itnerv=face via anonymous class
        Machine mac1 = new Machine() {
            @Override
            public void start() {
                System.out.println("Machine Started ....");
            }
        };

        mac1.start();

    }






}
