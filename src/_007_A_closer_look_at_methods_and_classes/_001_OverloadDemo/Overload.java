package _007_A_closer_look_at_methods_and_classes._001_OverloadDemo;

// Demonstrate method overloading.

public class Overload {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        OverloadDemo ob = new OverloadDemo();
        double result;

        // call all version of test()
        ob.test();
        ob.test(10);
        ob.test(10, 20);
        result = ob.test(123.25);
        System.out.println("Result of ob.test(123.25): " + result);
    }

}
