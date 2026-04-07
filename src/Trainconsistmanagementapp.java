import java.util.Arrays;
public class Trainconsistmanagementapp {
    // UC16: Bubble Sort Method
    public static void bubbleSort(int[] capacities) {
        int n = capacities.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (capacities[j] > capacities[j + 1]) {
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;

                }
            }
        }
    }
    public static void main(String[] args) {
        int[] passengerCapacities = {72, 56, 24, 70, 60};
        System.out.println("Passenger Bogie Capacities Before Sorting:");
        System.out.println(Arrays.toString(passengerCapacities));
        bubbleSort(passengerCapacities);
        System.out.println("Passenger Bogie Capacities After Sorting:");
        System.out.println(Arrays.toString(passengerCapacities));
        System.out.println("Sorting completed. Program continues...");
    }
}