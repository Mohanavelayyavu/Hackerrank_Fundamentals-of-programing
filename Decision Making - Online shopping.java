import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for Flipkart
        int fPrice = sc.nextInt();
        int fDiscount = sc.nextInt();
        int fShipping = sc.nextInt();

        // Input for Snapdeal
        int sPrice = sc.nextInt();
        int sDiscount = sc.nextInt();
        int sShipping = sc.nextInt();

        // Input for Amazon
        int aPrice = sc.nextInt();
        int aDiscount = sc.nextInt();
        int aShipping = sc.nextInt();

        // Calculate final prices
        int finalF = (int)(fPrice - (fPrice * fDiscount / 100.0) + fShipping);
        int finalS = (int)(sPrice - (sPrice * sDiscount / 100.0) + sShipping);
        int finalA = (int)(aPrice - (aPrice * aDiscount / 100.0) + aShipping);

        // Print the prices
        System.out.println("In Flipkart: Rs." + finalF);
        System.out.println("In Snapdeal: Rs." + finalS);
        System.out.println("In Amazon: Rs." + finalA);

        // Choose the best option with tie-breaking rules
        if (finalF <= finalS && finalF <= finalA) {
            System.out.println("Choose Flipkart");
        } else if (finalS <= finalF && finalS <= finalA) {
            System.out.println("Choose Snapdeal");
        } else {
            System.out.println("Choose Amazon");
        }

        sc.close();
    }
}
