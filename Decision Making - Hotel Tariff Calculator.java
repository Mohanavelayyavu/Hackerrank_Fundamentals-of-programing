import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int month = sc.nextInt();
        int rentPerDay = sc.nextInt();
        int numDays = sc.nextInt();

        // Validate month
        if (month < 1 || month > 12) {
            System.out.println("Invalid Input");
            return;
        }

        // Check if it's peak season (April-June = 4-6, Nov-Dec = 11-12)
        boolean isPeakSeason = (month >= 4 && month <= 6) || (month == 11 || month == 12);

        double totalRent = rentPerDay * numDays;

        if (isPeakSeason) {
            totalRent *= 1.20; // 20% extra
        }

        // Print total rounded to nearest integer
        System.out.println((int)totalRent);
    }
}
