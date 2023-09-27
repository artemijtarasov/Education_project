package _009_Packages_and_interfaces._005_TestIface2;

public class Client implements Callback {
    // Implements Callback`s interface
    public void callback(int p){
        System.out.println("callback called with " + p);
    }

    void nonIfaceMeth(){
        System.out.println("Classes that implement interface " +
                "may also define other members, too.");
    }
}
