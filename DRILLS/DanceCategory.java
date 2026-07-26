import java.util.Scanner;

public class DanceCategory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== DANCE COMPETITION SCORE ANALYSER ===");
        System.out.print("Enter the total number of dance routines: ");
        int totalRoutines = scanner.nextInt();
        scanner.nextLine(); 

        String[] routineNames = new String[totalRoutines];
        String[] categories = new String[totalRoutines];
        double[] scores = new double[totalRoutines];

        System.out.println("\n--- Routine Input ---");
        for (int i = 0; i < totalRoutines; i++) {
            System.out.print("\nEnter name for Routine #" + (i + 1) + ": ");
            routineNames[i] = scanner.nextLine();

            System.out.print("Enter category (1 for Solo, 2 for Group): ");
            int catChoice = scanner.nextInt();
            categories[i] = (catChoice == 1) ? "Solo" : "Group";

            System.out.print("Enter score for \"" + routineNames[i] + "\" (0-100): ");
            scores[i] = scanner.nextDouble();
            scanner.nextLine(); 
        }

        double totalScoreSum = 0;
        int topIndex = 0;

        double soloTotalScore = 0;
        int soloCount = 0;

        double groupTotalScore = 0;
        int groupCount = 0;

        System.out.println("\n--- Performance Results ---");

        // LOOP 2: Process routines and calculate category totals
        for (int i = 0; i < totalRoutines; i++) {
            double score = scores[i];
            totalScoreSum += score;

            // Track highest score overall
            if (score > scores[topIndex]) {
                topIndex = i;
            }

            // Category tracking
            if (categories[i].equals("Solo")) {
                soloTotalScore += score;
                soloCount++;
            } else {
                groupTotalScore += score;
                groupCount++;
            }

            // Determine Award Tier
            String award;
            if (score >= 90.0) {
                award = "Platinum";
            } else if (score >= 80.0) {
                award = "High Gold";
            } else if (score >= 70.0) {
                award = "Gold";
            } else {
                award = "Silver";
            }

            System.out.printf("Routine: %-18s | Category: %-5s | Score: %5.1f | Award: %s\n",
                    routineNames[i], categories[i], score, award);
        }

        // Summary Calculations
        double overallAverage = totalScoreSum / totalRoutines;
        double soloAverage = (soloCount > 0) ? (soloTotalScore / soloCount) : 0;
        double groupAverage = (groupCount > 0) ? (groupTotalScore / groupCount) : 0;

        // Display Category & Overall Breakdown
        System.out.println("\n--- Category Summary Report ---");
        System.out.println("Total Routines: " + totalRoutines);
        System.out.printf("Overall Class Average: %.1f\n", overallAverage);
        System.out.println("----------------------------------");
        System.out.printf("Solos Evaluated : %d | Solo Average  : %.1f\n", soloCount, soloAverage);
        System.out.printf("Groups Evaluated: %d | Group Average : %.1f\n", groupCount, groupAverage);
        System.out.println("----------------------------------");
        System.out.printf("🏆 Top Overall Routine: \"%s\" (%s) with %.1f points!\n",
                routineNames[topIndex], categories[topIndex], scores[topIndex]);

        scanner.close();
    }
}