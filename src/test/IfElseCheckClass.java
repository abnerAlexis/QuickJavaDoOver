package test;

public class IfElseCheckClass {
    public static void main(String[] args) {
        IfElseCheckClass ie = new IfElseCheckClass();
        ie.ifElseCheckWithBoolean();
        ie.ifElseCheckWithString();
        ie.ifElseCheckWithBoolAndStr();
        ie.ifElseCheckWithBoolOrStr();
        ie.forLoopCheck();
        ie.forEachLoopCheck();
        ie.whileLoopCheck();
    }

    public void ifElseCheckWithBoolean(){
        boolean flag = false;
        System.out.println("Boolean check.");

        if (flag) {
            System.out.println("I'm in if.");
        } else {
            System.out.println("I'm in else.");
        }
    }

    public void ifElseCheckWithString() {
        String str = "myStr";
        System.out.println("String check.");

        if (str.equalsIgnoreCase("myStr")) {
            System.out.println("I'm in if.");
        } else {
            System.out.println("I'm in else.");
        }
    }

    public void ifElseCheckWithBoolAndStr() {
        System.out.println("Boolean AND String check.");
        boolean flag = true;
        String str = "myStr";
        System.out.println("String check.");

        if (str.equalsIgnoreCase("myStr") & flag) {
            System.out.println("I'm in if.");
        } else {
            System.out.println("I'm in else.");
        }
    }

    public void ifElseCheckWithBoolOrStr() {
        System.out.println("Boolean OR String check.");
        boolean flag = true;
        String str = "myStr";
        System.out.println("String check.");

        if (str.equalsIgnoreCase("myStr") || flag) {
            System.out.println("I'm in if.");
        } else {
            System.out.println("I'm in else.");
        }
    }

    public void forLoopCheck() {
        System.out.println("FOR LOOP check.");
        for (int i = 0; i < 5; i++) {
            System.out.println("i = " + i);
            if (i == 3) {
                System.out.println("breaking");
                break;
            }
        }
    }

    public void forEachLoopCheck() {
        System.out.println("FOR EACH LOOP check.");
        String[] myArray = {"a", "b", "c"};
        for (String el : myArray) {
            System.out.println(el + " ");
            if (el.equalsIgnoreCase("b")) {
                System.out.println("Stopped at b");
                break;
            }
        }
    }

    public void whileLoopCheck() {
        System.out.println("WHILE LOOP check.");
        int i = 5;

        while (i > 0) {
            System.out.println("i = " + i--);
            if (i == 3) {
                System.out.println("Breaks at 3.");
                break;
            }
        }
    }
}
