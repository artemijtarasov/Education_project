package _007_A_closer_look_at_methods_and_classes._008_Recursion;

public class Factorial {
    // this is recursive method
    int fact(int n) {
        int result;

        if(n == 1) return 1;
        result = fact(n - 1) * n;
        return result;
    }
}
