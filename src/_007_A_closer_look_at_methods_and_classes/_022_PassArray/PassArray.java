package _007_A_closer_look_at_methods_and_classes._022_PassArray;

// Use an array to pass a variable number of arguments to a method. This
// is the old-style approach to variable-length arguments.

public class PassArray {

    static void vaTest(int[] v) {
        System.out.print("Numbers of args: " + v.length + " Contents: ");

        for(int x : v)
            System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // Notice how an array must be created to hold the arguments
        int[] n1 = {10};
        int[] n2 = {1, 2, 3};
        int[] n3 = {};

        vaTest(n1); // 1 arg
        vaTest(n2); // 3 args
        vaTest(n3); // no args
    }

}
