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
            int baseSalary = h * 100;
            int overtimePay = (h > 8) ? (h - 8) * 15 : 0;
            int dailySalary = baseSalary + overtimePay;

            // Sunday bonus (50%)
            if (i == 0) {
                dailySalary += (dailySalary * 50) / 100;
            }

            // Saturday bonus (25%)
            if (i == 6) {
                dailySalary += (dailySalary * 25) / 100;
            }

            totalSalary += dailySalary;
        }

        System.out.println(totalSalary);
    }
}
