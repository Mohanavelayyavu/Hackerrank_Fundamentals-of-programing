import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        // Extract digits
        int hundreds = num / 100;
        int tens = (num / 10) % 10;
        int ones = num % 10;

        // Reverse the number
        int reversed = ones * 100 + tens * 10 + hundreds;

        System.out.println(reversed);

        sc.close();
    }
}
