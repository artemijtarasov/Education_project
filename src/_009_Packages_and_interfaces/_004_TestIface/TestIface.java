package _009_Packages_and_interfaces._004_TestIface;

public class TestIface {
    public static void main(String[] args) {
        Callback c = new Client();
        c.callback(42);
    }
}
