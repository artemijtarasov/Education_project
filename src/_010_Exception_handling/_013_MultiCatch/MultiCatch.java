package _010_Exception_handling._013_MultiCatch;

// Demonstrate the multi-catch feature.

public class MultiCatch {
    public static void main(String[] args) {
        int a = 10, b = 0;
        int[] vals = {1, 2, 3};

        try {
            int result = a / b; // generate an ArithmeticException

            vals[10] = 19; // generate an ArrayIndexOutOfBoundsException

            // This catch clause catches both exceptions.
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e);
        }

        System.out.println("After multi-catch");
    }
}
