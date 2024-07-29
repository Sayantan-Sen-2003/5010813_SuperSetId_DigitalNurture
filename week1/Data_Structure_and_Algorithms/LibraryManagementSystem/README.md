Exercise 6: Library Management System

#  Understanding Search Algorithms

## Linear Search:

Description: Checks each element sequentially until the desired element is found or the list ends.

Time Complexity:
Best-case: O(1)
Average-case: O(n)
Worst-case: O(n)

## Binary Search:
Description: Requires the list to be sorted. Repeatedly divides the list in half and compares the target element with the middle element.

Time Complexity:
Best-case: O(1)
Average-case: O(log n)
Worst-case: O(log n)


# When to Use Each Algorithm:

Linear Search: Suitable for small, unsorted datasets where sorting overhead is not justified. It is straightforward and does not require sorting.

Binary Search: More efficient for large datasets but requires the dataset to be sorted. For read-heavy and relatively static datasets, the initial sorting overhead is acceptable for faster searches.

