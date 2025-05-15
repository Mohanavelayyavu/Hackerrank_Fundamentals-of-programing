import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] hours = new int[7]; // Sunday to Saturday
        for (int i = 0; i < 7; i++) {
            hours[i] = sc.nextInt();
        }

        int totalSalary = 0;

        for (int i = 0; i < 7; i++) {
            int h = hours[i];
            int base = h * 100;
            int overtime = (h > 8) ? (h - 8) * 15 : 0;
            int dailySalary = base + overtime;

            // Sunday Bonus
            if (i == 0) {
                dailySalary += dailySalary * 0.50;
            }

            // Saturday Bonus
            if (i == 6) {
                dailySalary += dailySalary * 0.25;
            }

            totalSalary += dailySalary;
        }

        System.out.println(totalSalary);
    }
}
