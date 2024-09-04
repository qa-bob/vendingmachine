import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertTrue;

@Test
public void testSuccessfulCardPurchase() {
    // Arrange
    PurchaseProcessor purchaseProcessor = new PurchaseProcessor(new VendingMachineImpl());
    VendingMachineProduct product = new VendingMachineProduct("Soda", 1.50);
    CardPaymentMethod paymentMethod = new CardPaymentMethod("1234-5678-9012-3456", "12/25", "123");

    // Act
    boolean result = purchaseProcessor.processPurchase(product, paymentMethod);

    // Assert
    assertTrue(result);
}
