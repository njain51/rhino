
##Assignment
----------------------------------------------------------------------------------------------------------
### 1. What will be output of the following program and why ?
 
```java

class A { 
    private int data=40;
    private void msg() 
       { System.out.println("Hello java"); }
}    
public class Simple {  
public static void main(String[] args){  
A obj=new A();  
System.out.println(obj.data);  
obj.msg();  
}  
} 
```
Error: since obj is object of another class and is trying to access private variable and method of class A

----------------------------------------------------------------------------------------------------------

### 2. What will be output of the following program and why ?

```java

class A {
    private A() {

    }

    void msg() {
        System.out.println("Hello java");
    }
}

public class Simple {
    public static void main(String[] args) {
        A obj = new A();
    }
}
```
constructor is declared private which is wrong since constructor is called with every object creation and so private constructor cannot be
called outside scope of class. so class cannot be extended or used by any other class if constructor is private.

----------------------------------------------------------------------------------------------------------
### 3. What will be the output of the following program and why ?

```java
class Test {
    public static void main(String[] args) {
        int i = 15;
        int j = 25;
        Test1 obj = new Test1();
    }
}

class Test1 {
    int i = 3;
    int j = 2;

    Test1() {
        System.out.println("i=" + i);
        System.out.println("j=" + j);
    }

    Test1(int i1, int j1) {
        i = i1;
        j = j1;
        System.out.println("i=" + i);
        System.out.println("j=" + j);
    }
}

```
Since Test1 is called with no parameter passed hence Test() will be called and below output  
i=3  
j=2

----------------------------------------------------------------------------------------------------------

### 4. What will be the output of the following program and why ?

```java
class Test {

    public static void main(String[] args) {
        int i = 15;
        int j = 25;
        Test1 obj = new Test1(31, 47);
    }
}

class Test1 {
    int i = 3;
    int j = 2;

    Test1() {
        System.out.println("i=" + i);
        System.out.println("j=" + j);
    }

    Test1(int i1, int j1) {
        i = i1;
        j = j1;
        System.out.println("i=" + i);
        System.out.println("j=" + j);
    }
}
```
this time constructor with parameters of Test1 class will be called  
i=31  
j=47

----------------------------------------------------------------------------------------------------------

### 5. What will be the output of the following program and why ?

```java
class Test {
    int i = 3;
    int j = 2;

    Test() {
        System.out.println("i=" + i);
        System.out.println("j=" + j);
    }

    Test(int i1, int j1) {
        i = i1;
        j = j1;
        System.out.println("i=" + i);
        System.out.println("j=" + j);
    }

    public static void main(String[] args) {
        int i = 15;
        int j = 25;
        Test obj = new Test();
    }
}
```
// default constructor of Test class will be called
i=3
j=2

----------------------------------------------------------------------------------------------------------
### 6. What will be the output of the following program and why ?

```java
class Test {
    int i = 3;
    int j = 2;

    Test() {
        System.out.println("i=" + i);
        System.out.println("j=" + j);
    }

    Test(int i1, int j1) {
        i = i1;
        j = j1;
        System.out.println("i=" + i);
        System.out.println("j=" + j);
    }

    public static void main(String[] args) {
        int i = 15;
        int j = 25;
        Test obj = new Test(31, 47);
    }
}
```

// constructor of Test clss with parameters pased will be called:
i=31
j=47


### 7. String1= "Hi" String2= "my" String3= "name" String4= "is" String5= "Tom" Write Java program to display the following output using above strings- Hi, my name is Tom

```java

public class Application {
    
    String String1= "Hi" ;
    String  String2= "my" ;
    String String3= "name" ;
    String String4= "is" ;
    String String5= "Tom";

    String str = String1 + ", " + String2 +" " + String3 +" " +String4 + " " +String5;

    public static void main(String[] args) {

        Application obj1 = new Application();

        System.out.println(obj1.str);
    }
 }   
```

----------------------------------------------------------------------------------------------------------

### 8. String str="Team" int i=49 Write Java program to display the following output using above above data- Team 49

```java
package com.nitin.java;

public class Application {

    String str="Team" ;
    int i=49;

    public static void main(String[] args) {

        Application obj1 = new Application();

        System.out.println(obj1.str +" " + Integer.toString(obj1.i));
    }


}
```
----------------------------------------------------------------------------------------------------------

### 9. What will be the output of the following program and why ?

```java

class Test {
    public static void main(String[] args) {
        String s1 = "Tom";
        String s2 = "Hardy";
        String s3 = s1.concat(s2);
        System.out.println(s3);
    }
}
```

// concat method will just join two strings, no space after  Tom  
TomHardy

--------

### 10. What will be the output of the following program and why ?
 
```java
class Test {
    public static void main(String args[]) {
        String s1 = "Tom ";
        String s2 = "Hardy";
        String s3 = s1.concat(s2);
        System.out.println(s3);
    }
}
```

Tom Hardy
----------------------------------------------------------------------------------------------------------
### 11. Write down the difference between private, default, protected and public access modifiers.
```
private: within class only 
default: within pacakge only 
protected: within package and child class 
public: from anywhere
```

----------------------------------------------------------------------------------------------------------

### 12 .What will be the output of the following program and why ?

```java
class Test1 {
    private int i = 10;
}

class Test {
    public static void main(String args[]) {
        Test1 obj = new Test1();
        System.out.println(obj.i);
    }
}

```
Error since i is private variable of Test1 but is being accessed from Test

----------------------------------------------------------------------------------------------------------
### 13. What will be the output of the following program and why ? Please note- to run the following program use following commands since the program contains package. To compile- javac -d . Test.java To execute- java mypack.Test

```java
class Test1 {
    private int i = 10;
}

class Test {
    public static void main(String args[]) {
        Test1 obj = new Test1();
        System.out.println(obj.i);
    }
}
```

Error since private variable can be accessed within same class only or from object of that class but through public methods.


----------------------------------------------------------------------------------------------------------
### 14. What will be the output of the following program and why ? Please note- to run the following program use following command since the program contains package. To compile- javac -d . Test.java To execute- java mypack.Test

```java
package mypack;
class Test1
{
  int i=10;
}
class Test
{  
   public static void main(String args[])
   {  
     Test1 obj= new Test1();
     System.out.println(obj.i);
  } 
}
```

// Both class in same pacakge so obj can access variable i
10

----------------------------------------------------------------------------------------------------------
### 15. What will be the output of the following program and why ?

```java
class Test1
{
  int i=10;
}
class Test extends Test1
{  
   public static void main(String args[])
   {  
     Test1 obj= new Test1();
     System.out.println(obj.i);
  } 
}
```
// Test is child class of Test1 hence all varialbes would be accessible.  
10

----------------------------------------------------------------------------------------------------------
### 16. What will be the output of the following program and why ? Please note- to run the following program use following commans since the program contains package. To compile- javac -d . Test.java To execute- java mypack.Test
  
```java
package mypack;
class Test1
{
  int i=10;
}
class Test
{  
   public static void main(String args[])
   {  
     Test1 obj= new Test1();
     System.out.println(obj.i);
  } 
}
```
// same pacakge two classes, default variable  
 10

----------------------------------------------------------------------------------------------------------
### 17. What will be the output of the following program and why ? Please note- to run the following program use following commands since the program contains package. To compile- javac -d . Test.java To execute- java mypack.Test. Write this class in file Test1.java and compile it.

```java
package mypack;
class Test1
{
  int i=10;
}
```
Write this class in another file Test.java. Compile it and execute it.

```java
package mypack1;
import mypack.*;
class Test
{  
   public static void main(String args[])
   {  
     Test1 obj= new Test1();
     System.out.println(obj.i);
  } 
}
```

Test1 is default so cannot be accessed outside the package.

----------------------------------------------------------------------------------------------------------
### 18. What will be the output of the following program and why ? Please note- to run the following program use following commands since the program contains package. To compile javac -d . Test.java To execute- java mypack.Test
Write this class in file Test1.java and compile it.  

```java
package mypack;
public class Test1
{
  public int i=10;
}
```
Write this class in another file Test.java. Compile it and execute it.

```java
package mypack1;
import mypack.*;
class Test
{  
   public static void main(String args[])
   {  
     Test1 obj= new Test1();
     System.out.println(obj.i);
  } 
} 
```

Since we are importing the pacakge mypack, so now i would be accessible within Test class 

10

----------------------------------------------------------------------------------------------------------
### 19. What will be the output of the following program and why ? Please note- to run the following program use following commands since the program contains package. To compile- javac -d . Test.java To execute- java mypack.Test

Write this class in file Test1.java and compile it.

```java
package mypack;
public class Test1
{
   int i=10;
}

```

Write this class in another file Test.java. Compile it and execute it.

```java
package mypack1;
import mypack.*;
class Test
{  
   public static void main(String args[])
   {  
     Test1 obj= new Test1();
     System.out.println(obj.i);
  } 
} 
```
Since we are importing the pacakge mypack, so now i would be accessible within Test class 

10

----------------------------------------------------------------------------------------------------------
### 20. What will be the output of the following program and why ?

```java
public class Test1
{
  public int i=10;
}
class Test
{  
   public static void main(String args[])
   {  
     Test1 obj= new Test1();
     System.out.println(obj.i);
  } 
} 

```
10

### 21. What is static keyword ?

```
- non access modifier in java
- it gives single instance for whole class
- if static variable then it can be acessed directly from class and also from object of that class
- if static method then it can be called directly without object creation of the class


```

----------------------------------------------------------------------------------------------------------
### 22. What will be the output of the following program and why ?


```java
class Test
{  
   public static void main(String args[])
   {  
     Test1 obj1= new Test1();
     obj1.increment();
     Test1 obj2= new Test1();
     obj2.increment();
     System.out.println(obj1.i);
     System.out.println(obj2.i);
  } 
} 
class Test1
{
   static int i=0;
   public void increment()
    {
      i=i+1;
    }
}

```
// since i is static so only one copy will exist in memory and all objects of that class will point to it.   
2  
2

 
### 23. What will be the output of the following program and why ?
```java
 class Test {
    int g = 10;

    public static void main(String args[]) {
        Test obj1 = new Test();
        System.out.println(g);
    }
}
```
Error since g is non static variable hence it will need object of that class access it. 


### 24. What will be the output of the following program and why ?

```java
class Test
{
    static int g=10;
    public static void main(String args[])
    {
        Test obj1= new Test();
        System.out.println(g);
    }
} 
```
10 // since g is static variable now
    
### 25. What will be the output of the following program and why ?

```java
class Test {
    static int g = 10;

    public static void main(String args[]) {
        Test obj1 = new Test();
        System.out.println(g);
    }
}

```
10 // since g is static variable now

### 26. What will be the output of the following program and why ? 

```java
class Test {
    int g = 10;

    public static void main(String args[]) {
        Test obj1 = new Test();
        System.out.println(obj1.g);
    }
}


```
10 

### 27. What is the difference between class name and object name.

```
- class is a template which contains objects and methods. So Class name will give name of template which can be used to create objects of that class
- class can have multiple objects 
- object name can be used to access variables and methods of that clas

```

### 28.  What will be the output of the following program and why ? 

```java
class Test
{
    public static void main(String args[])
    {
        Test1.print_i();
    }
}
class Test1
{
    static int i=10;
    public static void print_i()
    {
        System.out.println(i);
    }
}
```
10 // static method calling static variable and class name used to call static method of that class.


### 29.  What will be the output of the following program and why ?
 
```java
class Test {
    public static void main(String args[]) {
        Test1 obj = new Test1();
        obj.print_i();
    }
}

class Test1 {
    static int i = 10;

    public static void print_i() {
        System.out.println(i);
    }
}
```

10 // object obj is calling static method of that class and static method can directly access static variable of the class

### 30.  What will be the output of the following program and why ? 

```java
class Test {
    static int i = 10;

    public static void print_i() {
        System.out.println(i);
    }

    public static void main(String args[]) {
        print_i();
    }
}
```
10 // static method can be called directly and don't need objects to be created

### 31.  What will be the output of the following program and why ? 
```java
class Test {
    int i = 10;

    public static void print_i() {
        System.out.println(i);
    }

    public static void main(String args[]) {
        print_i();
    }
}

```
Error since i is not static so will need object to refer to it. 

### 32. What will be the output of the following program and why ? 

```java
 class Test
  {       
     public static void main(String args[])
       {        
          Test1.Test2.print_i();
       }
  } 
  class Test1
  {  
     static class Test2
      {
        static int i=10;
        public static void print_i()
         {       
            System.out.println(i);
         }  
      }     
  } 

```

10 // Test2 is static inner class of Test1. static inner class is valid class. This contains static method and static varialbe which can be accessed by static inner class
 



### 33. What will be the output of the following program and why ? 
```java
class Test {
    public static void main(String args[]) {
        
        Test1.Test2.print_i();
    }
}

class Test1 {
    static class Test2 {
        static int i = 10;

        public void print_i() {
            System.out.println(i);
        }
    }
}


```

Error since print_i() is not static method so cannot be directly accessed by inner class name Test2.Correct program should be: 

```java
class Test {
    public static void main(String args[]) {
        Test1.Test2 obj1 = new Test1.Test2();
         obj1.print_i();
    }
}

class Test1 {
    static class Test2 {
        static int i = 10;

        public void print_i() {
            System.out.println(i);
        }
    }
}
```


### 34. What will be the output of the following program and why ?

```java
class Test {
    public static void main(String args[]) {
        Test1.Test2.print_i();
    }
}

class Test1 {
    static class Test2 {
        int i = 10;

        public static void print_i() {
            System.out.println(i);
        }
    }
}
```

Error since non static variable is referenceed inside static context.


