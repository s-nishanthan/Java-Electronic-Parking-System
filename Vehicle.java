public class Vehicle {
    private String vehicleNumber;
    private String vehicleType;  // Car, Bike, etc.

    public Vehicle(String vehicleNumber, String vehicleType) {
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    @Override
    public String toString() {
        return "Vehicle Number: " + vehicleNumber + ", Type: " + vehicleType;
    }
}
