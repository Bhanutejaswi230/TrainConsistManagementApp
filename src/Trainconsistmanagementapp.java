import java.util.ArrayList;
import java.util.List;
public class Trainconsistmanagementapp {
    static class InvalidCapacityException extends Exception {
        public InvalidCapacityException(String message) {
            super(message);
        }
    }
    static class PassengerBogie {
        String type;
        int capacity;
        PassengerBogie(String type, int capacity) throws InvalidCapacityException {
            if (capacity <= 0) {
                throw new InvalidCapacityException("Capacity must be greater than zero");
            }
            this.type = type;
            this.capacity = capacity;
        }
        public String toString() {
            return type + " Bogie - Capacity: " + capacity;
        }
    }
    public static void main(String[] args) {
        List<PassengerBogie> bogies = new ArrayList<>();
        try {
            bogies.add(new PassengerBogie("Sleeper", 72));
            bogies.add(new PassengerBogie("AC Chair", 56));
            bogies.add(new PassengerBogie("First Class", 40));
            bogies.add(new PassengerBogie("General", -10));
        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("\nValid Passenger Bogies in Train:");
        for (PassengerBogie b : bogies) {
            System.out.println(b);
        }
    }
}