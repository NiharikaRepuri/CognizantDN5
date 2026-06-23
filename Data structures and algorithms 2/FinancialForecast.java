public class FinancialForecast {

    public static double forecast(double amount, double rate, int years) {

        if (years == 0) {
            return amount;
        }

        return forecast(amount, rate, years - 1) * (1 + rate);
    }
}