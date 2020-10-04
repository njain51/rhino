package main.java.collections.main.java.corejava.example_interface;

public class App {
     
    public static void main(String[] args) {
         
        Machine mach1 = new Machine();  // implements Info
        mach1.start();
         
        Person person1 = new Person("Bob"); // implements Info
        person1.greet();
         
        Info info1 = new Machine();  // its referring variable of Info Interface but pointing to object of Machine class
        info1.showInfo();
         
        Info info2 = person1; // its referring variable of Info Interface but we can point to person1 object because person1 is object of Person class which is implementing Info interface.
        info2.showInfo();
         
        System.out.println();
         
        outputInfo(mach1);
        outputInfo(person1);
    }

    // Another method where we are passing Info object.Since object cannot be created for Interface so it will by default point to object of implementing class.
    // method is static since there is no App object defined

    private static void outputInfo(Info info) {
        info.showInfo();  // implementing class object can call inherited methods.

    }
 
}