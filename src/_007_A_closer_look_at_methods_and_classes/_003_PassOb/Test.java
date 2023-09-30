package _007_A_closer_look_at_methods_and_classes._003_PassOb;

public class Test {
    int a, b;

    Test(int i, int j){
        a = i;
        b = j;
    }

    // return true if o equal to the invoking objects
    boolean equalTo(Test o) {
        if(o.a == a && o.b == b) return true;
        else return false;
    }
}
