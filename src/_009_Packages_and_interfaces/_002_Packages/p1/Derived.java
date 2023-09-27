package _009_Packages_and_interfaces._002_Packages.p1;

public class Derived extends Protection{
    Derived(){
        System.out.println("Derived constructor");
        System.out.println("n = " + n);

        // class only
//        System.out.println("n_pri = " + n_pri);

        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }
}
