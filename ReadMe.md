This is intro to Collections Framework Notes and sample programs

**Collection Framework**

If we need to store data in a program it can be done in two ways: 
1- in a program itself. 
2- external database 

To store data in program itself, data structure comes into play. Collection Framework in Java helps facilitates data Structure to store data within program itself. If program is talking with a database for every transaction then it will take time and transaction becomes expensive. So, we use Collection to persist data within a program itself.

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

**Array:** 
- its part of Data Structure
- Similar type of Data Stored in coniguous memory location. 
- size is pre-defined or fixed. 


- Collection Framework facilitates similar as well as dis-similar type of data. 
- Size is not pre-defined. 

**Understanding Collections Framework in depth:** 

Collection : Group of Element is called Collection. It can be Similar or Dis-similar elements. Element here refers to objects in java. So, basically homo or hetero grouping of objects in java is called Collection.
From Coding point of view: Collection is an Interface. 
- its there in java.util package. 
- Some Collection allow duplicacy while others dont allow it. 
- Some allow indexing while others don't 
- In Hierarchy - Collection is root interface. 

So whereever there is scenario of object gathering and operations on those objects we use Collection Framework as defacto implementation in java. 

Framework: 
- it means set of API which works on pre-defined algorithm and target to specific domain. 
- 
