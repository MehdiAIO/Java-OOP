public class Script {
    public static void main(String[] args) {
        Person p1 = new Person("Mehdi", 21, 84.7);
        Person p2 = new Person("Ahmed", 18, 67.9);
        System.out.println(p1.name);
        p1.age();
        p1.weight();
        p2.hey();
    }
}
