package main.java.collections.main.java.corejava.example_tostring;
//define Frog class
class Frog{
}

// define another class

class Frog1 {
    //override toString method of object class
    public String toString(){
        return "Hello";
    }
}

// Actual code begins here

public class App {

    public static void main(String[] args) {
        Frog f1 = new Frog(); // creating object of class Frog
        Frog1 f2 = new Frog1(); // creating object of class Frog

        System.out.println(f1);
        // this will print main.java.collections.main.java.corejava.example_tostring.Frog@1b6d3586
        // which is class name and memory address
        // so by default toString() of object class is called

        System.out.println(f2);
        // this will print "Hello" since we are overriding toString method of Object class here which will be called by default.


    }


}
