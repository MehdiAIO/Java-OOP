import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        System.out.println(fruits); // [Apple, Banana, Orange]

        fruits.remove("Banana");
        System.out.println(fruits.get(1)); // Orange

        fruits.set(0, "Mango");
        System.out.println(fruits); // [Mango, Orange]

        System.out.println(fruits.contains("Apple")); // false
        System.out.println(fruits.size()); // 2
        System.out.println(fruits.isEmpty());
    }
}
