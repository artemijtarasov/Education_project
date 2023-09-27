package _009_Packages_and_interfaces._012_DefaultMethodDemo;

// Implement MyIF.

public class MyIFImp implements MyIF{
    // Only getNumber() define by MyIF needs to be implemented.
    // getString() can be allowed to default.
    public int getNumber(){
        return 100;
    }
}
