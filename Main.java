import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ParkingSystem parkingSystem = new ParkingSystem(5);  // Create a parking system with 5 slots
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nElectronic Parking System");
            System.out.println("1. Park Vehicle");
            System.out.println("2. Remove Vehicle");
            System.out.println("3. View Available Slots");
            System.out.println("4. View Occupied Slots");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter vehicle number: ");
                    String vehicleNumber = scanner.nextLine();
                    System.out.print("Enter vehicle type (Car/Bike): ");
                    String vehicleType = scanner.nextLine();
                    Vehicle vehicle = new Vehicle(vehicleNumber, vehicleType);
                    parkingSystem.parkVehicle(vehicle);
                    break;

                case 2:
                    System.out.print("Enter vehicle number to remove: ");
                    String removeNumber = scanner.nextLine();
                    parkingSystem.removeVehicle(removeNumber);
                    break;

                case 3:
                    parkingSystem.viewAvailableSlots();
                    break;

                case 4:
                    parkingSystem.viewOccupiedSlots();
                    break;

                case 5:
                    System.out.println("Exiting... Thank you!");
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
