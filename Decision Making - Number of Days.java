import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();
        int month = sc.nextInt();

        if (year < 1900 || year > 9999 || month < 1 || month > 12) {
            System.out.println(0);
            return;
        }

        boolean isLeap = (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
        int days = 0;

        switch (month) {
            case 1: case 3: case 5: case 7:
            case 8: case 10: case 12:
                days = 31;
                break;
            case 4: case 6: case 9: case 11:
                days = 30;
                break;
            case 2:
                days = isLeap ? 29 : 28;
                break;
        }

        System.out.println(days + " Days");
    }
}
