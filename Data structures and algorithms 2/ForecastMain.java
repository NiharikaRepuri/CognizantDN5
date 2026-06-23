import java.util.Scanner;

public class ForecastMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Present Value: ");
        double amount = sc.nextDouble();

        System.out.print("Enter Growth Rate (%): ");
        double rate = sc.nextDouble() / 100;

        System.out.print("Enter Number of Years: ");
        int years = sc.nextInt();

        double futureValue =
                FinancialForecast.forecast(amount, rate, years);

        System.out.println("\n----- Financial Forecast -----");
        System.out.println("Present Value : " + amount);
        System.out.println("Growth Rate   : " + (rate * 100) + "%");
        System.out.println("Years         : " + years);
        System.out.println("Future Value  : " + futureValue);

        sc.close();
    }
}