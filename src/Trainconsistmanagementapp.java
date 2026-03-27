import java.util.ArrayList;
import java.util.List;
public class Trainconsistmanagementapp {
    static class GoodsBogie {
        String type;
        String cargo;
        GoodsBogie(String type, String cargo) {
            this.type = type;
            this.cargo = cargo;
        }
        public String getType() {
            return type;
        }
        public String getCargo() {
            return cargo;
        }
        public String toString() {
            return type + " Bogie carrying " + cargo;
        }
    }
    // UC12 Safety Validation using Streams
    public static boolean checkSafetyCompliance(List<GoodsBogie> bogies) {
        return bogies.stream()
                .allMatch(bogie ->
                        !bogie.getType().equalsIgnoreCase("Cylindrical")
                                || bogie.getCargo().equalsIgnoreCase("Petroleum")
                );
    }
    public static void main(String[] args) {
        List<GoodsBogie> bogies = new ArrayList<>();
        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        bogies.add(new GoodsBogie("Open", "Coal"));
        bogies.add(new GoodsBogie("Box", "Grain"));
        System.out.println("Goods Bogies:");
        bogies.forEach(System.out::println);
        boolean isSafe = checkSafetyCompliance(bogies);
        System.out.println("\nSafety Compliance Status: " + isSafe);
        if (isSafe) {
            System.out.println("Train formation is SAFE.");
        } else {
            System.out.println("Train formation is UNSAFE.");
        }
    }
}