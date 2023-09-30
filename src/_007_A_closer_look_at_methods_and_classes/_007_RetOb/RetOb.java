package _007_A_closer_look_at_methods_and_classes._007_RetOb;

// Returning an object.

public class RetOb {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Test ob1 = new Test(2);
        Test ob2;

        ob2 = ob1.incrByTen();
        System.out.println("ob1.a: " + ob1.a);
        System.out.println("ob2.a: " + ob2.a);

        ob2 = ob2.incrByTen();
        System.out.println("ob2.a after second increase: " + ob2.a);
    }

}