package main.java.collections.main.java.corejava.example_anonymous;

class Tree{

    public void grow(){
        System.out.println("Tree Growing");
    }
}

public class App {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.grow(); // this will print Tree Growing

        // define anonymous class
        Tree tree1 = new Tree(){
            @Override public void grow(){
                System.out.println("Plant growing");
            }
        };

        tree1.grow(); // this will print Plant growing since grow method is overridden  by anonymous class.




    }
}
