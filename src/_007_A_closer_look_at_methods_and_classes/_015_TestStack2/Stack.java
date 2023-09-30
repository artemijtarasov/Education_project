package _007_A_closer_look_at_methods_and_classes._015_TestStack2;

// Improve the Stack class that uses the length array member.

public class Stack {
    private int[] stck;
    private int tos;

    // allocate and initialize stack
    Stack(int size){
        stck = new int[size];
        tos = -1;
    }

    // push an item onto the stack
    void push(int item) {
        if(tos == stck.length - 1) // use length member
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
