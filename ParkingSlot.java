public class ParkingSlot {
    private int slotNumber;
    private boolean isOccupied;
    private Vehicle vehicle;

    public ParkingSlot(int slotNumber) {
        this.slotNumber = slotNumber;
        this.isOccupied = false;
        this.vehicle = null;
    }

    public int getSlotNumber() {
        return slotNumber;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void parkVehicle(Vehicle vehicle) {
        if (!isOccupied) {
            this.vehicle = vehicle;
            this.isOccupied = true;
            System.out.println("Vehicle parked in slot: " + slotNumber);
        } else {
            System.out.println("Slot is already occupied.");
        }
    }

    public void removeVehicle() {
        if (isOccupied) {
            System.out.println("Vehicle removed from slot: " + slotNumber);
            this.vehicle = null;
            this.isOccupied = false;
        } else {
            System.out.println("Slot is already empty.");
        }
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
}
