import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int friends = scanner.nextInt();
        int teams = scanner.nextInt();

        int friendsPerTeam = friends / teams;
        int leftOut = friends % teams;

        System.out.println("The number of friends in each team is " + friendsPerTeam + " and left out is " + leftOut);

        scanner.close();
    }
}
