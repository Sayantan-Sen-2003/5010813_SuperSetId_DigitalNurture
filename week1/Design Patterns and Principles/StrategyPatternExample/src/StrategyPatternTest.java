public class StrategyPatternTest {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        // Paying with Credit Card ;not using a parameterized constructor
        // PaymentStrategy creditCardPayment = new CreditCardPayment("1234 5678 9101 1121", "John Doe", "123", "12/23");
        PaymentStrategy creditCardPayment = new CreditCardPayment();
        context.setPaymentStrategy(creditCardPayment);
        context.pay(2500);

        // Paying with PayPal ; Not explicitly defining materials as that is not being used anywhere
        // PaymentStrategy payPalPayment = new PayPalPayment("johndoe@example.com", "password");
        PaymentStrategy payPalPayment = new PayPalPayment();
        context.setPaymentStrategy(payPalPayment);
        context.pay(1500);
    }
}

// output:
// 2500 paid using Credit Card.
// 1500 paid using PayPal.