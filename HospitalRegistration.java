import java.util.Scanner;

public class HospitalRegistration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Patient name: ");
        String name = scanner.next();
        System.out.print("Patient surname: ");
        String surname = scanner.next();
        System.out.print("Passport number: ");
        String passport = scanner.next();
        System.out.print("Phone number: ");
        String phone = scanner.next();
        System.out.print("E-mail address: ");
        String email = scanner.next();
        System.out.println("++++++++++++++++++++++++++++++++++++");
        System.out.println("       Hospital Registration ");
        System.out.println("++++++++++++++++++++++++++++++++++++");
        System.out.println("*********** Patient Card ***********");
        System.out.printf("| Full name        | %s %s",name,surname);
        System.out.printf("\n| Passport number  | %s",passport.toUpperCase());
        System.out.printf("\n| Phone number     | %s",phone.replace("+998","0"));
        System.out.printf("\n| E-mail address   | %s",email.toLowerCase());
    }
}