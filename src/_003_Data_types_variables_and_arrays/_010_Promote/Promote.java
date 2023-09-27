package _003_Data_types_variables_and_arrays._010_Promote;

public class Promote {

    public static void main(String[] args) {
        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = .1234;
        double result = (f * b) + (i / c) - (d * s);
        System.out.println((f * b) + " + " + (i  / c) + " - " + (d * s));
        System.out.println("result = " + result);
    }

}
