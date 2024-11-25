import java.util.Scanner;

public class IT24104212Lab5Q2 { 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numNewMembers;

        do {
            System.out.print("Enter the number of new members introduced (must be 0 or more): ");
            numNewMembers = scanner.nextInt();
        } while (numNewMembers < 0);

        String prize;

        switch (numNewMembers) {
            case 0:
                prize = "No Prize";
                break;
            case 1:
                prize = "Pen";
                break;
            case 2:
                prize = "Umbrella";
                break;
            case 3:
                prize = "Bag";
                break;
            case 4:
                prize = "Travelling Chair";
                break;
            default:
                prize = "Headphone"; 
        }

        System.out.println("The customer is entitled to a " + prize + ".");

        scanner.close();
    }
}