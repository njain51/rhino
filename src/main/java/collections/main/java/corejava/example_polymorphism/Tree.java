package main.java.collections.main.java.corejava.example_polymorphism;


public class Tree extends Plant {

    @Override
    public void grow(){
        System.out.println("Tree Growing");
    }

    public void shedLeaves(){
        System.out.println("Shedding leaves");
    }
}
