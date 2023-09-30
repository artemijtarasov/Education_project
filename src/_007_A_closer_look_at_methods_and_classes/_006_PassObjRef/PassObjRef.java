package _007_A_closer_look_at_methods_and_classes._006_PassObjRef;

// Objects are passed through their references.

public class PassObjRef {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Test ob =  new Test(15, 20);

        System.out.println("ob.a and ob.b before call: " + ob.a + " " + ob.b);

        ob.meth(ob);

        System.out.println("ob.a and ob.b after call: " + ob.a + " " + ob.b);
    }

}
