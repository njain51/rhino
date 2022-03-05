
#### Few problem statements for generics

- Write a program which consists of a class which consists of a generic method which receives one generic argument and displays that argument. First pass an Integer and then a String.
   
```java
public class App {

    // define generic method
    public <T> void display(T arg) {
        System.out.println(arg);
    }

    public static void main(String[] args) {

        // call generic method with Integer argument
        App obj1 = new App();
        obj1.display(15);


        // call generic method with String argument

        App obj2 = new App();
        obj1.display("Now displaying String with Generics");

    }
}
```
```
Output:
15
Now displaying String with Generics
```

- Write a program which consists of a class which consists of a generic method which receives two generic arguments and displays it. Pass following set of arguments- a) both arguments are integers. b) one argument is Integer and second is a string. c) both arguments are strings.

```java
public class App {

    //generic method

    public <T, T1> void display(T arg1, T1 arg2) {
        System.out.println("argument1: " + arg1 + " and argument2: " + arg2);
    }

    public static void main(String[] args) {

        // call generic method with both Integer arguments
        App obj = new App();
        obj.display(15, 16);

        // call generic method with first integer and then String argument
        obj.display(15, "Now displaying String with Generics");

        // call generic method with both Strings arguments
        obj.display("First String", "Second String");


    }
}
```

```
Output:
argument1: 15 and argument2: 16
argument1: 15 and argument2: Now displaying String with Generics
argument1: First String and argument2: Second String
```

- Write a program which consists of a generic class containing two generic variables x and y. That class should contain a method which adds  two variables using + sign if two variables are integers, and concatenates two variables using + sign if two variables are strings and then displays the result. Create two objects obj1 and obj2. Obj1 should have both variables as integers and obj2 should have both variables as strings.

```java
// generic class with variable x,y
public class App<x,y> {

    //var1 and var2
    private x var1;
    private y var2;

    // define add method
    public <T,T1> void add(T var1, T1 var2){

         if (var1 instanceof Integer && var2 instanceof Integer) {

             System.out.println((int)var1  + (int)var2 );

         }

         if (var1 instanceof String && var2 instanceof String) {

             System.out.println( var1.toString()  +  var2.toString() );
         }

    }

    public static void main(String[] args) {

        App<Integer,Integer> obj1 = new App<Integer, Integer>();
        App<String,String> obj2 = new App<String, String>();

        obj1.add(15,16);
        obj1.add("a","b");

    }
}

```
```
Output:
31
ab

```
