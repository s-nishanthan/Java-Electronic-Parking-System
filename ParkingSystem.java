import java.util.ArrayList;
import java.util.List;

public class ParkingSystem {
    private List<ParkingSlot> slots;

    public ParkingSystem(int totalSlots) {
        slots = new ArrayList<>();
        for (int i = 1; i <= totalSlots; i++) {
            slots.add(new ParkingSlot(i));
        }
    }

    public void parkVehicle(Vehicle vehicle) {
        for (ParkingSlot slot : slots) {
            if (!slot.isOccupied()) {
                slot.parkVehicle(vehicle);
                return;
            }
        }
        System.out.println("No available slots.");
    }

    public void removeVehicle(String vehicleNumber) {
        for (ParkingSlot slot : slots) {
            if (slot.isOccupied() && slot.getVehicle().getVehicleNumber().equals(vehicleNumber)) {
                slot.removeVehicle();
                return;
            }
        }
        System.out.println("Vehicle not found.");
    }

    public void viewAvailableSlots() {
        System.out.println("Available Slots:");
        for (ParkingSlot slot : slots) {
            if (!slot.isOccupied()) {
                System.out.println("Slot Number: " + slot.getSlotNumber());
            }
        }
    }

    public void viewOccupiedSlots() {
        System.out.println("Occupied Slots:");
        for (ParkingSlot slot : slots) {
            if (slot.isOccupied()) {
                System.out.println("Slot Number: " + slot.getSlotNumber() + ", Vehicle: " + slot.getVehicle());
            }
        }
    }
}
