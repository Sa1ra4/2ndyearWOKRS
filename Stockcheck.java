public class Stockcheck {
    public class Main {

    public static void main(String[] args) {
        // Sample dataset containing hot, normal, and edge-case freezing temperatures
        int[] dailyTemps = {25, 34, 28, 31, 15, 40, -5, 30};

        System.out.println("=== Running Data_Structures_Gatekeeper: Weather Diagnostic ===");
        
        // Orchestration: Extract hot temperatures (30°C or above) using the two-pass primitive utility
        int[] hotTemps = extractHotTemperatures(dailyTemps);

        // Orchestration: Print results via helper method
        System.out.print("Filtered Hot Temperatures Array: ");
        printArrayHelper(hotTemps);
    }

    /**
     * Extracts hot temperatures (>= 30) from a raw primitive array using a two-pass memory strategy.
     * Includes defensive programming guards for null or empty edge cases.
     */
    public static int[] extractHotTemperatures(int[] input) {
        // Defensive Programming Guard
        if (input == null || input.length == 0) {
            return new int[0]; 
        }

        // Pass 1: Count hot temperatures using a for-each loop to find exact memory size
        int hotCount = 0;
        for (int temp : input) {
            if (temp >= 30) {
                hotCount++;
            }
        }

        // Dynamic Allocation based on filtered output sizing
        int[] result = new int[hotCount];
        int targetIndex = 0;

        // Pass 2: Populate the primitive array using an indexed for loop
        for (int i = 0; i < input.length; i++) {
            if (input[i] >= 30) {
                result[targetIndex] = input[i];
                targetIndex++;
            }
        }

        return result;
    }

    /**
     * Utility method to safely format and print primitive arrays.
     */
    public static void printArrayHelper(int[] array) {
        if (array == null || array.length == 0) {
            System.out.println("[]");
            return;
        }

        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "°C");
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
}

