import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        final byte months_in_year = 12;
        final byte percent =100;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Principal: ");
        int principal = scanner.nextInt();

        System.out.println("Annual Interest Rate: ");
        float annual_rate = scanner.nextFloat();
        float monthly_rate = annual_rate/percent/months_in_year;
        System.out.println("monthly_rate : " + monthly_rate);

        System.out.println("Period (Years): ");
        int period = scanner.nextInt();
        int numberOfPayments = period * months_in_year;
        double a = Math.pow(1 + monthly_rate , numberOfPayments);
        //System.out.println(a);

        double mortgage  = principal *(( monthly_rate * a)/ (a-1));

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: "+ mortgageFormatted);
    }
}