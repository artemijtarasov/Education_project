package _007_A_closer_look_at_methods_and_classes._003_PassOb;

// Objects may be passed to methods.

public class PassOb {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Test ob1 = new Test(100, 22);
        Test ob2 = new Test(100, 22);
        Test ob3 = new Test(-1, -1);

        System.out.println("ob1 == ob2: " + ob1.equalTo(ob2));
        System.out.println("ob1 == ob3: " + ob1.equalTo(ob3));
    }

}
