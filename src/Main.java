import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the principal amount (P): ");
        double p = scan.nextDouble();

        System.out.println("Enter the annual interest rate (in percents) (r): ");
        double r = scan.nextDouble();

        System.out.println("Enter the number of times interest is compounded per year (n): ");
        int n = scan.nextInt();

        System.out.println("Enter the number of years (t): ");
        int t = scan.nextInt();
        scan.close();

        r /= 100;
        double firstPart = (1 + (r / n));
        int secondPart = (n * t);

        if (p > 0 && r > 0 && n > 0 && t > 0) {
            double amountAccumulated = Math.pow(firstPart, secondPart) * p;

            System.out.printf("Amount accumulated: %.2f%n", amountAccumulated);
        } else {
            System.out.println("Invalid input");
        }
    }
}
