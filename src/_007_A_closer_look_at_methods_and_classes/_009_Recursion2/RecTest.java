package _007_A_closer_look_at_methods_and_classes._009_Recursion2;

public class RecTest {
    int[] values;

    RecTest(int i){
        values = new int[i];
    }

    // display array -- recursively
    void printArray(int i) {
        if(i == 0) return;
        else printArray(i - 1);
        System.out.println("[" + (i - 1) + "] " + values[i - 1]);
    }
}
