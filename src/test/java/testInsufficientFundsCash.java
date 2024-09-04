import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertFalse;

@org.junit.Test
@Test
public void testInsufficientFundsCash() {
    // Arrange
    PurchaseProcessor purchaseProcessor = new PurchaseProcessor(new VendingMachineImpl());
    VendingMachineProduct product = new VendingMachineProduct("Soda", 1.50);
    CashPaymentMethod paymentMethod = new CashPaymentMethod(1.00);

    // Act
    boolean result = purchaseProcessor.processPurchase(product, paymentMethod);

    // Assert
    assertFalse(result);
}
