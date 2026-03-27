import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class Trainconsistmanagementapp {
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
    public static void main(String[] args) {
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 40));
        bogies.add(new Bogie("General", 90));
        bogies.add(new Bogie("Sleeper", 65));
        bogies.add(new Bogie("AC Chair", 58));
        bogies.add(new Bogie("Sleeper", 75));
        long loopStart = System.nanoTime();
        List<Bogie> loopFiltered = new ArrayList<>();
        for (Bogie b : bogies) {
            if (b.getCapacity() > 60) {
                loopFiltered.add(b);
            }
        }
        long loopEnd = System.nanoTime();
        long loopTime = loopEnd - loopStart;
        long streamStart = System.nanoTime();
        List<Bogie> streamFiltered =
                bogies.stream()
                        .filter(b -> b.getCapacity() > 60)
                        .collect(Collectors.toList());
        long streamEnd = System.nanoTime();
        long streamTime = streamEnd - streamStart;
        System.out.println("Loop Filtered Bogies:");
        loopFiltered.forEach(System.out::println);
        System.out.println("\nStream Filtered Bogies:");
        streamFiltered.forEach(System.out::println);
        System.out.println("\nLoop Execution Time: " + loopTime + " ns");
        System.out.println("Stream Execution Time: " + streamTime + " ns");
    }
}