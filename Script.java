public class Script {
    public static void main(String[] args) {
        Fish fish = new Fish();
        Hawk hawk = new Hawk();
        Rabbit rabbit = new Rabbit();

        rabbit.flee();
        hawk.hunt();
        fish.flee();
        fish.hunt();
    }
}
