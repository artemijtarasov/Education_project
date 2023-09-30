package _007_A_closer_look_at_methods_and_classes._007_RetOb;

public class Test {
    int a;

    Test(int i){
        a = i;
    }

    Test incrByTen() {
        Test temp = new Test(a + 10);
        return temp;
    }
}

