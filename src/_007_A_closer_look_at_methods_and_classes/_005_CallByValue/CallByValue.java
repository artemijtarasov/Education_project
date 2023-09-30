package _007_A_closer_look_at_methods_and_classes._005_CallByValue;

// Primitive types are passed by value.

public class CallByValue {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Test ob = new Test();

        int a = 15, b = 20;

        System.out.println("a and b before call: " + a + " " + b);

        ob.meth(a, b);

        System.out.println("a and b after call: " + a + " " + b);
    }

}
