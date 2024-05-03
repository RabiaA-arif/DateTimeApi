import java.util.Scanner;

public class TimeConversion {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the time in 24-hour format
        System.out.print("Enter the time in 24-hour format (HH:mm): ");
        String inputTime = scanner.next();

        // Split the input time into hours and minutes
        String[] timeParts = inputTime.split(":");
        int hours = Integer.parseInt(timeParts[0]);
        int minutes = Integer.parseInt(timeParts[1]);

        // Convert the time to 12-hour format
        String period;
        if (hours >= 12) {
            period = "PM";
            if (hours > 12) {
                hours -= 12;
            }
        } else {
            period = "AM";
            if (hours == 0) {
                hours = 12;
            }
        }

        // Display the time in 12-hour format
        System.out.println("Time in 12-hour format: " + hours + ":" + minutes + " " + period);

        // Close the scanner
        scanner.close();
    }
}
