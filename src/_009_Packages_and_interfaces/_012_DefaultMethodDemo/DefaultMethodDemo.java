package _009_Packages_and_interfaces._012_DefaultMethodDemo;

// Use the default method.

public class DefaultMethodDemo {
    public static void main(String[] args) {
        MyIFImp obj = new MyIFImp();

        // Can call getNumber(), because it is explicitly implemented by MyIFImp:
        System.out.println(obj.getNumber());

        // Can also call getString(), because of default implementation:
        System.out.println(obj.getString());
    }
}
