import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int asciiValue = scanner.nextInt();

        char character = (char) asciiValue;

        System.out.println(character);

        scanner.close();
    }
}
