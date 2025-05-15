import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int units = sc.nextInt();
        double bill = 0;

        if (units <= 200) {
            // 0.5 paise per unit means 0.5 Rs per unit
            bill = units * 0.5;
        } else if (units <= 400) {
            // 0.65 Rs per unit + 100 extra charge
            bill = units * 0.65 + 100;
        } else if (units <= 600) {
            // 0.80 Rs per unit + 200 extra charge
            bill = units * 0.80 + 200;
        } else {
            // > 600 units, 1.25 Rs per unit + 425 extra charge
            bill = units * 1.25 + 425;
        }

        // Print as integer rupees with Rs. prefix
        System.out.println("Rs." + (int)bill);

        sc.close();
    }
}
