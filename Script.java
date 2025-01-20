public class Script {
    public static void main(String[] args) {
        Car car = new Car();
        Bike bike = new Bike();

        car.go();
        bike.stop();
        System.out.println(car.doors);
        System.out.println(bike.pedals);
    }
}
