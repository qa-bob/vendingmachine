public class PurchaseProcessor {
    private VendingMachine vendingMachine;
    private ProductDispenser productDispenser;

    public PurchaseProcessor(VendingMachine vendingMachine, ProductDispenser productDispenser) {
        this.vendingMachine = vendingMachine;
        this.productDispenser = productDispenser;
    }

    public boolean processPurchase(VendingMachineProduct product, PaymentMethod paymentMethod) {
        if (product == null) {
            return false; // Invalid product selection
        }

        if (paymentMethod.getPaymentAmount() >= product.getPrice()) {
            vendingMachine.updateInventory(product);
            productDispenser.dispenseProduct(product);
            return true;
        }

        if (!vendingMachine.isProductAvailable(product)) {
            return false; // Out-of-stock product
        }

        if (!paymentMethod.isValid()) {
            return false; // Invalid payment method
        }

        if (paymentMethod.getPaymentAmount() < product.getPrice()) {
            return false; // Insufficient funds
        }

        vendingMachine.updateInventory(product);

        return true; // Purchase successful
    }
}