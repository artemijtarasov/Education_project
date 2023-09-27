package _009_Packages_and_interfaces._001_AccountBalance;

public class Balance {
    String name;
    double bal;

    Balance(String n, double b){
        name = n;
        bal = b;
    }

    void show(){
        if(bal < 0)
            System.out.print("--> ");
        System.out.println(name + ": $" + bal);
    }
}
