public class Food {
    String name;
    double price;

    Food(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String toString() {
        return this.name + "\n" + this.price;
    }
}
