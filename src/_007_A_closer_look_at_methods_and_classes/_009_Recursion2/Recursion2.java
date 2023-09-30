package _007_A_closer_look_at_methods_and_classes._009_Recursion2;

// Another simple example that uses recursion.

public class Recursion2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        RecTest ob = new RecTest(10);
        int i;

        for(i = 0; i < 10; i++) ob.values[i] = i;

        ob.printArray(10);
    }

}

