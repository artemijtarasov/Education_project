package _007_A_closer_look_at_methods_and_classes._016_InnerClassDemo;

//Demonstrate an inner class.

public class Outer {
    int outer_x = 100;

    void test() {
        Inner inner = new Inner();
        inner.display();
    }

    // this is an inner class
    class Inner{
        void display() {
            System.out.println("dispaly: outer_x = " + outer_x);
        }
    }
}
