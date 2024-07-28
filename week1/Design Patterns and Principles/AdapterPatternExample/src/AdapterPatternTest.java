public class AdapterPatternTest {
    public static void main(String[] args) {
        PaymentProcessor payPalProcessor = new PayPalAdapter(new PayPal());
        PaymentProcessor stripeProcessor = new StripeAdapter(new Stripe());
        PaymentProcessor squareProcessor = new SquareAdapter(new Square());

        // Test PayPal payment processing
        payPalProcessor.processPayment(100.0);

        // Test Stripe payment processing
        stripeProcessor.processPayment(200.0);

        // Test Square payment processing
        squareProcessor.processPayment(300.0);
    }
}

// output
// Processing payment of $100.0 through PayPal.
// Processing payment of $200.0 through Stripe.
// Processing payment of $300.0 through Square.
