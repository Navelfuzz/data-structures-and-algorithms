# CF401 Code Challenge: Class 30: Hash Table Implementation

## Feature Tasks

Implement a Hashtable with the following methods:

* set
  * Arguments: key, value
  * Returns: nothing
  * This method should hash the key, and add the key and value pair to the table, handling collisions as needed.
  * Should a given key already exist, replace its value from the `value` argument to this method.
* get
  * Arguments: key
  * Returns: Value associated with that key in the table
* has
  * Arguments: key
  * Returns: Boolean, indicating if the key exists in the table already.
* keys
  * Arguments: none
  * Returns: Collection of keys
* hash
  * Arguments: key
  * Returns: Index in the collection for that key

## Structure and Testing

Utilize the Single-responsibility principle: any methods you write should be clean, reusable, abstract component parts 
to the whole challenge. You will be given feedback and marked down if you attempt to define a large, complex algorithm 
in one function definition.

Be sure to follow your language/frameworks standard naming conventions (e.g. C# uses PascalCasing for all method and class names).

Any exceptions or errors that come from your code should be contextual, descriptive, capture-able errors. For example, 
rather than a default error thrown by your language, your code should raise/throw a custom error that describes what 
went wrong in calling the methods you wrote for this lab.

Write tests to prove the following functionality:

1. Setting a key/value to your hashtable results in the value being in the data structure
2. Retrieving based on a key returns the value stored
3. Successfully returns null for a key that does not exist in the hashtable
4. Successfully returns a list of all unique keys that exist in the hashtable
5. Successfully handle a collision within the hashtable
6. Successfully retrieve a value from a bucket within the hashtable that has a collision
7. Successfully hash a key to an in-range value

