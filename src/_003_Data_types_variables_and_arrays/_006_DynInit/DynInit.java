package _003_Data_types_variables_and_arrays._006_DynInit;

// Demonstrate dynamic initialization

public class DynInit {
    public static void main(String[] args) {

        double a = 3.0, b = 4.0;

        // c is dynamically initialized
        double c = Math.sqrt(a * a + b * b);

        System.out.println("Hypotenuse is " + c);
    }

}
