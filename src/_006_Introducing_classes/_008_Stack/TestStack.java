package _006_Introducing_classes._008_Stack;

public class TestStack {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Stack mystack1 = new Stack();
        Stack mystack2 = new Stack();

        // push some numbers of the stack
        for(int i = 0; i < 10; i++) mystack1.push(i);
        for(int i = 10; i < 20; i++) mystack2.push(i);

        // pop those numbers of the stack
        System.out.println("Stack in mystack1:");
        for(int i = 0; i < 10; i++)
            System.out.println(mystack1.pop());

        System.out.println("Stack in mystack2:");
        for(int i = 0; i < 10; i++)
            System.out.println(mystack2.pop());
    }

}
