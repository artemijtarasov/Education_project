package _012_Enumeration_autoboxing_and_Annotations._003_EnumDemo3;

// USe an enum constructor, instance variable, and method.

public enum Apple {
    Jonathan(10), GoldenDel(9), RedDel(12), Winesap(15), Cortland(8);

    private int price; // price for each apple

    // Constructor
    Apple(int p) {
        price = p;
    }

    int getPrice() {
        return price;
    }
}
