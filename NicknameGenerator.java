import java.util.Scanner;

public class NicknameGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = scanner.next();
        System.out.print("Enter surname: ");
        String surname = scanner.next();
        System.out.print("Enter your birth year: ");
        String year = scanner.next();
        System.out.println("+++++++++++++++++++++++++++++++");
        System.out.println("     Nickname Generator");
        System.out.println("+++++++++++++++++++++++++++++++");
        System.out.printf("| Nicknames recommended: %s%s", name.charAt(0),surname.toUpperCase());
        System.out.printf("\n                         %s_%s",name.substring(0,5),year);
        System.out.printf("\n                         %s.%s",name.toLowerCase().charAt(0),surname.toLowerCase());
        System.out.printf("\n                         %s.%s",name.charAt(0),surname);
    }
}