package _007_A_closer_look_at_methods_and_classes._021_CommandLine;

// Display all command-line arguments.

public class CommandLine {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        for(int i = 0; i < args.length; i++)
            System.out.println("args[" + i + "]: " + args[i]);
    }

}
