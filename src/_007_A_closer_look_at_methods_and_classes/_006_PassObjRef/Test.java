package _007_A_closer_look_at_methods_and_classes._006_PassObjRef;

public class Test {
    int a, b;

    Test(int i, int j){
        a = i;
        b = j;
    }

    // pass an object
    void meth(Test o) {
        o.a += 2;
        o.b /= 2;
    }
}
