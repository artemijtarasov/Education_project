package _009_Packages_and_interfaces._004_TestIface;

public class Client implements Callback{
    // Implements Callback`s interface
    public void callback(int p){
        System.out.println("callback called with " + p);
    }

    void nonIfaceMeth(){
        System.out.println("Classes that implement interface " +
                "may also define other members, too.");
    }
}
