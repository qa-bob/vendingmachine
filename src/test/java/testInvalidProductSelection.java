import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertFalse;

@Test
public void testInvalidProductSelection() {
    // Arrange
    PurchaseProcessor purchaseProcessor = new PurchaseProcessor(new VendingMachineImpl());
    VendingMachineProduct product = null; // Simulate invalid product selection
    CashPaymentMethod paymentMethod = new CashPaymentMethod(2.00);

    // Act
    boolean result = purchaseProcessor.processPurchase(product, paymentMethod);

    // Assert
    assertFalse(result);
}
