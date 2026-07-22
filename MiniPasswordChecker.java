import java.util.Scanner;

public class MiniPasswordChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter password: ");
        String password = scanner.next();
        String length;
        if (password.length()<8){
            length = "Less than 8 signs";
        }else {
            length = "More or equal to 8 signs";
        }
        System.out.println("++++++++++++++++++++++++++++++++++++");
        System.out.println("       Mini Password Checker");
        System.out.println("++++++++++++++++++++++++++++++++++++");
        System.out.println("| Signs         | "+length);
        System.out.println("| First letter  | "+password.charAt(0));
        System.out.println("| Last letter   | "+password.charAt(password.length()-1));
        System.out.println("| in Uppercase  | "+password.toUpperCase());
        System.out.println("| in Lowercase  | "+password.toLowerCase());
    }
}