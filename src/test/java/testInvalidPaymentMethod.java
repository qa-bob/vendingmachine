import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@Test
public void testInvalidPaymentMethod() {
    // Arrange
    PurchaseProcessor purchaseProcessor = new PurchaseProcessor(new VendingMachineImpl());
    VendingMachineProduct product = new VendingMachineProduct("Soda", 1.50);
    PaymentMethod paymentMethod = new InvalidPaymentMethod();

    // Act
    boolean result = purchaseProcessor.processPurchase(product, paymentMethod);

    // Assert
    assertFalse(result);
}
