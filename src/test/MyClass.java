package test;

public class MyClass {
//if i is static you can not declare a value for i in constructor. It has to be in same line.
    static int i = 5;

    public static void main(String[] args) {
        MyClass.initialize();
        MyClass myClass = new MyClass();
        System.out.println(myClass.i);
        System.out.println(MyConstants.LONG_WAIT);
        System.out.println(EnumConstants.SUNDAY);
        System.out.println(returningMethod());
    }

    public static void initialize() {
        System.out.println("I'm in initialize method.");
    }

    public static int returningMethod(){
        i = 6;
        return i;
    }
}

/*
    - fields/parameters/variables
    - constractors
    - methods

    DATA TYPES
    There are two data types in Java
        - Primitive types - int float double boolean byte short long char
        - Reference types - Array Class Interface String Innumeration Annotations
*/