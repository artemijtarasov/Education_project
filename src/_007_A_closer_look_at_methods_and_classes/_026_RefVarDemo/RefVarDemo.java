package _007_A_closer_look_at_methods_and_classes._026_RefVarDemo;

public class RefVarDemo {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        var mc = new MyClass(10); // notice the use of var here

        System.out.println("Value of i in mc is " + mc.geti());
        mc.seti(19);
        System.out.println("Value of i in mc now " + mc.geti());
    }

}

