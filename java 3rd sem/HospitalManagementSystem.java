import java.util.Scanner;

class User {
    String username;
    String password;
}

class Patient {
    String name;
    int age;
    String gender;
}

class HospitalManagementSystem {
    User[] users = new User[10];
    Patient[] patients = new Patient[100];
    int userCount = 0;
    int patientCount = 0;

    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        HospitalManagementSystem system = new HospitalManagementSystem();
        system.start();
    }

    public void start() {
        System.out.println("Welcome to Hospital Management System");

        while (true) {
            System.out.println("\n1. Login\n2. Signup\n3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    login();
                    break;
                case 2:
                    signup();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public void login() {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        for (int i = 0; i < userCount; i++) {
            if (users[i].username.equals(username) && users[i].password.equals(password)) {
                System.out.println("Login successful!");
                // Implement further functionalities after login
                return;
            }
        }
        System.out.println("Invalid username or password. Please try again.");
    }

    public void signup() {
        if (userCount >= users.length) {
            System.out.println("Cannot add more users. System full.");
            return;
        }

        User newUser = new User();
        System.out.print("Enter username: ");
        newUser.username = scanner.nextLine();
        System.out.print("Enter password: ");
        newUser.password = scanner.nextLine();

        users[userCount++] = newUser;
        System.out.println("Signup successful!");
    }

    // Implement billing and other functionalities here
}