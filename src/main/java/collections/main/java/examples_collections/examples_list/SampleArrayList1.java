package main.java.collections.main.java.examples_collections.examples_list;

import java.util.*;

public class SampleArrayList1 {

    public static void main(String[] args) {

        // define a simple ArrayList and do add delete operations to it.
        // define another ArrayList and add previous list

        ArrayList<Integer>  A1 = new ArrayList<>();
        ArrayList<Integer>  B1 = new ArrayList<>();
        System.out.println("First Array List is "+A1 +"Second Arrray List is " +B1);
        A1.add(4);
        A1.add(10);
        A1.add(16);
        A1.add(19);
        B1.add(12);
        B1.addAll(A1);
        System.out.println("Operations Performed on Array");
        System.out.println("First Array List is "+A1 +"Second Array List is " +B1);


    }

}
