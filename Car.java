public class Car {
    private String make;
    private String model;
    private int date;

    Car(String make, String model, int date) {
        this.setMake(make);
        this.setModel(model);
        this.setDate(date);
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getDate() {
        return date;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setDate(int date) {
        this.date = date;
    }
}
