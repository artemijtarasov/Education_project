package _007_A_closer_look_at_methods_and_classes._011_TestStack;

// This class defines an integer stack that can hold 10 values.

public class Stack {
    // Now, both stck and tos are private. This means that they cannot
    // be accidentally or maliciously altered in a way that would be
    // harmful to the stack.
    private int[] stck = new int[10];
    private int tos;

    // initialize top-of-stack
    Stack() {
        tos = -1;
    }

    // push an item onto the stack
    void push(int item) {
        if(tos == 9)
            System.out.println("Stack is full.");
        else
            stck[++tos] = item;
    }

    // pop an item from the stack
    int pop() {
        if(tos < 0) {
            System.out.println("Stack underflow.");
            return 0;
        }
        else
            return stck[tos--];
    }
}
