package _008_Inheritance._007_Override;

public class B extends A{
    int k;

    B(int a, int b, int c){
        super(a, b);
        k = c;
    }

    // display k - this overrides show() in A
    void show(){
        System.out.println("k: " + k);
    }
}
