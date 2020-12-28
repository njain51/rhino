package main.java.collections.main.java.corejava.example_enum;

// declared enum inside class

public class Test {

    enum Color1 {
        RED , GREEN, BLACK, WHITE
    }

    public static void main(String[] args) {
        Color1 c1 = Color1.RED;
        System.out.println(c1);

    }

}
// Every enum internall implemented using class
/* internally above enum Color is converted to
class Color
{
     public static final Color RED = new Color();
     public static final Color BLUE = new Color();
     public static final Color GREEN = new Color();
}*/