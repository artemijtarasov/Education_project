package _009_Packages_and_interfaces._002_Packages.p2;

public class Protection2 extends _009_Packages_and_interfaces._002_Packages.p1.Protection{
    Protection2(){
        System.out.println("Derived other package constructor");

        // class package only
//        System.out.println("n = " + n);

        // class only
//        System.out.println("n_pri = " + n_pri);

        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }
}
