public class LinearSearch {
    public static Product1 linearSearch(Product1[] products, String targetName) {
        for (Product1 product : products) {
            if (product.getProductName().equalsIgnoreCase(targetName)) {
                return product;
            }
        }
        return null;
    }
}
