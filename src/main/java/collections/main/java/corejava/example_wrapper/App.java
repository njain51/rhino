package main.java.collections.main.java.corejava.example_wrapper;

import java.sql.SQLOutput;

public class App {
    public static void main(String[] args) {

        System.out.println(Integer.valueOf("5")); //Integer is wrapper class for int and valueof is method in this wrapper class which returns object of type Integer

        Integer i1 = Integer.valueOf("5");
        System.out.println(i1.getClass()); // i1 is object of type Integer class

        // Similarly for double.
        System.out.println(Double.valueOf("3.14")); // Double is wrapper class for double and valueof is method in this class which returns object of type Double.
        Double i2 = Double.valueOf("3.14");
        System.out.println(i2.getClass()); // i2 is object of type Double class

        System.out.println(Integer.valueOf("1010101",2)); // can pass number in binary with base 2

       //example for parseXxx method
        int i3 = Integer.parseInt("4");  // it will return primitive type value int as Integer is calling function here. 
        System.out.println((i3));

        // example for xxxValue() instance method

        int i4 = i1.intValue();  // i4 is primitive and its getting value which is stored in i1 which is object of Integer class
        System.out.println(i4);

    }
}
