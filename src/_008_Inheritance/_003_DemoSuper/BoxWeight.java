package _008_Inheritance._003_DemoSuper;

// BoxWeight now fully implements all constructors/

public class BoxWeight extends Box{
    double weight; // weight of box

    // construct clone of an object
    BoxWeight(BoxWeight ob){ // pass object to constructor
        super(ob);
        weight = ob.weight;
    }

    // constructor when all parameters are specified
    BoxWeight(double w, double h, double d, double m){
        super(w, h, d);
        weight = m;
    }

    // default constructor
    BoxWeight(){
        super();
        weight = -1;
    }

    // constructor used when cube is created
    BoxWeight(double len, double m){
        super(len);
        weight = m;
    }
}
