import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
public class Trainconsistmanagementapp {
    private static final String CARGO_PATTERN = "^[A-Z]{3}-[A-Z]{2}$";
    private static final String TRAIN_PATTERN = "^TRN-[0-9]{4}$";
    static class Bogie {
        String type;
        int capacity;
        Bogie(String type, int capacity) {
            this.type = type;
            this.capacity = capacity;
        }
        public int getCapacity() {
            return capacity;
        }
        public String toString() {
            return type + " Bogie - Capacity: " + capacity;
        }
    }
    public boolean isValidCargoCode(String code) {
        if (code == null || code.isEmpty()) {
            return false;
        }
        return Pattern.matches(CARGO_PATTERN, code);
    }
    public boolean isValidTrainID(String trainId) {
        if (trainId == null || trainId.isEmpty()) {
            return false;
        }
        return Pattern.matches(TRAIN_PATTERN, trainId);
    }
    public int calculateTotalSeats(List<Bogie> bogies) {
        return bogies.stream()
                .map(b -> b.getCapacity())
                .reduce(0, Integer::sum);
    }
    public static void main(String[] args) {
        Trainconsistmanagementapp app = new Trainconsistmanagementapp();
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 40));
        bogies.add(new Bogie("General", 90));
        System.out.println("Train Bogies:");
        for (Bogie b : bogies) {
            System.out.println(b);
        }
        int totalSeats = app.calculateTotalSeats(bogies);
        System.out.println("\nTotal Seating Capacity: " + totalSeats);
        // Regex validation examples
        System.out.println("\nValidation Results:");
        System.out.println("Cargo PET-AB: " + app.isValidCargoCode("PET-AB"));
        System.out.println("Cargo PET-ab: " + app.isValidCargoCode("PET-ab"));
        System.out.println("Train TRN-1234: " + app.isValidTrainID("TRN-1234"));
        System.out.println("Train TRN-123: " + app.isValidTrainID("TRN-123"));
    }
}