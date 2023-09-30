package _007_A_closer_look_at_methods_and_classes._026_RefVarDemo;

// LOcal variable type inference with a user-defined class type.

public class MyClass {
    private int i;

    MyClass(int k) {i = k;}

    int geti() {return i;}
    void seti(int k) {if(k >= 0) i = k;}
}
