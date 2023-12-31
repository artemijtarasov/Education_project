package _005_Control_statements._020_TypeInferenceInFor;

// Use type inference in a for loop.

public class TypeInferenceInFor {

    public static void main(String[] args) {
        // use type inference with the loop control variable.
        System.out.print("Value of x: ");
        for(var x = 2.5; x < 100.0; x = x * 2)
            System.out.print(x + " ");

        System.out.println();

        // use type inference with the iteration variable.
        int[] nums = {1, 2, 3, 4, 5, 6};
        System.out.print("Value in nums array: ");
        for(var v : nums)
            System.out.print(v + " ");

        System.out.println();
    }

}
