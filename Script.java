public class Script {
    public static void main(String[] args) {
        Car car1 = new Car("Ford", "Mustang", 2007);
        car1.setDate(2022);
        car1.setMake("Tesla");
        car1.setModel("areox");
        System.out.println(car1.getModel());
        System.out.println(car1.getMake());
        System.out.println(car1.getDate());
    }
}
