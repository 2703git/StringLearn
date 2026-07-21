import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("++++++++++++++++++++++");
        System.out.println("   BMI Calculator");
        System.out.println("++++++++++++++++++++++");
        System.out.print("Enter your height(meters): ");
        double height = scanner.nextDouble();
        System.out.print("Enter your weight(kilograms): ");
        double weight = scanner.nextDouble();
        double bmi = weight/(height*height);
        System.out.printf("\n|  BMI  |  %.2f |",bmi);
    }
}