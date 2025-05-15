import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        double midX = (x1 + x2) / 2.0;
        double midY = (y1 + y2) / 2.0;

        System.out.printf("Arun's house is located at(%.1f,%.1f)%n", midX, midY);

        scanner.close();
    }
}
