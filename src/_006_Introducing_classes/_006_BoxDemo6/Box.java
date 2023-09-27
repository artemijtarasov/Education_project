package _006_Introducing_classes._006_BoxDemo6;

public class Box {
    double width;
    double height;
    double depth;

    // this is the constructor for Box
    Box(){
        System.out.println("Constructing Box");
        width = 10;
        height = 10;
        depth = 10;
    }

    // compute and return volume
    double volume() {
        return width * height * depth;
    }
}
