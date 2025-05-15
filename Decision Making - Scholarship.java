import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();
        int yearOfPassing = sc.nextInt();
        int income = sc.nextInt();
        int arrears = sc.nextInt();
        float marks = sc.nextFloat();
        float attendance = sc.nextFloat();

        boolean ageOk = age >= 18 && age < 21;
        boolean yearOk = yearOfPassing >= 2021;

        boolean baseIncome = income <= 200000;
        boolean partialIncome = income > 200000 && income < 250000;

        boolean baseArrears = arrears <= 2;
        boolean relaxedArrears = arrears > 2 && marks >= 80 && attendance >= 90;

        boolean baseMarks = marks >= 60;
        boolean baseAttendance = attendance >= 80;

        // Check for full eligibility
        if (ageOk && yearOk &&
            (baseArrears || relaxedArrears) &&
            (baseIncome || partialIncome) &&
            ((baseArrears && baseMarks && baseAttendance) ||
             (relaxedArrears))) {

            if (baseIncome && (baseArrears && baseMarks && baseAttendance || relaxedArrears)) {
                System.out.println("Eligible");
            } else if (partialIncome && (baseArrears && baseMarks && baseAttendance || relaxedArrears)) {
                System.out.println("Partially Eligible");
            } else {
                System.out.println("Not Eligible");
            }
        } else {
            System.out.println("Not Eligible");
        }
    }
}
