public class Car {
    private String color;
    private double price;
    private String model;
    Car(String color,String model,double price){
        this.color = color;
        this.model = model;
        this.price = price;
    }
    String getColor(){
        return this.color;
    }
    String getModel(){
        return this.model;
    }
    double getPrice(){
        return this.price;
    }

    void setColor(String color){
        this.color = color;
    }
    void setModel(String model){
        this.model = model;
    }
    void setPrice(double price){
        this.price = price;
    }
}
