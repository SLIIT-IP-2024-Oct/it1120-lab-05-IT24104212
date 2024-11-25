import java.util.Scanner;

public class IT24104212Lab5Q3 { 

    public static final double ROOM_CHARGE_PER_DAY = 48000.00;
    public static final int MIN_DAY = 1;
    public static final int MAX_DAY = 31;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startDate, endDate, numDays;
        double discountRate, totalAmount;

        
        do {
            System.out.print("Enter start date (between 1 and 31): ");
            startDate = scanner.nextInt();
        } while (startDate < MIN_DAY || startDate > MAX_DAY);

        
        do {
            System.out.print("Enter end date (between 1 and 31, and greater than start date): ");
            endDate = scanner.nextInt();
        } while (endDate < MIN_DAY || endDate > MAX_DAY || endDate <= startDate);

        
        numDays = endDate - startDate + 1;

        
        if (numDays < 3) {
            System.out.println("Error: Minimum 3 days required for discount.");
            return; // Exit program if minimum days not met
        }

        
        if (numDays <= 4) {
            discountRate = 0.1;
        } else {
            discountRate = 0.2;
        }

        
        totalAmount = numDays * ROOM_CHARGE_PER_DAY * (1 - discountRate);

        System.out.println("Number of days reserved: " + numDays);
        System.out.printf("Total amount to be paid: Rs %.2f\n", totalAmount);

        scanner.close();
    }
}