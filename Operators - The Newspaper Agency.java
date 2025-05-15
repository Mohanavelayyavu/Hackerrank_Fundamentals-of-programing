import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt(); // Number of copies sold
        int b = scanner.nextInt(); // Cost per copy (selling price)
        int c = scanner.nextInt(); // Cost price per copy

        int profit = (a * b) - (a * c + 100);

        System.out.println(profit);

        scanner.close();
    }
}
