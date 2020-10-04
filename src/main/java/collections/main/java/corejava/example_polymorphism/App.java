package main.java.collections.main.java.corejava.example_polymorphism;

public class App {

    public static void main(String[] args) {

        Plant plant = new Plant();
        Tree tree = new Tree();

        Plant plant2 = tree;// plant2 is referring to tree object which is child class of plant..

        tree.grow(); // it will call grow method in Tree class
        plant.grow();  // it will call grow method in Plant class
        plant2.grow(); // it will call grow method in Tree class

        tree.shedLeaves(); //tree object calling Tree class method.
        // plant.shedLeaves()  this will not work since plant object has no access to Tree method.
        //plant2.shedLeaves() wont's work too since plant2 is plant reference so at time of loading the class, it will still not know about Tree methods.

        //- it's the variable refrence of the class which tells which method to be called.
        //But its the object reference to which variable is pointing which will decide which method would be executed - the child method implementation or parent method with same name.

        // next we create following:
        Plant plant3; // plant3 should know what methods it can call.

        doGrow(tree); // first thing doGrow is static method called from another static method so no object is needed. Second since we are passing tree object so now it will
                     // invoke grow method of tree

    }

    public static  void doGrow(Plant plant){
        plant.grow(); //  plant object already contains grow method so we can call grow() method to it.
    }


}
