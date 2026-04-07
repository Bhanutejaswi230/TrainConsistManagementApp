public class Trainconsistmanagementapp {
    // UC18: Linear Search for Bogie ID
    public static boolean searchBogie(String[] bogieIds, String searchKey) {
        for (int i = 0; i < bogieIds.length; i++) {
            if (bogieIds[i].equals(searchKey)) {
                return true; // Bogie found
            }
        }
        return false; // Bogie not found
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
        boolean result = searchBogie(bogieIds, searchKey);
        if (result) {
            System.out.println("Bogie ID " + searchKey + " found in the train consist.");
        } else {
            System.out.println("Bogie ID " + searchKey + " not found in the train consist.");
        }
        System.out.println("Search operation completed. Program continues...");
    }
}