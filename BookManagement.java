import java.util.Scanner;

public class BookManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("              Book Management");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
        System.out.print("Enter name of the book: ");
        String book = scanner.nextLine();
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("| Length of name     | " + book.length());
        System.out.println("| First letter       | " + book.charAt(0));
        System.out.println("| Last letter        | " + book.charAt(book.length()-1));
        System.out.println("| in UpperCase       | " + book.toUpperCase());
        System.out.println("| in Lowercase       | " + book.toLowerCase());
        System.out.println("| Part of the name   | " + book.substring(book.indexOf("Programming"), book.indexOf("Programming")+"Programming".length()));
        System.out.println("| Changing name      | " + book.replace("Java", "C++"));
    }
}
