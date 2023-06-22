// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        do {
            System.out.println("---- Leave Management Menu ----");
            System.out.println("1. Claimed leave");
            System.out.println("2. See all holidays");
            System.out.println("3. See employee leave");
            System.out.println("4. Change leave status");
            System.out.println("5. Exit");
            System.out.println("-------------------------------");
            System.out.println("Enter your choice (1-5): ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println();
                    break;
                case 2:
                    System.out.println();
                    break;
                case 3:
                    System.out.println();
                    break;
                case 4:
                    System.out.println();
                    break;
                case 5:
                    System.out.println();
                    break;
                default:
                    System.out.println();
            }
        } while (choice != 5);
        input.close();
    }
}