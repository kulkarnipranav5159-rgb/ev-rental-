import java.util.ArrayList;
import java.util.List;

class Vehicle {
    String model;
    double dailyRate;
    boolean isAvailable = true;

    public Vehicle(String model, double dailyRate) {
        this.model = model;
        this.dailyRate = dailyRate;
    }
}

public class RentalSystem {
    public static void main(String[] args) {
        List<Vehicle> fleet = new ArrayList<>();
        fleet.add(new Vehicle("Tesla Model 3", 5000.0));
        fleet.add(new Vehicle("Ather 450X", 800.0));

        System.out.println("--- EV Rental Platform Logic Ready ---");
        for (Vehicle v : fleet) {
            System.out.println("Model: " + v.model + " | Price: " + v.dailyRate);
        }
    }
}
