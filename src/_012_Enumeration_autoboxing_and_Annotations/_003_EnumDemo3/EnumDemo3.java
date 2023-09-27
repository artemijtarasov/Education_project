package _012_Enumeration_autoboxing_and_Annotations._003_EnumDemo3;

public class EnumDemo3 {
    public static void main(String[] args) {
        Apple ap;

        // Display price of Winesap.
        System.out.println("Winesap costs " + Apple.Winesap.getPrice() + " cents.");

        // Display all apples and prices.
        System.out.println("All apples prices:");
        for (Apple a : Apple.values())
            System.out.println(a + " costs " + a.getPrice() + " cents.");
    }
}
