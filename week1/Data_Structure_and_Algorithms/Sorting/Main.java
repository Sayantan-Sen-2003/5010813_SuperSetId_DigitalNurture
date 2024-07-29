package week1.Data_Structure_and_Algorithms.Sorting;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Order[] orders = {
            new Order("O001", "Alice", 250.50),
            new Order("O002", "Bob", 150.75),
            new Order("O003", "Charlie", 300.40),
            new Order("O004", "David", 100.20),
            new Order("O005", "Eve", 200.00)
        };

        // Clone the orders array for each sort to avoid sorting an already sorted array
        Order[] bubbleSortedOrders = orders.clone();
        Order[] quickSortedOrders = orders.clone();

        // Bubble Sort
        BubbleSort.bubbleSort(bubbleSortedOrders);
        System.out.println("Bubble Sorted Orders:");
        Arrays.stream(bubbleSortedOrders).forEach(System.out::println);

        // Quick Sort
        QuickSort.quickSort(quickSortedOrders, 0, quickSortedOrders.length - 1);
        System.out.println("\nQuick Sorted Orders:");
        Arrays.stream(quickSortedOrders).forEach(System.out::println);
    }
}


// output:
// Bubble Sorted Orders:
// Order{orderId='O004', customerName='David', totalPrice=100.2}
// Order{orderId='O002', customerName='Bob', totalPrice=150.75}
// Order{orderId='O005', customerName='Eve', totalPrice=200.0}
// Order{orderId='O001', customerName='Alice', totalPrice=250.5}
// Order{orderId='O003', customerName='Charlie', totalPrice=300.4}

// Quick Sorted Orders:
// Order{orderId='O004', customerName='David', totalPrice=100.2}
// Order{orderId='O002', customerName='Bob', totalPrice=150.75}
// Order{orderId='O005', customerName='Eve', totalPrice=200.0}
// Order{orderId='O001', customerName='Alice', totalPrice=250.5}
// Order{orderId='O003', customerName='Charlie', totalPrice=300.4}