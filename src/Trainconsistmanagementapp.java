import java.util.Arrays;
public class Trainconsistmanagementapp {
    // UC19: Binary Search for Bogie ID
    public static boolean binarySearchBogie(String[] bogieIds, String searchKey) {
        if (bogieIds.length == 0) {
            return false;
        }
        Arrays.sort(bogieIds);
        int low = 0;
        int high = bogieIds.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int comparison = searchKey.compareTo(bogieIds[mid]);
            if (comparison == 0) {
                return true; // Found
            }
            if (comparison < 0) {
                high = mid - 1; // Search left half
            } else {
                low = mid + 1; // Search right half
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String[] bogieIds = {
                "BG101",
                "BG205",
                "BG309",
                "BG412",
                "BG550"
        };
        String searchKey = "BG309";
        boolean result = binarySearchBogie(bogieIds, searchKey);
        if (result) {
            System.out.println("Bogie ID " + searchKey + " found using Binary Search.");
        } else {
            System.out.println("Bogie ID " + searchKey + " not found.");
        }
        System.out.println("Binary search completed. Program continues...");
    }
}