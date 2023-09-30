package _007_A_closer_look_at_methods_and_classes._010_AccessTest;

// This program demonstrates the difference between public and private.

public class AccessTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Test ob = new Test();

        // these are OK, a and b may be accessed directly
        ob.a = 10;
        ob.b = 20;

        // this is not OK and will cause an error
//		ob.c = 100; // error!

        // you must access c through its methods
        ob.setc(100); // OK
        System.out.println("a, b and c: " + ob.a + " " + ob.b + " " + ob.getc());
    }

}
