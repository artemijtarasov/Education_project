package _007_A_closer_look_at_methods_and_classes._002_OverloadCons;

// Here, Box defines three constructors to initialize the dimensions
// of a box various ways.

public class OverloadCons {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // create boxes using the various constructors
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box();
        Box mycube = new Box(7);

        double vol;

        // get volume of first box
        vol = mybox1.volume();
        System.out.println("Volume of mybox1 is " + vol);

        // get volume of second box
        vol = mybox2.volume();
        System.out.println("Volume of mybox2 is " + vol);

        // get volume of cube
        vol = mycube.volume();
        System.out.println("Volume of mycube is " + vol);
    }

}
