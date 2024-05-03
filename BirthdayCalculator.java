import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class BirthdayCalculator  {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their birth date
        System.out.print("Enter your birth date (YYYY-MM-DD): ");
        String inputBirthDate = scanner.next();

        // Parse the input string into a LocalDate object
        LocalDate birthDate = LocalDate.parse(inputBirthDate);

        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Calculate the age of the user
        Period period = Period.between(birthDate, currentDate);
        int age = period.getYears();

        // Display the user's current age
        System.out.println("Your current age is: " + age + " years");

        // Close the scanner
        scanner.close();
    }

    
}
