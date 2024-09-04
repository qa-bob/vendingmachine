public interface VendingMachine {
    boolean isProductAvailable(VendingMachineProduct product);
    void updateInventory(VendingMachineProduct product);
}
