import java.util.Scanner;
import java.text.DecimalFormat;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double principal = scanner.nextDouble();
        double rate = scanner.nextDouble();
        double years = scanner.nextDouble();

        // Simple Interest
        double interest = (principal * rate * years) / 100.0;

        // Total amount before discount
        double amount = principal + interest;

        // Discount = 2% of interest
        double discount = (2.0 / 100.0) * interest;

        // Final settlement after discount
        double finalSettlement = amount - discount;

        // Format to 2 decimal places
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println(df.format(interest));
        System.out.println(df.format(amount));
        System.out.println(df.format(discount));
        System.out.println(df.format(finalSettlement));

        scanner.close();
    }
}
