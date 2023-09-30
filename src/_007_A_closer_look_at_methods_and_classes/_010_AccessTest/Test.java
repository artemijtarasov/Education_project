package _007_A_closer_look_at_methods_and_classes._010_AccessTest;

public class Test {
    int a;			// default access
    public int b;	// public access
    private int c;	// private access

    // methods to access c
    void setc(int i) {	// set c`s value
        c = i;
    }

    int getc() {	// get c`s value
        return c;
    }
}
