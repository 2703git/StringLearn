import java.util.Scanner;

public class EmailAnalyze {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter e-mail: ");
        String email = scanner.next();
        System.out.println("+++++++++++++++++++++++++++++++++");
        System.out.println("       E-mail Analyzer ");
        System.out.println("+++++++++++++++++++++++++++++++++");
        System.out.println("| Username     | "+email.substring(0,email.indexOf("@")));
        System.out.println("| Domain       | "+email.substring(email.indexOf("@")+1));
        System.out.println("| Icon         | "+email.substring(email.indexOf("@"),email.indexOf("@")+"@".length()));
        System.out.println("| Index 7      | "+email.charAt(7));
        System.out.println("| in Uppercase | "+email.toUpperCase());
        System.out.println("| in Lowercase | "+email.toLowerCase());
    }
}