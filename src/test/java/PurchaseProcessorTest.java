import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PurchaseProcessorTest {

    @Test
    public void testSuccessfulCashPurchase() {
        // Arrange
        PurchaseProcessor purchaseProcessor = new PurchaseProcessor("Soda", "Coke");
        VendingMachineProduct product = new VendingMachineProduct("Soda", 1.50);
        CashPaymentMethod paymentMethod = new CashPaymentMethod(2.00);

        // Act
        boolean result = purchaseProcessor.processPurchase(product, paymentMethod);

        // Assert
        assertTrue(result);
    }
}