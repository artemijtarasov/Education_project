package _008_Inheritance._008_Override2;

// Methods with different signatures are overloaded - not overridden.

public class Override2 {
    public static void main(String[] args) {
        B subOb = new B(1, 2, 3);

        subOb.show("This is k: "); // this calls show() in B
        subOb.show(); // this calls show() in A
    }
}
