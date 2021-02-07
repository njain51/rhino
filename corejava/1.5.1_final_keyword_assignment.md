#Assignment-

## 1. What will be the output of the following program and why ?

```java
class Test
       {          
          public static void main(String args[])
            {
              final int i=10;
              i=i+15;
              System.out.println(i);
            }
       }
```
Compilation error since we cannot change value of i as its declared final


## 2. What will be the output of the following program and why ?          
```java
class Test {
public static void main(String args[])
            {
              final int i;
              i=10+15;              
              System.out.println(i);
            }
       }
```
// value can be initialized once. 

25


## 3. What will be the output of the following program and why ?

```java
class Test
       {
          
          public static void main(String args[])
            {
              final int i;
              i=10+15; 
              i=10+15;             
              System.out.println(i);
            }
       }
```

Compilation error since i cannot be assigned twice.


## 4. What will be the output of the following program and why ?
```java
class Test{  
   final int MAX_VALUE=99;
   void myMethod(){  
      MAX_VALUE=101;
   }  
   public static void main(String args[]){  
      Test obj=new  Test();  
      obj.myMethod();  
   }  
}
```
Compilation error since variable MAX_VALUE is already assigned once and cannot be reassigned.



## 5. What will be the output of the following program and why ?
```java
class Test{  
   final int MAX_VALUE;	 
   Test(){
      MAX_VALUE=100;
   }
   void myMethod(){  
      System.out.println(MAX_VALUE);
   }  
   public static void main(String args[]){  
      Test obj=new  Test();  
      obj.myMethod();  
   }  
}
```
100


## 6. What will be the output of the following program and why ?

```java
class Test
{ 
    public static void main(String[] args)  
    { 
        final StringBuilder strb = new StringBuilder("Hello");           
        System.out.println(strb);           
        strb.append("Hi");           
        System.out.println(strb); 
    }     
} 
```
Hello

HelloHi // Although strb is final object but internal state of this object can be still changd. 



## 7. What will be the output of the following program and why ?

```java
class XYZ
{  
   final void demo(){
       System.out.println("XYZ Class Method");
   }  
}  	     
class ABC extends XYZ{  
   void demo(){
      System.out.println("ABC Class Method");
   }  	     
   public static void main(String args[]){  
      ABC obj= new ABC();  
      obj.demo();  
   }  
}
```
Compilation error since demo method is final method and cannot be overridden.



## 8. What will be the output of the following program and why ?
```java
class XYZ{  
   final void demo(){ System.out.println("XYZ Class Method"); }  
   }     
   class ABC extends XYZ{  
   public static void main(String args[]){  
   ABC obj= new ABC();  
   obj.demo();  
   }  
   }
```

XYZ Class Method // final method cannot be overidden but still can be inherited. 


## 9. What will be the output of the following program and why ?

```java
final class XYZ{  
  int i;
  String str;
}  	     
class ABC extends XYZ{  
   void demo(){
      System.out.println("My Method");
   }  
   public static void main(String args[]){  
      ABC obj= new ABC(); 
      obj.demo();
   }  
}
```

Compilation eror since final class XYZ cannot have any child class

## 10.  What will be the output of the following program and why ?  
```java
 class A
    {
       final int i=10;
    }
  class B
    {
       public static void main(String args[])
           {  
               A obj= new A(); 
               obj.i=15;
               System.out.println("i="+obj.i);
           }  
    }

```
Compilation error since we cannot reassign final varaible i


## 11.  What will be the output of the following program and why ?   
```java
class A
    {
       final int i=10;
    }
  class B
    {
       public static void main(String args[])
           {  
               A obj= new A(); 
               obj.i=15;
               System.out.println("i="+obj.i);
           }  
    }
```
 Compilation error since we cannot reassign final varaible i  

## 12.  What will be the output of the following program and why ?
```java
class Test
       {
          
          public static void main(String args[])
            {              
              display(5,10);
            }
         void display(int i,int j)
            {              
              System.out.println(i);
              System.out.println(j);
            }
       }


```
Compilation error since display is non static method and will need object to get called. 
