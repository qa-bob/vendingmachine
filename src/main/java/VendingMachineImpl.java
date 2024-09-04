import java.util.HashMap;
import java.util.Map;

public class VendingMachineImpl implements VendingMachine {
    private final Map<VendingMachineProduct, Integer> inventory = new HashMap<>();

    public VendingMachineImpl() {
        // Initialize inventory with some products
        inventory.put(new VendingMachineProduct("Soda", 1.50), 10);
        inventory.put(new VendingMachineProduct("Chips", 2.00), 10);
    }

    @Override
    public boolean isProductAvailable(VendingMachineProduct product) {
        return inventory.containsKey(product) && inventory.get(product) > 0;
    }

    @Override
    public void updateInventory(VendingMachineProduct product) {
        inventory.put(product, inventory.get(product) - 1);
    }

    public boolean isProductQuantityAvailable(VendingMachineProduct product) {
        return product.getQuantity() > 0;
    }
}
