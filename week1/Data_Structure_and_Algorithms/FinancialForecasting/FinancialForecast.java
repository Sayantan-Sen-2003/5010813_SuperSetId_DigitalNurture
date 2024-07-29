package week1.Data_Structure_and_Algorithms.FinancialForecasting;

public class FinancialForecast {


    public static double calculateFutureValue(double principal, double rate, int years) {
        // Base case: if years is 0, return the principal
        if (years == 0) {
            return principal;
        }
       
        return calculateFutureValue(principal, rate, years - 1) * (1 + rate);
    }

    public static void main(String[] args) {
        double principal = 1000.0; // Initial investment
        double rate = 0.05;        // Annual growth rate (5%)
        int years = 10;            // Number of years to forecast

        double futureValue = calculateFutureValue(principal, rate, years);
        System.out.printf("The future value of the investment is: Rupees %.2f%n", futureValue);
    }
}

// output:
// The future value of the investment is: Rupees 1628.89


// iteration based 
// public static double calculateFutureValueIterative(double principal, double rate, int years) {
//     double futureValue = principal;
//     for (int i = 0; i < years; i++) {
//         futureValue *= (1 + rate);
//     }
//     return futureValue;
// }