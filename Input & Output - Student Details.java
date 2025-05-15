import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int age = scanner.nextInt();
        float cgpaInput = scanner.nextFloat();
        char grade = scanner.next().charAt(0);

        
        float truncatedCgpa = (int)(cgpaInput * 100) / 100.0f;

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.printf("CGPA: %.2f\n", truncatedCgpa);
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
