public class Trainconsistmanagementapp {
    // UC20: Search with validation and exception handling
    public static boolean searchBogie(String[] bogieIds, String searchKey) {
        if (bogieIds == null || bogieIds.length == 0) {
            throw new IllegalStateException("Cannot perform search: No bogies available in the train consist.");
        }
        for (int i = 0; i < bogieIds.length; i++) {
            if (bogieIds[i].equals(searchKey)) {
                return true; // Found
            }
        }
        return false; // Not found
    }
    public static void main(String[] args) {
        String[] bogieIds = {
                "BG101",
                "BG205",
                "BG309"
        };
        String searchKey = "BG205";
        try {
            boolean result = searchBogie(bogieIds, searchKey);
            if (result) {
                System.out.println("Bogie ID " + searchKey + " found.");
            } else {
                System.out.println("Bogie ID " + searchKey + " not found.");
            }
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());

        }
        System.out.println("Program continues...");
    }
}