package _008_Inheritance._002_DemoBoxWeight;

// Here, Box is extended to include weight.

public class BoxWeight extends Box{
    double weight; // weight of box

    // constructor for BoxWeight
    BoxWeight(double w, double h, double d, double m){
        width = w;
        height = h;
        depth = d;
        weight = m;
    }
}
