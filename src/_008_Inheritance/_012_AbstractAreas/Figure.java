package _008_Inheritance._012_AbstractAreas;

abstract class Figure {
    double dim1;
    double dim2;

    Figure(double a, double b){
        dim1 = a;
        dim2 = b;
    }

    // area is now am abstract method
    abstract double area();
}
