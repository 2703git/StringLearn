import java.util.Scanner;

public class UniversityIDAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your University ID: ");
        String id = scanner.nextLine();
        String faculty;
        char frSign = id.charAt(0);
        if (frSign == 'S'){
            faculty = "Software Engineering";
        } else if (frSign == 'C') {
            faculty = "Cyber Security";
        } else if (frSign == 'B') {
            faculty = "Business";
        }else{
            faculty = "Unknown";
        }
        System.out.println("+++++++++++++++++++++++++++++++");
        System.out.println("   University ID Analyzer");
        System.out.println("+++++++++++++++++++++++++++++++");
        System.out.println("| Faculty         | "+faculty);
        System.out.println("| Year            | "+id.substring(2,4));
        System.out.println("| Student Number  | "+id.substring(4));
    }
}