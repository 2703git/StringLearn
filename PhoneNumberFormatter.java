import java.util.Scanner;

public class PhoneNumberFormatter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter phone number: ");
        String phone = scanner.nextLine();
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("            Phone Number Formatter");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("| Replace +998    | "+phone.replace("+998","0"));
        System.out.println("| Operator        | "+phone.substring(5,7));
        System.out.println("| Length          | "+phone.length());
        System.out.println("| Without space   | "+phone.replace("+998","0").replace(" ",""));
    }
}