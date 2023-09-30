package _007_A_closer_look_at_methods_and_classes._011_TestStack;

public class TestStack {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Stack mystack1 = new Stack();
        Stack mystack2 = new Stack();

        // push some numbers onto the stack
        for(int i = 0; i < 10; i++) mystack1.push(i);
        for(int i = 10; i < 20; i++) mystack2.push(i);

        // pop those numbers off the stack
        System.out.println("Stack in mystack1:");
        for(int i = 0; i < 10; i++)
            System.out.println(mystack1.pop());

        System.out.println("Stack in mystack2:");
        for(int i = 0; i < 10; i++)
            System.out.println(mystack2.pop());

        // these statements are not legal
        // mystack.tos = -2;
        // mystack2.stck[3] = 100;
    }

}
