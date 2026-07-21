import java.util.Scanner;

public class CarNumberAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter car number: ");
        String number = scanner.next();
        if (number.length() != 8){
            System.out.println("Wrong input !");
        }else {
            System.out.println("+++++++++++++++++++++++++++");
            System.out.println("    Car Number Analyzer ");
            System.out.println("+++++++++++++++++++++++++++");
            System.out.println("| Region      | " + number.substring(0, 2));
            System.out.println("| Letter      | " + number.toUpperCase().charAt(2));
            System.out.println("| Number      | " + number.substring(3, 6));
            System.out.println("| Series      | " + number.substring(6).toUpperCase());
        }
    }
}