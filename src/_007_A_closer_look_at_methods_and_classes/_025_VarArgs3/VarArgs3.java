package _007_A_closer_look_at_methods_and_classes._025_VarArgs3;

// Varargs and overloading.

public class VarArgs3 {

    static void vaTest(int ... v) {
        System.out.print("vaTest(int ...): " + "Numbers of args: " +
                v.length + " Contents: ");

        for(int x : v)
            System.out.print(x + " ");

        System.out.println();
    }

    static void vaTest(boolean ... v) {
        System.out.print("vaTest(boolean ...): " + "Number of args: " +
                v.length + " Contents: ");

        for(boolean x : v)
            System.out.print(x + " ");

        System.out.println();
    }

    static void vaTest(String msg, int ... v) {
        System.out.print("vaTest(String, int ...): " + msg + v.length +
                " Contents: ");

        for(int x : v)
            System.out.print(x + " ");

        System.out.println();
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        vaTest(1, 2, 3);
        vaTest("Testing: ", 10, 20);
        vaTest(true, false, false);
    }

}
