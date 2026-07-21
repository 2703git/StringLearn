import java.util.Scanner;

public class StudentInfoSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = scanner.next();
        System.out.print("Enter surname: ");
        String surname = scanner.next();
        System.out.print("Enter student ID: ");
        String id = scanner.next();
        System.out.print("Enter e-mail: ");
        String email = scanner.next();
        System.out.print("Enter username: ");
        String username = scanner.next();
        System.out.print("Enter phone number: ");
        String phone = scanner.next();
        String faculty = "";
        char frSign = id.charAt(0);
        if (frSign == 'S'){
            faculty = "Software Engineering";
        } else if (frSign == 'C') {
            faculty = "Cyber Security";
        } else if (frSign == 'B') {
            faculty = "Business";
        }else{
            faculty = "Unknown";
        }
        System.out.print("Enter password: ");
        String password = scanner.next();
        if (password.length() < 8) {
            System.out.println("Password is too small !");
        } else {
            System.out.println("+++++++++++++++++++++++++++++++++++++");
            System.out.printf("|    %s %s    |",name.toUpperCase() , surname.toUpperCase());
            System.out.println("\n=========== Student Card ============");
            System.out.println("| Name             | " + name.trim());
            System.out.println("| Faculty          | " + faculty);
            System.out.println("| E-mail           | " + email.toLowerCase());
            System.out.println("| Username         | " + username.toLowerCase());
            System.out.println("| Phone number     | " + phone.replace("+998","0"));
            System.out.println("| Password length  | " + password.length());

        }
    }
}