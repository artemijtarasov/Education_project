package _005_Control_statements._029_Return;

// Demonstrate return

public class Return {

    public static void main(String[] args) {
        boolean t = true;

        System.out.println("Before th return.");

        if(t) return; // return to caller

        System.out.println("This won`t execute.");
    }

}
