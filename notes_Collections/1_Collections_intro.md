This is intro to Collections Framework Notes and sample programs

**Collection Framework**

If we need to store data in a program it can be done in two ways: 
1- in a program itself. 
2- external database 

To store data in program itself, data structure comes into play. **Collection Framework in Java helps facilitates data Structure to store data within program itself**. If program is talking with a database for every transaction then it will take time and transaction becomes expensive. So, we use Collection to persist data within a program itself.

Next, For data persistance via secondary storage device we will need external Db - ERP, SAP, Postgres or any
other database. 

**Why it's needed?** 
- To facilitate data Structure functionality in Java
- introduced in java 1.2 
- Before 1.2, Data structure was still there, but it was not part of Framework. 
Classes which were introduced to do Data Structure functionality before are now called Legacy Classes or Legacy Collections.  e.g., Vector, Hash Table etc.

- To keep data in organized way is basic foundation of data Structure. it helps to keep large data in organized form, low memory consumption, easy search and retrieval etc. are features associated with any data Structure.
- _two category :(a) linear data Structure (b) Non-linear Data Structure_
- Linear Data Structure: Array, List , Linked List, Stack, Vector etc.
- Non-linear Data Structure - Map, Tree, Graph etc. 
- Collection Framework facilitates similar as well as dis-similar type of data. 
- Size is not pre-defined. 


**Array:** 
- its part of Data Structure
- Similar type of Data Stored in coniguous memory location. 
- size is pre-defined or fixed. It cannot be increased at runtime.

- Arrays can hold only homogeneous data elements.
  example: Student[] s = new Student[1000]; will only hold Student data. 
           
   s[0] = new Student();  ==> Valid
   s[1] = new Customer();  ==> will give compile time error.
  
  we can solve this problem by taking 'object type array'.
  
  Object[] a = new Object[10000];
  
  so both are valid now:
  Now, a[0] = new Student();
   a[1] = new Customer(); 
   
   But in this case, we will have to do too much work when we are retriving data. We may also get typecasting issue when converting object data. 
   
   
  Further, Arrays concept is not implemented based on some standard data structures and so for every concept we need to write our own logic etc. Ready-made method support we can't expect with arrays.
------------------------------------------------------------------------------------------------------
**Collections features:**
1- Collections are grow-able in nature.
2- can hold homogeneous and heterogeneous objects.
3- Every Collect
**Drawbacks of Collections:ion class is implemented based on some standard data structure so ready made methods support are available for every requirement. So being a programmer we have to use these method and we are not responsible for its implementation.
**
1- Collection concept degrades performance so if we know size in advance then we must use arrays as with collections to insert 100010th element it will  first copy existing elements and then add new one so performance is degraded.


Difference between Array and Collections :

1- Arrays are fixed in size while Collections are growable in nature i.e., based on our requirement we can increase or decrease size.
2- wrt memory arrays are not recommended to use but collections do.
3- wrt performance arrays are recommended to use but collections don't.
4- arrays can hold homogeneous data elements while collections can hold both homogeneous and heterogeneous data elements. 
5- No underlying DS exists for arrays so ready made method support not available but in collections it does. 
6- Arrays can hold both primitive and object types( int and Integer) while collections can only hold only Objects but not primitive types.

**Understanding Collections Framework in depth:** 

**Collection :** It represents group of objects known as element.Group of Element is called Collection. It can be Similar or Dis-similar elements. 
Element here refers to objects in java. 
**So, basically homo or hetero grouping of objects in java is called Collection.**
**A Collection is group of objects represented as single entity.**


- From Coding point of view: Collection is an Interface. 
- it's there in java.util package. 
- Some Collection allow duplicacy while others dont allow it. 
- Some allow indexing while others don't 
- **In Hierarchy - Collection is root interface.** 

So wherever there is a scenario of object gathering and operations on those objects we use Collection Framework as defacto implementation in java. 

**Framework:** 
- it means set of API which works on pre-defined algorithm and targeted to specific domain. 
-  JDBC framework specific target is Database, Collection Framework is a specific target to Data Structure, Java EE specific target is web and enterprise application etc. 
-  Maintenance is easy with Framework. 
- its lke phtoframe of 4*4 size where we can put any photo of our choice. 

java api logic will be in function, function will be in class, class will be in package and package will be in jar. 
So api represents sets of libraries or pre-defined functinalities in any language. 
In C++ API is represented in form of header files, 
in Java its represented in form of classes, iterrfaces and pacakges. 

API Vs Framework -  Api is mandatory but Framework is Optional. Before  v1.2 also Collections API were there but there was no framework. So to acheive same purpose differnent framework can be used but programming cannot be done without API present. 
Collection of API represents Framework. 






