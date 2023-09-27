package _006_Introducing_classes._005_BoxDemo5;

// This program uses a parameterized method.

public class BoxDemo5 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;

        // initialized each box
        mybox1.setDim(10, 20, 15);
        mybox2.setDim(3, 6, 9);

        // get volume of first box
        vol = mybox1.volume();
        System.out.println("Volume is " + vol);

        // get volume of second box
        vol = mybox2.volume();
        System.out.println("Volume is " + vol);
    }

}
