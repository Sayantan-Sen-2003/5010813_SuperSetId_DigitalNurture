public class CreditCardPayment implements PaymentStrategy {
    // private String cardNumber;
    // private String nameOnCard;
    // private String cvv;
    // private String expiryDate;

    // public CreditCardPayment(String cardNumber, String nameOnCard, String cvv, String expiryDate) {
    //     this.cardNumber = cardNumber;
    //     this.nameOnCard = nameOnCard;
    //     this.cvv = cvv;
    //     this.expiryDate = expiryDate;
    // }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid using Credit Card.");
    }
}
