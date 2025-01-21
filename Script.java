public class Script {
    public static void main(String[] args) {

        Person p1 = new Person("mehdi", 21);

        Hero h1 = new Hero("batman", 39, "Money$$$");

        String result = h1.toString();
        System.out.println(result);

    }
}
