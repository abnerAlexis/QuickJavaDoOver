package test;

public class MyClass {

    static final int i = 5;

    public MyClass() {
    }

    public MyClass(int i) {
    }

    public static void main(String[] args) {
        MyClass.initialize();
        System.out.println(i);
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