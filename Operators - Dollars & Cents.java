import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dollar1 = scanner.nextInt();
        int cent1 = scanner.nextInt();
        int dollar2 = scanner.nextInt();
        int cent2 = scanner.nextInt();

        // Add cents and dollars
        int totalCents = cent1 + cent2;
        int extraDollars = totalCents / 100; // convert 100 cents to 1 dollar
        int remainingCents = totalCents % 100;

        int totalDollars = dollar1 + dollar2 + extraDollars;

        System.out.println(totalDollars);
        System.out.println(remainingCents);

        scanner.close();
    }
}
