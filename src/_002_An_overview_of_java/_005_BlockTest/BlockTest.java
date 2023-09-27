package _002_An_overview_of_java._005_BlockTest;

// Demonstrate a block of code

public class BlockTest {

    public static void main(String[] args) {
        int x, y;

        y = 20;

        // the target of this loop is a block
        for(x = 0; x < 10; x++) {
            System.out.println("this is x: " + x);
            System.out.println("This is y: " + y);
            y = y - 2;
        }
    }
}
