import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.HashSet;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.PrintStream;
import java.text.DecimalFormat;
import java.util.Arrays;

public class Main {
    private static List vacationRequests = new ArrayList<>();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Меню:");
            System.out.println("---- Leave Management Menu ----");
            System.out.println("1. Заяви отпуска");
            System.out.println("2. Виж всички отпуски");
            System.out.println("3. Виж отпуска за служител");
            System.out.println("4. Промени статус на отпуска");
            System.out.println("5. Изход");
            System.out.println("-------------------------------");
            System.out.println("Въведи избрана опция(1-5): ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    createVacationRequest();
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:
                    System.out.println("До виждане!");
                    break;
                default:
                    System.out.println("Няма такава опция. Опитайте отново.");
            }
        } while (choice != 5);

    }

    private static void createVacationRequest(Scanner scanner) {
        System.out.println("Заяви отпуска");
        System.out.print("Име: ");
        String name = scanner.nextLine();
        System.out.print("Имейл: ");
        String email = scanner.nextLine();
        System.out.print("ЕГН: ");
        String egn = scanner.nextLine();
        System.out.print("Начална дата на отпуската (dd/MM/yyyy): ");
        String startDate = scanner.nextLine();
        System.out.print("Крайна дата на отпуската (dd/MM/yyyy): ");
        String endDate = scanner.nextLine();
        System.out.print("Тип на отпуската (платена/неплатена): ");
        String vacationType = scanner.nextLine();

        try {
            VacationRequest vacationRequest = new VacationRequest(name, email, egn, startDate, endDate, vacationType);
            vacationRequests.add(vacationRequest);
            System.out.println("Заявката е създадена успешно!");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}