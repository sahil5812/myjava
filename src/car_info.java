public class car_info {

    // attributes
    String make = "Toyota";
    String model = "Supra";
    int year = 2024;
    double price = 75000.50;
    boolean isRunning = false;

    // methods
    void drive() {
        isRunning = true;
        System.out.println("🚗 The car is now driving!");
    }

    void brake() {
        isRunning = false;
        System.out.println("🛑 The car has stopped.");
    }
}
