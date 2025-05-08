import java.util.ArrayList;

class RetailItem {
    private String itemNumber;
    private String description;
    private int unitsOnHand;
    private double price;

    public RetailItem(String itemNumber, String description, int unitsOnHand, double price) {
        this.itemNumber = itemNumber;
        this.description = description;
        this.unitsOnHand = unitsOnHand;
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public int getUnitsOnHand() {
        return unitsOnHand;
    }

    public double getPrice() {
        return price;
    }

    public boolean reduceStock(int quantity) {
        if (quantity <= unitsOnHand) {
            unitsOnHand -= quantity;
            return true;
        }
        return false;
    }
}

class CashRegister {
    private ArrayList<RetailItem> items = new ArrayList<>();
    private ArrayList<Integer> quantities = new ArrayList<>();
    private final double TAX_RATE = 0.06;

    public void addItem(RetailItem item, int quantity) {
        if (item.reduceStock(quantity)) {
            items.add(item);
            quantities.add(quantity);
            System.out.printf("Added %s ($%.2f x %d)%n",
                    item.getDescription(), item.getPrice(), quantity);
        } else {
            System.out.printf("Not enough stock for %s.%n", item.getDescription());
        }
    }

    public double getSubtotal() {
        double subtotal = 0;
        for (int i = 0; i < items.size(); i++) {
            subtotal += items.get(i).getPrice() * quantities.get(i);
        }
        return subtotal;
    }

    public double getTax() {
        return getSubtotal() * TAX_RATE;
    }

    public double getTotal() {
        return getSubtotal() + getTax();
    }

    public ArrayList<RetailItem> getItems() {
        return items;
    }

    public ArrayList<Integer> getQuantities() {
        return quantities;
    }
}

class SalesReceipt {
    private CashRegister register;

    public SalesReceipt(CashRegister register) {
        this.register = register;
    }

    public void printReceipt() {
        System.out.println("\nSALES RECEIPT\n");
        for (int i = 0; i < register.getItems().size(); i++) {
            RetailItem item = register.getItems().get(i);
            int quantity = register.getQuantities().get(i);
            System.out.printf("%s - $%.2f x %d%n",
                    item.getDescription(), item.getPrice(), quantity);
        }
        System.out.printf("%nSubtotal: $%.2f%n", register.getSubtotal());
        System.out.printf("Tax: $%.2f%n", register.getTax());
        System.out.printf("Total: $%.2f%n", register.getTotal());
    }
}

public class TestRetailSystem {
    public static void main(String[] args) {
        RetailItem jacket = new RetailItem("001", "Jacket", 12, 59.95);
        RetailItem jeans = new RetailItem("002", "Jeans", 40, 34.95);
        RetailItem shirt = new RetailItem("003", "Shirt", 20, 24.95);

        CashRegister register = new CashRegister();
        register.addItem(jacket, 2);
        register.addItem(jeans, 3);
        register.addItem(shirt, 1);

        SalesReceipt receipt = new SalesReceipt(register);
        receipt.printReceipt();
    }
}
