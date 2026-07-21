package dr.drills;

public class ScoreAnalyser {
    public static void main(String[] args) {

        int[] scores = { 88, 42, 95, 70, 58, 100, 63, 35, 82, 77 };
        int passedCount = 0;
        int failedCount = 0;
        double totalScore = 0;

        System.out.println("--- Individual Student Results ---");

        for (int score : scores) {
            totalScore += score;

            if (score >= 60) {
                System.out.println("Score: " + score + " - PASSED");
                passedCount++;
            } else {
                System.out.println("Score: " + score + " - FAILED");
                failedCount++;
            }
        }
        double averageScore = totalScore / scores.length;

        System.out.println("\n--- Summary Report ---");
        System.out.println("Total Students Evaluated: " + scores.length);
        System.out.println("Passed: " + passedCount);
        System.out.println("Failed: " + failedCount);
        System.out.printf("Class Average: %.1f\n", averageScore);

    }

}
