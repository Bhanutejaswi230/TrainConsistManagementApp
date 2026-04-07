import java.util.ArrayList;
import java.util.List;
public class Trainconsistmanagementapp {
    static class CargoSafetyException extends RuntimeException {
        public CargoSafetyException(String message) {
            super(message);
        }
    }
    static class GoodsBogie {
        private String shape;
        private String cargo;
        public GoodsBogie(String shape) {
            this.shape = shape;
        }
        public void assignCargo(String cargo) {
            try {
                if (shape.equalsIgnoreCase("Rectangular") &&
                        cargo.equalsIgnoreCase("Petroleum")) {

                    throw new CargoSafetyException(
                            "Unsafe Cargo Assignment: Petroleum cannot be assigned to Rectangular bogie"
                    );
                }
                this.cargo = cargo;
                System.out.println("Cargo assigned successfully: " + cargo);
            } catch (CargoSafetyException e) {
                System.out.println("Error: " + e.getMessage());
            } finally {
                System.out.println("Cargo assignment process completed for " + shape + " bogie.\n");
            }
        }
        public String toString() {
            return "Bogie Shape: " + shape + " | Cargo: " + cargo;
        }
    }
    public static void main(String[] args) {
        List<GoodsBogie> bogies = new ArrayList<>();
        GoodsBogie bogie1 = new GoodsBogie("Cylindrical");
        GoodsBogie bogie2 = new GoodsBogie("Rectangular");
        bogies.add(bogie1);
        bogies.add(bogie2);
        System.out.println("=== Cargo Assignment Simulation ===\n");
        bogie1.assignCargo("Petroleum");
        bogie2.assignCargo("Petroleum");
        bogie2.assignCargo("Coal");
        System.out.println("=== Final Train Bogie Status ===");
        for (GoodsBogie b : bogies) {
            System.out.println(b);
        }
    }
}