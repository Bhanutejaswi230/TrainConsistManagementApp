import java.util.*;
public class Trainconsistmanagementapp {
    public static void main(String[] args) {
        System.out.println(" Train Consist Management App ");
        List<String> bogies = new ArrayList<>();
        bogies.add("Sleeper");
        bogies.add("AC Chair");
        bogies.add("First Class");
        System.out.println("Bogies after adding: " + bogies);
        bogies.remove("AC Chair");
        System.out.println("After removing AC Chair: " + bogies);
        System.out.println("Is Sleeper present? " + bogies.contains("Sleeper"));
    }
}