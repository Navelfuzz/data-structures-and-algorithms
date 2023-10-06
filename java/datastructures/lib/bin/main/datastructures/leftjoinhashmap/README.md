# Code Challenge: Class 33 - Left Join Hashmap

**Feature Tasks**
Write a function that [LEFT JOINs](https://www.tutorialspoint.com/sql/sql-left-joins.htm) two hashmaps into a single data structure.

* Write a function called left join
* Arguments: two hash maps
  * The first parameter is a hashmap that has word strings as keys, and a synonym of the key as values.
  * The second parameter is a hashmap that has word strings as keys, and antonyms of the key as values.
  
* Return: The returned data structure that holds the results is up to you. It doesn’t need to exactly match the output below, so long as it achieves the LEFT JOIN logic
  
**NOTES:**

* Combine the key and corresponding values (if they exist) into a new data structure according to LEFT JOIN logic.
* LEFT JOIN means all the values in the first hashmap are returned, and if values exist in the “right” hashmap, 
they are appended to the result row.
* If no values exist in the right hashmap, then some flavor of `NULL` should be appended to the result row.

**Structure and Testing**

Utilize the Single-responsibility principle: any methods you write should be clean, reusable, abstract component 
parts to the whole challenge. You will be given feedback and marked down if you attempt to define a large, complex 
algorithm in one function definition.

Write at least three test assertions for each method that you define.

## Whiteboard Process
<!-- Embedded whiteboard image -->

## Approach & Efficiency

**Approach**

1. The implementation consists of a single static method named leftJoin, which takes two hashmaps as input. The first 
hashmap contains word strings as keys and corresponding synonyms as values, while the second hashmap contains word 
strings as keys and corresponding antonyms as values.
2. The leftJoin method iterates through each entry in the synonyms hashmap. For each entry:
   * The word key is retrieved.
   * The synonym value is retrieved.
   * The corresponding antonym is obtained from the antonyms hashmap using the word key.
3. The word, synonym, and antonym (if available) are then combined into an array of strings.
4. The resulting array is added to a new hashmap that holds the final result of the left join operation.
5. The method continues this process for all entries in the synonyms hashmap, ensuring that every word is included in the result, along with its associated synonym and antonym (if available).

**Efficiency**

* **Time Complexity:** The time complexity of the leftJoin operation is O(n), where n is the number of entries in the synonyms hashmap. This is because the method iterates through each entry once and performs constant-time operations for each entry.

* **Space Complexity:** The space complexity of the leftJoin operation is O(n), where n is the number of entries in the synonyms hashmap. The space is primarily used to store the result hashmap, which contains n entries, each holding an array of strings. Additionally, the memory usage for temporary variables and data structures is constant relative to the number of entries.

The implementation provides a straightforward and efficient way to achieve the LEFT JOIN logic between two hashmaps, 
combining the data from both sources into a single data structure. The use of hashmaps allows for quick lookups of 
synonyms and antonyms, resulting in a practical and scalable solution for the given problem.

## Solution

```java
function leftJoin(synonymsMap, antonymsMap):
result = empty HashMap

    // Iterate through each entry in the synonymsMap
    for each entry in synonymsMap:
        word = entry.key // Get the word from the entry's key
        synonym = entry.value // Get the synonym from the entry's value
        
        // Get the corresponding antonym from antonymsMap, or set it to null if not present
        antonym = antonymsMap.getOrDefault(word, null)
        
        // Combine the synonym and antonym into an array
        combinedData = [synonym, antonym]
        
        // Add the combined data to the result hashmap with the word as the key
        result.put(word, combinedData)
    
    // Return the final result hashmap containing the left join data
    return result
```

Explanation of the pseudocode:

1. Initialize an empty hashmap called result to store the final `result` of the left join operation.
2. Iterate through each entry in the `synonymsMap`.
3. Get the `word` key from the entry, representing the word string.
4. Get the `synonym` value from the entry, representing the synonym of the word.
5. Use `antonymsMap.getOrDefault(word, null)` to get the corresponding antonym from `antonymsMap`. If the antonym doesn't exist, set it to `null`.
6. Create an array called `combinedData` containing `synonym` and `antonym`.
7. Add a new entry to the `result` hashmap, with the `word` as the key and `combinedData` as the value.
8. Once all entries have been processed, return the `result` hashmap containing the combined data according to the LEFT JOIN logic.