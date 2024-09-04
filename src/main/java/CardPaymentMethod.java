public class CardPaymentMethod implements PaymentMethod {
    private String cardNumber;
    private String expirationDate;
    private String securityCode;

    public CardPaymentMethod(String cardNumber, String expirationDate, String securityCode) {
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
        this.securityCode = securityCode;
    }

    @Override
    public boolean isValid() {
        // Simple validation for now (e.g., check if card number is not empty)
        return !cardNumber.isEmpty();
    }

    @Override
    public double getPaymentAmount() {
        // For card payments, we don't need to specify the payment amount
        return 0.0;
    }
}
