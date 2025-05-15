import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();  // input from 1 to 9
        
        // Calculate row and column
        int row = (n - 1) / 3;
        int col = (n - 1) % 3;
        
        System.out.println(row + " " + col);
        
        sc.close();
    }
}
