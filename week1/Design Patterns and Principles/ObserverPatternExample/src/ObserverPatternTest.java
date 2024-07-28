public class ObserverPatternTest {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();

        Observer mobileApp1 = new MobileApp("MobileApp1");
        Observer mobileApp2 = new MobileApp("MobileApp2");
        Observer webApp1 = new WebApp("WebApp1");

        // Register observers
        stockMarket.registerObserver(mobileApp1);
        stockMarket.registerObserver(mobileApp2);
        stockMarket.registerObserver(webApp1);

        // Update stock price
        stockMarket.setStockPrice("120.00");

        // Deregister one observer
        stockMarket.deregisterObserver(mobileApp2);

        // Update stock price again
        stockMarket.setStockPrice("125.50");
    }
}

// Output:
// MobileApp1 received stock price update: 120.00
// MobileApp2 received stock price update: 120.00
// WebApp1 received stock price update: 120.00
// MobileApp1 received stock price update: 125.50
// WebApp1 received stock price update: 125.50