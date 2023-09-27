package _008_Inheritance._011_AbstractDemo;

abstract class A {
    abstract void callme();

    // concrete methods are still allowed in abstract classes
    void callmetoo(){
        System.out.println("This is a concrete method.");
    }
}
