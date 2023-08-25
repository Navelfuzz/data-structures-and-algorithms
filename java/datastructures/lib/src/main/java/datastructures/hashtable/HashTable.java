package datastructures.hashtable;

import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;

public class HashTable<K, V> {
    // Initial size of the bucket array
    private final int INITIAL_SIZE = 10;

    // The array of linked lists that will store the key-value pairs
    private LinkedList<HashNode>[] bucketArray;

    // Number of buckets in the array
    protected final int numBuckets;

    // Number of key-value pairs stored in the hash table
    private int size;

    // Inner class to represent a node in the linked list
    private class HashNode {
        K key;
        V value;

        HashNode(K key, V value){
            this.key = key;
            this.value = value;
        }
    }

    // Constructor for creating a new hash table
    public HashTable(){
        bucketArray = new LinkedList[INITIAL_SIZE]; // Initialize the bucket array with initial size
        numBuckets = INITIAL_SIZE; // Set the number of buckets to initial size
        size = 0; // Initialize the size to 0 since there are no elements yet
    }

    // Hash function to map keys to bucket indices
    private int hash(K key) {
        int hashCode = key.hashCode(); // Get the hash code of the key
        int index = Math.abs(hashCode) % numBuckets; // Calculate the bucket index using modulo
        return index;
    }

    // Method to set a key-value pair in the hash table
    public void set(K key, V value){
        int bucketIndex = hash(key); // Calculate the bucket index for the given key
        if(bucketArray[bucketIndex] == null){
            bucketArray[bucketIndex] = new LinkedList<>(); // Create a new linked list if bucket is empty
        }
        LinkedList<HashNode> chain = bucketArray[bucketIndex]; // Get the linked list (chain) for the bucket
        for(HashNode node : chain){
            if(node.key.equals(key)){
                node.value = value; // Update the value if the key already exists
                return;
            }
        }
        size++; // Increment size since we're adding a new key-value pair
        chain.add(new HashNode(key, value)); // Add the new key-value pair to the chain
    }

    // Method to get the value associated with a given key
    public V get(K key) {
        int bucketIndex = hash(key); // Calculate the bucket index for the given key
        LinkedList<HashNode> chain = bucketArray[bucketIndex]; // Get the linked list (chain) for the bucket
        if(chain != null){
            for(HashNode node : chain){
                if(node.key.equals(key)){
                    return node.value; // Return the value if the key is found
                }
            }
        }
        return null; // Return null if the key is not found
    }

    // Method to check if a key exists in the hash table
    public boolean has(K key){
        int bucketIndex = hash(key); // Calculate the bucket index for the given key
        LinkedList<HashNode> chain = bucketArray[bucketIndex]; // Get the linked list (chain) for the bucket
        if(chain != null){
            for(HashNode node : chain){
                if(node.key.equals(key)){
                    return true; // Return true if the key is found
                }
            }
        }
        return false; // Return false if the key is not found
    }

    // Method to get a list of all keys in the hash table
    public List<K> keys(){
        List<K> keys = new ArrayList<>(); // Create a new list to store the keys
        for(LinkedList<HashNode> chain : bucketArray){
            if(chain != null){
                for(HashNode node : chain){
                    keys.add(node.key); // Add each key to the list
                }
            }
        }
        return keys; // Return the list of keys
    }

    // Method to get the bucket index for a given key
    public int getBucketIndexForKey(K key){
        return hash(key); // Calculate and return the bucket index for the given key
    }

    // Method to get the number of key-value pairs in the hash table
    public int size(){
        return size; // Return the size of the hash table
    }
}
