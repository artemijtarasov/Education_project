package _012_Enumeration_autoboxing_and_Annotations._007_AutoBox;

// Demonstrate autoboxing/unboxing

public class AutoBox {
    public static void main(String[] args) {
        Integer iOb = 100; // autobox on int

        int i = iOb; /// auto-unbox

        System.out.println(i + " " + iOb); // displays 100 100
    }
}
