import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        float number = scanner.nextFloat();

       
        int integerPart = (int) number;

        int ceilValue = (int) Math.ceil(number);
        int floorValue = (int) Math.floor(number);

        System.out.println(integerPart);
        System.out.println(ceilValue);
        System.out.println(floorValue);

        scanner.close();
    }
}
