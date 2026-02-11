import java.util.Scanner;

public class JavaDb {

    public static void main(String[] args) {
        DbCrud db = new DbCrud();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("=== Database Editing & Modification Program ===");

        while (running) {
            System.out.println("\n1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Add Random Student (Test)");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            int choice = -1;
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline
            } else {
                scanner.nextLine(); // Consume invalid input
                System.out.println("Invalid input. Please enter a number.");
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Email: ");
                    String email = scanner.nextLine();
                    db.addStudent(name, email);
                    break;
                case 2:
                    db.getAllStudents();
                    break;
                case 3:
                    System.out.print("Enter Student ID to update: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter New Name: ");
                    String newName = scanner.nextLine();
                    System.out.print("Enter New Email: ");
                    String newEmail = scanner.nextLine();
                    db.updateStudent(updateId, newName, newEmail);
                    break;
                case 4:
                    System.out.print("Enter Student ID to delete: ");
                    int deleteId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    db.deleteStudent(deleteId);
                    break;
                case 5:
                    db.addRandomStudent();
                    break;
                case 6:
                    running = false;
                    System.out.println("Exiting program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
        scanner.close();
    }
}
