package _007_A_closer_look_at_methods_and_classes._017_InnerClassDemo2;

// Define an inner class within a for loop.

public class Outer {
    int outer_x = 100;

    void test() {
        for(int i = 0; i < 10; i++) {
            class Inner{
                void display() {
                    System.out.println("display: outer_x = " + outer_x);
                }
            }
            Inner inner = new Inner();
            inner.display();
        }
    }
}

