import java.text.ParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter calories allowed per day: ");
        int caloriesPerDay = scanner.nextInt();
        scanner.nextLine(); // consume the newline character
        System.out.print("Enter diet start date (MM/dd/yyyy): ");
        String startDateStr = scanner.nextLine();
        System.out.print("Enter diet end date (MM/dd/yyyy): ");
        String endDateStr = scanner.nextLine();
        TotalCalories totalCalories = new TotalCalories(caloriesPerDay, startDateStr, endDateStr);
        int consumedCalories = totalCalories.getTotalCalories();
        System.out.println("Total calories consumed during the diet: " + consumedCalories);
    }
}