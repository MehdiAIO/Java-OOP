public class Script {
    // polymorphism = greek word for poly-"many", morph-"form"

    // The ability of an object to identify as more than one typeé
    public static void main(String[] args) {
        Boat boat = new Boat();
        Bike bike = new Bike();
        Car car = new Car();

        Vehicule[] vehicules = {boat,bike,car};
        for(Vehicule x : vehicules){
            x.go();
        }
    }

}
