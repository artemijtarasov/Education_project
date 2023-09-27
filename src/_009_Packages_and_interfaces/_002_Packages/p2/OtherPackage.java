package _009_Packages_and_interfaces._002_Packages.p2;

public class OtherPackage {
    OtherPackage(){
        _009_Packages_and_interfaces._002_Packages.p1.Protection p = new _009_Packages_and_interfaces._002_Packages.p1.Protection();
        System.out.println("Other package constructor");

        // class or package only
//        System.out.println("n = " + p.n);

        // class only
//        System.out.println("n_pri = " + p.n_pri);

        // class, subclass or package only
//        System.out.println("n_pro = " + p.n_pro);

        System.out.println("n-pub = " + p.n_pub);
    }
}
