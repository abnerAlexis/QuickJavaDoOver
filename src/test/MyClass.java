package test;

public class MyClass {

    int i;

    public MyClass() {
    }

    public MyClass(int i) {
        this.i = i;
    }

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.initialize();
        MyClass myClass1 = new MyClass();
        System.out.println(myClass1.i);
    }

    public void initialize() {
        i = 5;
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