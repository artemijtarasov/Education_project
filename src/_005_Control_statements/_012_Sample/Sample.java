package _005_Control_statements._012_Sample;

public class Sample {

    public static void main(String[] args) {
        int a, b;

        b = 4;
        for(a = 1; a < b; a++) {
            System.out.println("a = " + a);
            System.out.println("b = " + b);
            b--;
        }
    }

}
