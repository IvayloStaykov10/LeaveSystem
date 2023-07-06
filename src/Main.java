import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList leaveRequests = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            displayMenu();
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    makeLeaveRequest(scanner);
                    break;
                case 2:

                case 3:

                case 4:

                case 5:
                    System.out.println("Изход.");
                    break;
                default:
                    System.out.println("Няма такава опция. Моля въведете друга опция.");
                    break;
            }
        } while (choice != 5);
        scanner.close();
    }

    private static void displayMenu() {
        System.out.println("-------Система-за-отпуски-------");
        System.out.println("1. Заяви отпуска");
        System.out.println("2. Виж всички отпуски");
        System.out.println("3. Виж отпуска за служител");
        System.out.println("4. Промени статус на отпуска");
        System.out.println("5. Изход");
        System.out.println("---------------------------------");
        System.out.print("Въведи избор(1-5): ");
    }

    private static void makeLeaveRequest(Scanner scanner) {
        System.out.print("Име: ");
        String name = scanner.nextLine();

        System.out.print("Имейл: ");
        String email = scanner.nextLine();

        System.out.print("ЕГН: ");
        String egn = scanner.nextLine();

        System.out.print("Дата на начало на отпуската (dd/mm/yyyy): ");
        String startDate = scanner.nextLine();

        System.out.print("Дата на край на отпуската (dd/mm/yyyy): ");
        String endDate = scanner.nextLine();

        System.out.print("Тип на отпуската (платена/неплатена): ");
        String vacationType = scanner.nextLine();

        LeaveRequest request = new LeaveRequest(name, email, egn, startDate, endDate, vacationType);
        leaveRequests.add(request);

        System.out.println("Отпуската е заявена успешно.");
    }
}

class LeaveRequest {
    private static int nextId = 1;
    private int id;
    private String name;
    private String email;
    private String egn;
    private String startDate;
    private String endDate;
    private String vacationType;
    private String status;

    public LeaveRequest(String name, String email, String egn, String startDate, String endDate, String vacationType) {
        this.id = nextId++;
        this.name = name;
        this.email = email;
        this.egn = egn;
        this.startDate = startDate;
        this.endDate = endDate;
        this.vacationType = vacationType;
        this.status = "pending";
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
}