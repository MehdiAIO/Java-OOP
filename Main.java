public class Main {
    public static void main(String[] args) {
        Car car = new Car("Black", "camaro", 12000);
        System.out.println("Color : "+car.getColor()+"\nModel : "+car.getModel()+"\nPrice : "+car.getPrice());
        car.setModel("mustang");
        System.out.println(car.getModel());
    }
}
