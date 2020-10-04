package main.java.collections.main.java.examples_collections.examples_list;
import  java.util.*;

public class SampleArrayList {



    public static void main(String[] args) {


        ArrayList al = new ArrayList(10);   //Template type is not defined hence it wil be considered as Object by default.

        System.out.println(al); // this will not print Object Reference id but blank array.
        System.out.println(al.size()); // size of element of array. it will print 0 since no element

        al.add(10);
        al.add(5);
        al.add(2,15);
        al.add(5);
        al.add(15);
        al.add(25);
        al.add(35);


        System.out.println(al.size()); // size will be 3 since thre are 3 elements in list.
        System.out.println(al);  // print ArrayList

        System.out.println(al.contains(3)); // check if it contains 3

        System.out.println("Iteration# 1: Print complete list using for loop" );
        for(int i=0;i< al.size(); i++){
            System.out.println(al.get(i));

        }
        System.out.println("Iteration# 2: Another way to iterate through list" );
        for( Object value: al ) {
            System.out.println(value);
        }

        System.out.println("Iteration# 3: Remvoed first item from list");
        al.remove(0);  // remove item from beginning is slow
        System.out.println(al);

        al.remove((al.size() -1)); // removing item from last is fast compared to beginning. if we need to remvoe from middle then better use linked list.
        System.out.println(al);

        System.out.println("Iteration# 4 List can be defined as follows");
        List<String> str = new ArrayList<String>(); // this is valid since ArrayList is implementation of List(I) only.str can point to anything that implements List interface.






    }

}
