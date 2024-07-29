
Exercise 5: Task Management System

#  Understand Linked Lists:
Types of Linked Lists:

Singly Linked List:
Each node contains data and a reference to the next node in the sequence.
Advantages: Simple structure, efficient for insertions/deletions.
Disadvantages: Inefficient for backward traversal (no reference to the previous node).

Doubly Linked List:
Each node contains data, a reference to the next node, and a reference to the previous node.
Advantages: Allows for efficient forward and backward traversal.
Disadvantages: More memory usage due to extra reference.


# Analysis:
Time Complexity:

Add Task:
Best-case: O(1) (when adding at the head)
Average-case: O(n) (when adding at the end)
Worst-case: O(n) (when adding at the end)

Search Task:
Best-case: O(1) (if the task is the first element)
Average-case: O(n)
Worst-case: O(n) (if the task is the last element or not present)
Traverse Tasks: O(n)

Delete Task:
Best-case: O(1) (if the task is the first element)
Average-case: O(n)
Worst-case: O(n) (if the task is the last element or not present)

# Advantages of Linked Lists Over Arrays for Dynamic Data:

Dynamic Size: Linked lists can grow and shrink dynamically, making them suitable for situations where the number of elements is not known in advance.

Efficient Insertions/Deletions: Inserting or deleting elements in a linked list is more efficient than in an array, especially for non-end positions, as it does not require shifting elements.

Memory Utilization: Linked lists can be more memory-efficient for varying numbers of elements, as they allocate memory as needed.


# Limitations of Linked Lists:

- Access Time: Accessing an element by index in a linked list is O(n) compared to O(1) for arrays.
- Memory Overhead: Each node in a linked list requires additional memory for storing a reference to the next node.