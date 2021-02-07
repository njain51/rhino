#Assignment

### 1. What will be the output of the following program and why ?

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
2  
2

// static variable so only one instance of it will be created.


### 2. What will be the output of the following program and why ? 

class Test {      int g=10; public static void main(String args[]) {  
    Test obj1= new Test();     
    System.out.println(g); } }

### 3. What will be the output of the following program and why ?

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

10 // since static variable hence can be accessed directly


### 4. What will be the output of the following program and why ? 

```java
class Test {
    int g = 10;

    public static void main(String args[]) {
        Test obj1 = new Test();
        System.out.println(obj1.g);
    }
}

```
10 // object referencing non static variable


 

### 5. What will be the output of the following program and why ?   
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
10

### 6. What will be the output of the following program and why ?   

```java
class Test
{     
   public static void main(String args[])
   {  
     Test1 obj= new Test1();
     obj.print_i();          
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

10 

### 7. What will be the output of the following program and why ?
```java
class Test
 {    
    static int i=10;
    public static void print_i()
    {       
      System.out.println(i);
    }  
    public static void main(String args[])
    {       
      print_i();          
    } 
 } 
```
10

### 8.  What will be the output of the following program and why ?
```java
class Test
{    
   int i=10;
   public static void print_i()
   {       
     System.out.println(i);
   }  
   public static void main(String args[])
   {       
     print_i();          
   } 
} 
```
Error since i is not static but referenced without object.

### 9.  What will be the output of the following program and why ?
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
10

### 10.  What will be the output of the following program and why ?

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
      public void print_i()
       {       
          System.out.println(i);
       }  
    }     
} 
```
Error sincee print_i() is non static function

### 11.  What will be the output of the following program and why ?

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
      int i=10;
      public static void print_i()
       {       
          System.out.println(i);
       }  
    }     
} 
```
Error since i is not static but referenced dierctly without object. 
 