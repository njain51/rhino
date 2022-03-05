
# Assignment-

1) What will be the output of the following program and why ?

```java
abstract class Test {
   private double price;
   private String model;
   private String year;
   public abstract void goFast();    
   public abstract void changeColor(); 
}
```
// Nothing since no main. Abstract class can have Abstract and Non abstract variable and methods. 

2. Is there any compile error in below code ? Why ?

```java
class Test {
   private double price;
   private String model;
   private String year;
   public abstract void goFast();    
   public abstract void changeColor(); 
}
```

Nope, Abstract class can have Abstract and Non abstract variable and methods.


3) Is there any compile error in below code ? If yes, then why ? If not, then why not ?

```java
abstract class Test {
   private double price;
   private String model;
   private String year;
   public abstract void goFast()
    {
      int speed=100;
    }   
   public abstract void changeColor(); 
}
```
Error since Abstract methods cannot have body. 

4) Is there any compile error in below code ? If yes, then why ? If not, then why not ?

```java
abstract class Test {
   private double price;
   private String model;
   private String year;
   public void goFast()
    {
      int speed=100;
    }   
   public abstract void changeColor(); 
}
```

No Error, since  Abstract class can have Abstract and Non abstract variable and methods.

5. What will be the output of the following program and why ?

```java
abstract class Test1 {
   abstract void m();   
}
class Test extends Test1 {   
   void m() {
      int i=10;
      i=i+5;
      System.out.println("i="+i);
   }
  public static void main(String args[])
   {
      Test obj=new Test();
      obj.m();
   }
}
```
i=15 // child clas will implement Abstract class method. 


6) What will be the output of the following program and why ?

```java
abstract class Test1 {
   abstract void m();   
}
class Test extends Test1 {   
   void m() {
      int i=10;
      i=i+5;
      System.out.println("i="+i);
   }
  public static void main(String args[])
   {
      Test1 obj=new Test1();
      obj.m();
   }
}
```

Compilation error since we cannot create an object of Abstract class but only implementing class.

7) What will be the output of the following program and why ?

```java
abstract class Test1 {
   abstract void m()
     {
        int i=10;
        i=i+5;
        System.out.println("i="+i);
     }   
}
class Test extends Test1 {   
  public static void main(String args[])
   {
      Test obj=new Test();
      obj.m();
   }
}
```
Compilation error- Abstract class can implement its own method too but not abstract methods. 

8. What will be the output of the following program and why ?

```java
abstract class Test1 {
   abstract void m()
     {
        int i=10;
        i=i+5;
        System.out.println("i="+i);
     }   
}
class Test extends Test1 {   
  public static void main(String args[])
   {
      Test obj=new Test();
      obj.m();
   }
}
```
Compilation error- Abstract class can implement its own method too but not abstract methods. 


9) What will be the output of the following program and why ?

```java
abstract class Test1 {
   abstract void m()
     {
        int i=10;
        i=i+5;
        System.out.println("i="+i);
     }   
}
class Test extends Test1 {   
  public static void main(String args[])
   {
      Test1 obj=new Test1();
      obj.m();
   }
}
```

Compilation error- Abstract class can implement its own method too but not abstract methods. 

10) What will be the output of the following program and why ?

```java
interface Cars {
  final int cc = 1000; 
  public void carSound(); 
  public void hornSound(); 
}
class Maruti implements Cars {
  public void carSound() {    
    System.out.println("zoom zoom");
  }
  public void hornSound() {
    System.out.println("peep peep");
  }
 public void get_cc() {
    System.out.println("cc="+cc);
  }

}
class MyMainClass {
  public static void main(String[] args) {
    Maruti myCar = new Maruti();  
    myCar.carSound();
    myCar.hornSound();
    myCar.get_cc();
  }
}
```
zoom zoom

peep peep

cc=1000


11) What will be the output of the following program and why ?

```java
interface FirstInterface {
  public void myMethod(); 
}
interface SecondInterface {
  public void myOtherMethod(); 
}
class DemoClass implements FirstInterface, SecondInterface {
  public void myMethod() {
    System.out.println("Some text..");
  }
  public void myOtherMethod() {
    System.out.println("Some other text...");
  }
}
class MyMainClass {
  public static void main(String[] args) {
    DemoClass myObj = new DemoClass();
    myObj.myMethod();
    myObj.myOtherMethod();
  }
}
```
Some text..

Some other text...

12. List down differences between following with examples- a) An interface and abstract. b) An interface and extends.
    
```
a) A class can implement multiple interfaces but can extend only one Abstract class
b) An interface is completely Abstract class and extend is usd for extedning Abstract clas but not interface. 

```


13. How are threads created in Java ? Explain all the methods with example.

```
1- By extending Thread class and overriding its run method. 
2- By implementing runnable interface 

- There are two ways to create a thread-
```
## a) It can be created by extending the Thread class and overriding its run() method:
```java
 public class MyClass extends Thread {
            public void run() {
               System.out.println("This code is running in a thread");
            }
          }
```

## b) Another way to create a thread is to implement the Runnable interface:
```java
 public class MyClass implements Runnable {
          public void run() {
               System.out.println("This code is running in a thread");
          }
       }
```
14. What is a concurrency problem with threads ? Explain with example.

```
When two threads trying to access same object then it may result in different output. synchronized keyword is used to solve this. 


```

15. How can you use synchronized keyword to solve concurrency problem ? Explain with example.

16. What will be the output of the following program and why ?

```java
abstract class Test {
   private double price;
   private String model;
   private String year;
   public abstract void goFast();    
   public abstract void changeColor(); 
}
```

No main method. but declaration is correct.

17) Is there any compile error in below code ? Why ?

```java
class Test {
   private double price;
   private String model;
   private String year;
   public abstract void goFast();    
   public abstract void changeColor(); 
}
```
Yes, it contains Abstract methods in non Abstract class

18. Is there any compile error in below code ? If yes, then why ? If not, then why not ?

```java
abstract class Test {
   private double price;
   private String model;
   private String year;
   public abstract void goFast()
    {
      int speed=100;
    }   
   public abstract void changeColor(); 
}
```
Compilation error since Abstract method cannot have method body but just header. 


19) Is there any compile error in below code ? If yes, then why ? If not, then why not ?

```java
abstract class Test {
   private double price;
   private String model;
   private String year;
   public void goFast()
    {
      int speed=100;
    }   
   public abstract void changeColor(); 
}
```
Nope

20) What will be the output of the following program and why ?

```java
abstract class Test1 {
   abstract void m();   
}
class Test extends Test1 {   
   void m() {
      int i=10;
      i=i+5;
      System.out.println("i="+i);
   }
  public static void main(String args[])
   {
      Test obj=new Test();
      obj.m();
   }
}
```
25


21) What will be the output of the following program and why ?

```java
abstract class Test1 {
   abstract void m();   
}
class Test extends Test1 {   
   void m() {
      int i=10;
      i=i+5;
      System.out.println("i="+i);
   }
  public static void main(String args[])
   {
      Test1 obj=new Test1();
      obj.m();
   }
}

```
Compilation error since object of Anstract class cannot be created


22) What will be the output of the following program and why ?

```java
abstract class Test1 {
   abstract void m()
     {
        int i=10;
        i=i+5;
        System.out.println("i="+i);
     }   
}
class Test extends Test1 {   
  public static void main(String args[])
   {
      Test obj=new Test();
      obj.m();
   }
}
```
compilation error since its implementing abstract method. 


23) What will be the output of the following program and why ?

```java
abstract class Test1 {
   abstract void m()
     {
        int i=10;
        i=i+5;
        System.out.println("i="+i);
     }   
}
class Test extends Test1 {   
  public static void main(String args[])
   {
      Test obj=new Test();
      obj.m();
   }
}
```
compilation error since its implementing abstract method.


24) What will be the output of the following program and why ?

```java
abstract class Test1 {
   abstract void m()
     {
        int i=10;
        i=i+5;
        System.out.println("i="+i);
     }   
}
class Test extends Test1 {   
  public static void main(String args[])
   {
      Test1 obj=new Test1();
      obj.m();
   }
}
```
compilation error since its implementing abstract method.


25) What will be the output of the following program and why ?

```java
interface Cars {
  final int cc = 1000; 
  public void carSound(); 
  public void hornSound(); 
}
class Maruti implements Cars {
  public void carSound() {    
    System.out.println("zoom zoom");
  }
  public void hornSound() {
    System.out.println("peep peep");
  }
 public void get_cc() {
    System.out.println("cc="+cc);
  }

}
class MyMainClass {
  public static void main(String[] args) {
    Maruti myCar = new Maruti();  
    myCar.carSound();
    myCar.hornSound();
    myCar.get_cc();
  }
}
```
zoom zoom

peep peep

cc=1000


  
 