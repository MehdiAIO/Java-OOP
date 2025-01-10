public class Person {
    String name;
    int age;
    double weight;

    Person(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    void hey() {
        System.out.println("hi there my name is " + this.name);
    }

    void age() {
        System.out.println("I have " + this.age + " years old");
    }

    void weight() {
        System.out.println("my weight is " + this.weight);
    }
}
