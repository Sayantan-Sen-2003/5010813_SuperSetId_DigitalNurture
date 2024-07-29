Exercise 4: Employee Management System

# Array Representation in Memory:

Arrays are a contiguous block of memory where each element is of the same data type. Each element in the array is indexed, allowing for constant-time access (O(1)) to any element using its index. The primary advantages of arrays include:

Constant-Time Access: Accessing any element by index is O(1).
Predictable Memory Usage: Since arrays are of fixed size, memory allocation is straightforward and predictable.
Cache Friendliness: Due to contiguous memory allocation, arrays benefit from better cache performance.
However, arrays have limitations, such as fixed size (cannot grow dynamically without creating a new array) and expensive operations for insertion and deletion in the middle of the array.


#  Analysis:
Time Complexity:

Add Employee:

Best-case: O(1) (when there is space in the array)
Worst-case: O(1) (adding to the end of the array)

Search Employee:

Best-case: O(1) (if the employee is the first element)
Average-case: O(n)
Worst-case: O(n) (if the employee is the last element or not present)

Traverse Employees: O(n)

Delete Employee:

Best-case: O(1) (if the employee is the last element)
Average-case: O(n)
Worst-case: O(n) (if the employee is the first element, requiring all subsequent elements to be shifted)

Limitations of Arrays:

Fixed Size: Once created, the size of an array cannot be changed. If more elements are needed, a new, larger array must be created, and elements must be copied over.
Insertion and Deletion: Inserting or deleting elements, especially in the middle of the array, can be expensive as it requires shifting elements.
Wasted Space: If the array is not fully utilized, it results in wasted memory.

When to Use Arrays:

When size is known and constant: Arrays are suitable when the number of elements is fixed or known in advance.
Fast access: When O(1) access time is required for read and update operations.