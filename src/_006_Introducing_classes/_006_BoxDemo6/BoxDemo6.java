package _006_Introducing_classes._006_BoxDemo6;

// Here, Box uses a constructor to initialize the dimensions of a box.

public class BoxDemo6 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // declare allocate, an initialize Box objects
        Box mybox1 = new Box();
        Box mybox2 = new Box();

        double vol;

        // get volume of first box
        vol = mybox1.volume();
        System.out.println("Volume is " + vol);

        // get volume of second box
        vol = mybox2.volume();
        System.out.println("Volume is " + vol);
    }

}
