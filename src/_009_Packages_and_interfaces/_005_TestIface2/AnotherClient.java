package _009_Packages_and_interfaces._005_TestIface2;

// Another implementation of Callback.

public class AnotherClient implements Callback{
    // Implement AnotherClient implement Callback
    public void callback(int p){
        System.out.println("Another version of callback");
        System.out.println("p squared is " + (p * p));
    }
}
