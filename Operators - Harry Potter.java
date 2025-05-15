import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().trim();
        if (input.startsWith("-") || input.startsWith("+")) {
            input = input.substring(1);
        }
        int firstDigit = input.charAt(0) - '0';
        int lastDigit = input.charAt(input.length() - 1) - '0';
        System.out.println(firstDigit + lastDigit);
        scanner.close();
    }
}
