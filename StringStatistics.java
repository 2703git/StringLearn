import java.util.Scanner;

public class StringStatistics {
    public static String rev(String reverse){
        if (reverse.length()<=1)
            return reverse;
        return reverse.substring(reverse.length()-1)+rev(reverse.substring(0, reverse.length()-1));
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = scanner.nextLine();
        System.out.println("String length:   "+text.length());
        System.out.println("With Uppercase:  "+text.toUpperCase());
        System.out.println("With Lowercase:  "+text.toLowerCase());
        System.out.println("Reverse text:    "+rev(text));
    }
}
