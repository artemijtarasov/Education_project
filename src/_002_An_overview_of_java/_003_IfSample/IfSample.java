package _002_An_overview_of_java._003_IfSample;

// Demonstrate the if.

public class IfSample {
    public static void main(String[] args) {

        int x, y;

        x = 10;
        y = 20;

        if(x < y) System.out.println("x is less then y");

        x = x * 2;

        if(x == y) System.out.println("x now equal to y");

        x = x * 2;

        if(x > y) System.out.println("x now greater then y");

        // this won`t display anything
        if(x == y) System.out.println("you won`t see this");
    }
}
