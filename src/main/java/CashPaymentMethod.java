public class CashPaymentMethod implements PaymentMethod {
    private double paymentAmount;

    public CashPaymentMethod(double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    @Override
    public boolean isValid() {
        return paymentAmount > 0.0;
    }

    @Override
    public double getPaymentAmount() {
        return paymentAmount;
    }
}
