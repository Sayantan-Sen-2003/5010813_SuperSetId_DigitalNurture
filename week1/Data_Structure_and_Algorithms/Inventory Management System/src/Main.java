public class Main {
    public static void main(String[] args) {
        // Create an Inventory object
        Inventory inventory = new Inventory();

        // Add products to the inventory
        Product product1 = new Product("P001", "Laptop", 10, 999.99);
        Product product2 = new Product("P002", "Smartphone", 20, 499.99);
        Product product3 = new Product("P003", "Tablet", 15, 299.99);

        inventory.addProduct(product1);
        inventory.addProduct(product2);
        inventory.addProduct(product3);

        // Display added products
        System.out.println("Added Products:");
        displayProduct(inventory.getProduct("P001"));
        displayProduct(inventory.getProduct("P002"));
        displayProduct(inventory.getProduct("P003"));

        // Update a product in the inventory
        Product updatedProduct = new Product("P002", "Smartphone", 30, 459.99);
        inventory.updateProduct(updatedProduct);

        // Display updated product
        System.out.println("\nUpdated Product:");
        displayProduct(inventory.getProduct("P002"));

        // Delete a product from the inventory
        inventory.deleteProduct("P003");

        // Try to display deleted product
        System.out.println("\nDeleted Product:");
        Product deletedProduct = inventory.getProduct("P003");
        if (deletedProduct == null) {
            System.out.println("Product P003 not found.");
        } else {
            displayProduct(deletedProduct);
        }
    }

    // Helper method to display product details
    private static void displayProduct(Product product) {
        if (product != null) {
            System.out.println("Product ID: " + product.getProductId());
            System.out.println("Product Name: " + product.getProductName());
            System.out.println("Quantity: " + product.getQuantity());
            System.out.println("Price: $" + product.getPrice());
            System.out.println();
        }
    }
}

// output:
// Added Products:
// Product ID: P001
// Product Name: Laptop
// Quantity: 10
// Price: $999.99

// Product ID: P002
// Product Name: Smartphone
// Quantity: 20
// Price: $499.99

// Product ID: P003
// Product Name: Tablet
// Quantity: 15
// Price: $299.99


// Updated Product:
// Product ID: P002
// Product Name: Smartphone
// Quantity: 30
// Price: $459.99


// Deleted Product:
// Product P003 not found.