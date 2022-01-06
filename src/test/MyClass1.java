package test;

public class MyClass1 {

    public static void main(String[] args) {
        MyClass1 myClass1 = new MyClass1();
        myClass1.myMethod1();
    }

    public void myMethod1(){
        MyClass.initialize();
        System.out.println(MyClass.i);
    }
}
