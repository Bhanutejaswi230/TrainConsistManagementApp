import java.util.Arrays;
public class Trainconsistmanagementapp {
    // UC17: Sort Bogie Names Using Arrays.sort()
    public static void sortBogieNames(String[] bogieNames) {
        Arrays.sort(bogieNames);
    }
    public static void main(String[] args) {
        String[] bogieNames = {
                "Sleeper",
                "AC Chair",
                "First Class",
                "General",
                "Luxury"
        };
        System.out.println("Bogie Names Before Sorting:");
        System.out.println(Arrays.toString(bogieNames));
        sortBogieNames(bogieNames);
        System.out.println("Bogie Names After Sorting:");
        System.out.println(Arrays.toString(bogieNames));
        System.out.println("Sorting completed using Arrays.sort(). Program continues...");
    }
}