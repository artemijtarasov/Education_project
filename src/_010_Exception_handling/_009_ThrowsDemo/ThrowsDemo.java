package _010_Exception_handling._009_ThrowsDemo;

// This program contains an error and will not compile.
/*class ThrowsDemo{
    static void throwOne(){
        System.out.println("Inside throwOne.");
        throw new IllegalAccessException("demo");
    }

    public static void main(String[] args) {
        throwOne();
    }
}*/

// This is now correct.

public class ThrowsDemo {
    static void throwOne() throws IllegalAccessException {
        System.out.println("Inside throwOne.");
        throw new IllegalAccessException("demo");
    }

    public static void main(String[] args) {
        try {
            throwOne();
        } catch (IllegalAccessException e) {
            System.out.println("Caught " + e);
        }
    }
}
