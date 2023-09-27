package _009_Packages_and_interfaces._006_NestedIFDemo;

// B implements the nested interface.

public class B implements A.NestedIF{
    public boolean isNotNegative(int x){
        return x < 0 ? false : true;
    }
}
