import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        // Check if character is alphabet
        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            // Convert to lowercase for simplicity
            char c = Character.toLowerCase(ch);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                System.out.println("Vowel");
            } else {
                System.out.println("Consonant");
            }
        } else {
            System.out.println("Not an alphabet");
        }

        sc.close();
    }
}
