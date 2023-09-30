package _007_A_closer_look_at_methods_and_classes._024_VarArgs2;

// Use varargs with standard arguments.

public class VarArgs2 {

    // Here, msg is a normal parameter and v is a varargs parameter.
    static void vaTest(String msg, int ... v) {
        System.out.print(msg + v.length + " Contents: ");

        for(int x : v)
            System.out.print(x + " ");

        System.out.println();
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        vaTest("One vararg: ", 10);
        vaTest("Three varargs: ", 1, 2, 3);
        vaTest("No varargs: ");
    }

}
