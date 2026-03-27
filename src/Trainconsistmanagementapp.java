import java.util.*;
import java.util.stream.Collectors;
class Bogie {
    String name;
    int capacity;
    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }
    public String toString() {
        return name + " - Capacity: " + capacity;
    }
}
public class Trainconsistmanagementapp {

    public static void main(String[] args) {
        System.out.println(" Train Consist Management App ");
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 40));
        bogies.add(new Bogie("General", 90));
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        System.out.println("\nBogies in Train:");
        for (Bogie b : bogies) {
            System.out.println(b);
        }
        // UC10: Calculate total seats using map() and reduce()
        int totalSeats = bogies
                .stream()
                .map(b -> b.capacity)
                .reduce(0, Integer::sum);
        System.out.println("\nTotal Seating Capacity of Train: " + totalSeats);
    }
}