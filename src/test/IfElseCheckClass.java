package test;

public class IfElseCheckClass {
    public static void main(String[] args) {
        IfElseCheckClass ie = new IfElseCheckClass();
        ie.ifElseCheck();
    }

    public void ifElseCheck(){
        boolean flag = false;

        if (flag) {
            System.out.println("I'm in if.");
        } else {
            System.out.println("I'm in else.");
        }
    }
}
