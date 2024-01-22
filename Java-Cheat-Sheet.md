## HashSet
```Java
import java.util.HashSet;

HashSet<Integer> seent = new HashSet<>();

seent.contains(item);
seent.add(item);
seent.remove(item);
```
Java HashSet is similar to Python set().

## HashMap
```Java
import java.util.HashMap;

HashMap<Character, Integer> s_map = new HashMap<>();

s_map.containsKey(key);
s_map.put(key, value);
s_map.remove(key);
s_map.get(key);
s_map.getOrDefault(key, default value);
```

Java HashMap is like a Python dictionary. It looks like this:
{a=3, r=1, g=1, m=1, n=1}.

## Static Arrays
```Java
int someArray[] = new int[10];
String someArray2[] = new String[5];
// or
int nextArray[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
String nextArray2[] = {"zero", "one", "two", "three", "four"};

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
```Java
public class Car {
	
	public String color;
	public String model;
	private int vin;
	
	public final static int wheels = 4;
	
	boolean leather;

    public Car (String color, String model, int price) {
        this.color = color;
        this.model = model;

        if (price > 70000) {
            this.leather = true;
        } else {
            this.leather = false;
        }

        this.vin = generateVin();
    }

    public int getVin() {
        return this.vin;
    }

    private void changeColor(String color) {
        this.color = color;
    }

    private void drive(Keys k) {
        ...start engine...
    }
}

abstract class CarState {
	public int speed;
	public String location;
}
	
final class Driver {
	public String name;
}

```
- Java Class Access Modifiers can be **_public_** or default(**no access modifier**). 
  - **_public_** means the class is accessible by any other class. Default is only accessible by classes in the same package.
- Java Class Non-Access Modifiers can be no access modifier, **_final_**, or **_abstract_**. 
  - **_final_** means the class cannot be inherited.
  - **_abstract_** means the class cannot create objects(to use the class, it must be inherited)

- Java Attribute/Method Access modifier by default(**no access modifier**) only let the code be accessed from the same package
  - **_public_** makes the attribute/method accessible from all classes
  - **_private_** makes the attribute/method only accessible from same class
  - **_protected_** makes it accessible only from the same package and subclasses

- Java Attribute/Method Non-Access modifiers can be **_final_**, **_static_**, **_abstract_**, **_transient_**, **_synchronized_**, **_volatile_**
  - **_final_** means the attribute/method cannot be modified
  - **_static_** means the attribute/method belongs to the class, not object
  - others not covered here yet 
