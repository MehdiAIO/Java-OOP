public class Script {
    public static void main(String[] args) {
        Car car1 = new Car("BMW");
        Car car2 = new Car("Tesla");

        Garage garage = new Garage();

        garage.park(car1);
        garage.park(car2);
    }
}
