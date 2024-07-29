Exercise 3: Sorting Customer Orders

#  Understand Sorting Algorithms:
Sorting Algorithms:

Bubble Sort:

A simple comparison-based algorithm where each pair of adjacent elements is compared, and they are swapped if they are in the wrong order. This process is repeated until the list is sorted.
Time Complexity: O(n^2) for best, average, and worst-case scenarios.
Space Complexity: O(1) (in-place sorting).

Insertion Sort:

Builds the final sorted array one item at a time. It picks the next element and inserts it into the correct position in the already sorted part of the array.
Time Complexity: O(n) for best-case, O(n^2) for average and worst-case scenarios.
Space Complexity: O(1) (in-place sorting).

Quick Sort:

A divide-and-conquer algorithm. It selects a 'pivot' element and partitions the array into two halves, one with elements smaller than the pivot and the other with elements greater than the pivot. It then recursively sorts the sub-arrays.
Time Complexity: O(n log n) for average-case, O(n^2) for worst-case, typically O(n log n) with good pivot selection.
Space Complexity: O(log n) due to recursion stack.

Merge Sort:

A divide-and-conquer algorithm. It divides the array into two halves, recursively sorts them, and then merges the sorted halves.
Time Complexity: O(n log n) for all cases.
Space Complexity: O(n) due to auxiliary space required for merging.


# Analysis:
Time Complexity Comparison:

Bubble Sort:
Best-case: O(n) (when the array is already sorted)
Average-case: O(n^2)
Worst-case: O(n^2)
Space Complexity: O(1) (in-place sorting)

Quick Sort:
Best-case: O(n log n)
Average-case: O(n log n)
Worst-case: O(n^2) (when the pivot selection is poor, e.g., always choosing the smallest or largest element as pivot)
Space Complexity: O(log n) due to recursion stack (in-place sorting)

# Why Quick Sort is Generally Preferred Over Bubble Sort:

Efficiency: Quick Sort is significantly faster than Bubble Sort for large datasets due to its average-case time complexity of O(n log n).
Scalability: Quick Sort is more scalable and handles larger datasets more efficiently than Bubble Sort.
Performance: Although Quick Sort has a worst-case time complexity of O(n^2), this can be mitigated by choosing a good pivot (e.g., using the median-of-three method).