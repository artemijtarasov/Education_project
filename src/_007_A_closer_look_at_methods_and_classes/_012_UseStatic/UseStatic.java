package _007_A_closer_look_at_methods_and_classes._012_UseStatic;

// Demonstrate static variables, methods, and blocks.

public class UseStatic {
    static int a = 3;
    static int b;

    static void meth(int x) {
        System.out.println("x = " + x);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    static {
        System.out.println("Static block initialized.");
        b = a * 4;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        meth(42);
    }

}
