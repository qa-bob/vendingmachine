import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertFalse;

@Test
public void testOutOfStockProduct() {
    // Arrange
    PurchaseProcessor purchaseProcessor = new PurchaseProcessor(new VendingMachineImpl());
    VendingMachineProduct product = new VendingMachineProduct("Soda", 1.50);
    product.setQuantity(0); // Set quantity to 0 to simulate out-of-stock
    CashPaymentMethod paymentMethod = new CashPaymentMethod(2.00);

    // Act
    boolean result = purchaseProcessor.processPurchase(product, paymentMethod);

    // Assert
    assertFalse(result);
}
