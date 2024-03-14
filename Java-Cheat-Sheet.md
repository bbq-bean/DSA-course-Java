## HashSet
```Java
import java.util.HashSet;

Set<Integer> seent = new HashSet<>();

Set<T> seent = new HashSet<>(); // hashset for generic type you could add any object to this

seent.contains(item);
seent.add(item);
seent.remove(item);
```
Java HashSet is similar to Python set().


## HashMap
```Java
import java.util.HashMap;

Map<Character, Integer> s_map = new HashMap<>();

s_map.containsKey(key);
s_map.put(key, value);
s_map.remove(key);
s_map.get(key);
s_map.getOrDefault(key, default value);
```

Java HashMap is like a Python dictionary. 

It looks like this:
{a=3, r=1, g=1, m=1, n=1}.

## Static Arrays
```Java
int someArray[] = new int[10];
String someArray2[] = new String[5];
// or
int nextArray[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
String nextArray2[] = {"zero", "one", "two", "three", "four"};
// OR
String abc[]; // this only declares a reference to an array
abc = new String[3]; // initializes the array
		
abc[0] = "aye";
abc[1] = "bee";
abc[2] = "see";

double[][] array2D = new double[3][3]; // 2d array

someArray.length

import java.util.Arrays;
Arrays.sort(someArray); // builtin merge sort O(n log n)
```
These are classic static arrays: fixed-size and contiguous memory allocated at compile time.

## ArrayList
```Java
import java.util.ArrayList;
List<Integer> someList = new ArrayList<>();

someList.get(0); // access elements by index

someList.add(17); // only way to add elements, ArrayList cant do this at initialization
someList.add(22);
someList.add(11));

someList.remove(0); // remove value at index 0
someList.remove(someList.size() - 1); // accepted way to Python pop() in Java 8

// List of Lists
List<List<Integer>> listOfLists = new ArrayList<>();
```
ArrayLists are similar to Python Lists. Their size can be modified. ArrayList is an implementation of the List Interface and ArrayList will unbox to List.

The line where it is declared is the preferred syntax and is known as coding for the interface rather than the implementation.

## Stack
```Java
import java.util.ArrayDeque;
import java.util.Deque;

Deque<Integer> someStack = new ArrayDeque<>();

someStack.push(10);
someStack.push(20);

someStack.peek() // like Python my_stack[-1] to check last element

someStack.pop()

```
Notice this is just a deque, which has stack functions.

## Queue
```Java
import java.util.ArrayDeque;
import java.util.Deque;

Queue<Integer> someQueue = new ArrayDeque<>();
// or
Queue<Integer> someQueue = new LinkedList<>();

queue.offer(3); // enque an item

queue.peek(); // peek front element

queue.poll(); // deque front element

```
Java queue acts strictly as FIFO, you can only pull elements from the head of the queue.

## Deque
```Java
import java.util.ArrayDeque;
import java.util.Deque;

Deque<Integer> deque = new ArrayDeque<>();

// Add elements to the deque
deque.addFirst(1);
deque.addLast(2);

int firstElement = deque.removeFirst();
int lastElement = deque.removeLast();
```
Java deque keeps pointers for both ends, so operations to front or end are all O(1)

## String Literal vs String Object
```Java
String dog = "dog";
String dog2 = "dog"; // these reference the same object in the JVM

String doggo = new String("doggo");
String doggo2 = new String("doggo"); // these are different objects
```
String literal is always faster.

## Primatives vs References(Wrapper Objects)
```Java
int a = 1;
Integer A = null;
```
- Primatives store a reference to a location on the stack where an real value is stored. 
- References point to an object on the heap. 
- References are immutable. 
- **References can be null**.

## Autoboxing and Unboxing
```Java
ArrayList<Integer> someList = new ArrayList<>();
someList.add(27); // ArrayList.add() wants an Integer object, but the compiler will help out by autoboxing int to its matching wrapper class Integer 
		
Integer a = 40;
int b = a; // Integer.intValue() unboxes to primative int
```
-  Autoboxing refers to the conversion of a primitive value into an object of the corresponding wrapper class
- Unboxing refers to converting an object of a wrapper type to its corresponding primitive value

## Class Modifiers and Attribute/Method Modifiers

- Java Class Access Modifiers can be **_public_** or default(**no access modifier**). 
  - **_public_** means the class is accessible by any other class. Default is only accessible by classes in the same package.
- Java Class Non-Access Modifiers can be no access modifier, **_final_**, or **_abstract_**. 
  - **_final_** means the class cannot be inherited.
  - **_abstract_** means the class cannot create objects(to use the class, it must be inherited)

- Java Attribute/Method Access modifier by default(**no access modifier**) only let the code be accessed from the same package. Here the rest are from greatest to least security:
  - **_private_** makes the attribute/method only accessible from same class
  - **_default_** is package private. Other classes can access, but must be in same package
  - **_protected_** makes it accessible only from classes in the the same package _and_ from subclasses of that same class(which could be in a different package) only as inherited attributes/methods though, never directly referencing the parent class
  - **_public_** makes the attribute/method accessible from all classes, anywhere


- Java Attribute/Method Non-Access modifiers can be **_final_**, **_static_**, **_abstract_**, **_transient_**, **_synchronized_**, **_volatile_**
  - **_final_** means the attribute/method cannot be modified
  - **_static_** means the attribute/method belongs to the class, not object
  - others not covered here yet 
