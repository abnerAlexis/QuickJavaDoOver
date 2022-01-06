package test;

public class MyClass {

    final int i;

    public MyClass() {
        i = 5;
    }

    public static void main(String[] args) {
        MyClass.initialize();
        MyClass myClass = new MyClass();
        System.out.println(myClass.i);
    }

    public static void initialize() {
    }
}

/*
    - fields/parameters/variables
    - constractors
    - methods

    DATA TYPES
    There are two data types in Java
        - Primitive types - int float double boolean byte short long char
        - Reference types - Array Class Interface String Innumeration Anotations
*/