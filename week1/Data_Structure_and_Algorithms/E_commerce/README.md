Exercise 2: E-commerce Platform Search Function

taking class name as product1 instead of product as it is causing conflict in different packages

#  Understand Asymptotic Notation:
Big O Notation:

Big O notation is a mathematical representation used to describe the upper bound of an algorithm's running time as a function of the input size. It helps in analyzing the efficiency of algorithms by focusing on their growth rates, allowing us to compare different algorithms irrespective of machine-specific constants and lower-order terms.

- Best-case scenario: The condition under which an algorithm performs the fastest.
- Average-case scenario: The expected running time under typical conditions.
- Worst-case scenario: The condition under which an algorithm performs the slowest.

# Time Complexity Comparison:

Linear Search:

- Best-case: O(1) (target is the first element)
- Average-case: O(n)
- Worst-case: O(n) (target is the last element or not present)

Binary Search (requires sorted array):

- Best-case: O(1) (target is the middle element)
- Average-case: O(log n)
- Worst-case: O(log n) (target is not present)

# Suitable Algorithm for E-commerce Platform:

Binary search is generally more suitable for an e-commerce platform due to its logarithmic time complexity, which makes it much faster than linear search for large datasets. However, it requires the product array to be sorted, so maintaining a sorted array or using a data structure that supports efficient sorted operations (like a balanced binary search tree) is necessary.