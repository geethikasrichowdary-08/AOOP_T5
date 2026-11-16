class Parking {
    int spotId;
    String location;
    boolean available;

    void displayDetails() {
        System.out.println("Spot ID: " + spotId);
        System.out.println("Location: " + location);
        System.out.println("Available: " + available);
    }
}

public class ParkingSpot {
    public static void main(String[] args) {
        Parking p1 = new Parking();

        p1.spotId = 101;
        p1.location = "Hyderabad";
        p1.available = true;

        p1.displayDetails();
    }
}