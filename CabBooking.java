import java.util.Random;
import java.util.Scanner;

public class CabBooking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (true) {
            System.out.println("\n--- MAIN MENU ---");
            System.out.println("1. Book Ride");
            System.out.println("2. Exit");
            System.out.print("Enter your choice (1 or 2): ");

            int choice;
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
            } else {
                System.out.println("Invalid input! Please enter 1 or 2.");
                scanner.next();
                continue;
            }

            if (choice == 1) {
                System.out.println("\nChoose Cab Type:");
                System.out.println("1. Auto (Rs.12/km)");
                System.out.println("2. Sedan (Rs.18/km)");
                System.out.println("3. SUV (Rs.25/km)");
                System.out.print("Enter cab type (1-3): ");
                int cabChoice = scanner.nextInt();

                String cabType = "";
                int ratePerKm = 0;

                if (cabChoice == 1) {
                    cabType = "Auto";
                    ratePerKm = 12;
                } else if (cabChoice == 2) {
                    cabType = "Sedan";
                    ratePerKm = 18;
                } else if (cabChoice == 3) {
                    cabType = "SUV";
                    ratePerKm = 25;
                } else {
                    System.out.println("Invalid cab choice! Please try again.");
                    continue;
                }

                System.out.println("\nChoose Route:");
                System.out.println("1. Pune Station to Shivajinagar (5 km)");
                System.out.println("2. Swargate to Kothrud (8 km)");
                System.out.println("3. Hinjawadi to Wakad (10 km)");
                System.out.print("Enter route number (1-3): ");
                int routeChoice = scanner.nextInt();

                String source = "";
                String destination = "";
                int distance = 0;

                if (routeChoice == 1) {
                    source = "Pune Station";
                    destination = "Shivajinagar";
                    distance = 5;
                } else if (routeChoice == 2) {
                    source = "Swargate";
                    destination = "Kothrud";
                    distance = 8;
                } else if (routeChoice == 3) {
                    source = "Hinjawadi";
                    destination = "Wakad";
                    distance = 10;
                } else {
                    System.out.println("Invalid route choice! Please try again.");
                    continue;
                }

                int totalFare = distance * ratePerKm;

                System.out.println("\n--- FARE DETAILS ---");
                System.out.println("Cab Type: " + cabType);
                System.out.println("Source: " + source);
                System.out.println("Destination: " + destination);
                System.out.println("Distance: " + distance + " km");
                System.out.println("Rate: Rs." + ratePerKm + "/km");
                System.out.println("Total Fare: Rs." + totalFare);

                System.out.println("\nConfirmation Menu:");
                System.out.println("1. Confirm & Share OTP");
                System.out.println("2. Cancel Ride");
                System.out.print("Enter your choice (1 or 2): ");
                int confirmChoice = scanner.nextInt();

                if (confirmChoice == 2) {
                    System.out.println("Ride cancelled successfully. Returning to main menu.");
                    continue;
                } else if (confirmChoice == 1) {
                    int otp = 1000 + random.nextInt(9000);
                    System.out.println("\nBooking Confirmed! Your 4-digit OTP is: " + otp);
                    System.out.println("NOTE: Once OTP is shared, the ride cannot be cancelled.");
                } else {
                    System.out.println("Invalid choice. Returning to main menu.");
                }

            } else if (choice == 2) {
                System.out.println("\nThank you for using Cab Booking Chatbot. Goodbye!");
                break;
            } else {
                System.out.println("Invalid choice! Please enter 1 or 2.");            }
        }
        scanner.close();
    }
}
