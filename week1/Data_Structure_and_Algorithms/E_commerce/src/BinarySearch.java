
import java.util.Arrays;
import java.util.Comparator;

public class BinarySearch {
    public static Product1 binarySearch(Product1[] products, String targetName) {
        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int comparison = products[mid].getProductName().compareToIgnoreCase(targetName);

            if (comparison == 0) {
                return products[mid];
            } else if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Product1[] products = {
            new Product1("P001", "Laptop", "Electronics"),
            new Product1("P002", "Smartphone", "Electronics"),
            new Product1("P003", "Tablet", "Electronics"),
            new Product1("P004", "Headphones", "Accessories"),
            new Product1("P005", "Smartwatch", "Accessories")
        };

        // Sort the products array for binary search
        Arrays.sort(products, Comparator.comparing(Product1::getProductName));

        // Test binary search
        Product1 foundProduct = binarySearch(products, "Tablet");
        if (foundProduct != null) {
            System.out.println("Product found: " + foundProduct.getProductName());
        } else {
            System.out.println("Product not found");
        }
    }
}

// output:
// Product found: Tablet