import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DateDifferenceCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first date
        System.out.print("Enter the first date (YYYY-MM-DD): ");
        String inputDate1 = scanner.next();

        // Prompt the user to enter the second date
        System.out.print("Enter the second date (YYYY-MM-DD): ");
        String inputDate2 = scanner.next();

        // Parse the input strings into LocalDate objects
        LocalDate date1 = LocalDate.parse(inputDate1);
        LocalDate date2 = LocalDate.parse(inputDate2);

        // Calculate the difference between the dates in days
        long differenceInDays = ChronoUnit.DAYS.between(date1, date2);

        // Display the result
        System.out.println("Difference between the dates: " + Math.abs(differenceInDays) + " days");

        // Close the scanner
        scanner.close();
    }
}
