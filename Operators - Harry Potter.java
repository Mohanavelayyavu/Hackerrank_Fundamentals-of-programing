import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().trim();

        if(input.startsWith("-") || input.startsWith("+")) {
            input = input.substring(1);
        }

        char firstDigitChar = input.charAt(0);
        char lastDigitChar = input.charAt(input.length() - 1);

        int firstDigit = firstDigitChar - '0';
        int lastDigit = lastDigitChar - '0';

        int sum = firstDigit + lastDigit;
        System.out.println(sum);

        scanner.close();
    }
}
