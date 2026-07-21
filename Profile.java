import java.util.Scanner;

public class Profile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = scanner.next();
        System.out.print("Enter surname: ");
        String surname = scanner.next();
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        System.out.print("Enter your address(Town): ");
        String town = scanner.next();
        System.out.print("Enter your occupation: ");
        String job = scanner.next();
        System.out.println("+++++++++++++++++++++++++++++++");
        System.out.println("            Profile");
        System.out.println("+++++++++++++++++++++++++++++++");
        System.out.printf("| Name        |   %s",name);
        System.out.printf("\n| Surname     |   %s",surname);
        System.out.printf("\n| Age         |   %d",age);
        System.out.printf("\n| Address     |   %s",town);
        System.out.printf("\n| Occupation  |   %s",job);
        System.out.println("+++++++++++++++++++++++++++++++");
    }
}