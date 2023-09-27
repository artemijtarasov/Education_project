package _009_Packages_and_interfaces._002_Packages.p1;

public class SamePackage {
    SamePackage(){
        Protection p = new Protection();
        System.out.println("Same package constructor");
        System.out.println("n = " + p.n);

        // class only
//        System.out.println("n_pri = " + n_pri);

        System.out.println("n_pro = " + p.n_pro);
        System.out.println("n_pub = " + p.n_pub);
    }
}
