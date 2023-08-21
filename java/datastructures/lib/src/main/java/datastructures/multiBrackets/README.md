# Code Challenge: Class 13: Multi-bracket Validation

## Feature Tasks
* Write a function called validate brackets
* Arguments: string
* Return: boolean
  * representing whether or not the brackets in the string are balanced

There are 3 types of brackets:

* Round Brackets : ()
* Square Brackets : []
* Curly Brackets : {}

## Whiteboard Process
<!-- Embedded whiteboard image -->

## Approach & Efficiency
O(n) 

Here's a breakdown of why the time complexity is O(n):

1. The function iterates through each character in the input string exactly once using a loop.
2. Inside the loop, each character is processed in constant time O(1), regardless of the number of brackets in the input string.
3. The stack operations (push and pop) also take constant time on average.

## Solution
Run tests in the BracketValidatorTest.java file (src/test/java/datastructures/multiBrackets/BracketValidatorTest.java)