import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Username: ");
        String username = scanner.next();
        System.out.print("Enter password: ");
        String password = scanner.next();
        String cleanUsername = username.trim().toLowerCase();
        if (password.length() < 8){
            System.out.println("Password is too small !");
        }else {
            System.out.println("| Username        | "+cleanUsername);
            System.out.println("| Password length | "+password.length());
        }
    }
}