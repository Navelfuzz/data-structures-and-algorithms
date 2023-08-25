package datastructures.hashtable;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class HashTableTest {
    private HashTable<String, Integer> hashTable;

    @BeforeEach
    public void setUp() {
        hashTable = new HashTable<>();
    }

    @Test
    public void testSetAndGet() {
        System.out.println("Test: Set and Get");
        hashTable.set("key1", 42);
        int value = hashTable.get("key1");
        assertEquals(42, value);
        System.out.println("Value retrieved: " + value);
    }

    @Test
    public void testGetNonExistentKey() {
        System.out.println("Test: Get Non-Existent Key");
        Integer value = hashTable.get("nonExistentKey");
        assertNull(value);
        System.out.println("Value retrieved: " + value);
    }

    @Test
    public void testUniqueKeys() {
        System.out.println("Test: Unique Keys");
        hashTable.set("key1", 1);
        hashTable.set("key2", 2);
        hashTable.set("key3", 3);

        List<String> keys = hashTable.keys();
        assertEquals(3, keys.size());
        assertTrue(keys.contains("key1"));
        assertTrue(keys.contains("key2"));
        assertTrue(keys.contains("key3"));
        System.out.println("Keys retrieved: " + keys);
    }


    @Test
    public void testCollisionHandling() {
        System.out.println("Test: Collision Handling");
        int totalPairs = 10;
        for (int i = 1; i <= totalPairs; i++) {
            String key = "key" + i;
            int hashValue = hashTable.getBucketIndexForKey(key);
            System.out.println(key + " hashed to index: " + hashValue);
            hashTable.set(key, i);
        }

        List<String> keys = hashTable.keys();
        System.out.println("Keys in the hash table: " + keys);

        for (int i = 1; i <= totalPairs; i++) {
            String key = "key" + i;
            assertEquals(i, hashTable.get(key));
            System.out.println("Value retrieved for " + key + ": " + hashTable.get(key));
        }
    }

    @Test
    public void testValueRetrievalWithCollision() {
        System.out.println("Test: Value Retrieval with Collision");
        int totalPairs = 10;
        for (int i = 1; i <= totalPairs; i++) {
            String key = "key" + i;
            int hashValue = hashTable.getBucketIndexForKey(key);
            System.out.println(key + " hashed to index: " + hashValue);
            hashTable.set(key, i);
        }

        List<String> keys = hashTable.keys();
        System.out.println("Keys in the hash table: " + keys);

        for (int i = 1; i <= totalPairs; i++) {
            String key = "key" + i;
            assertEquals(i, hashTable.get(key));
            System.out.println("Value retrieved for " + key + ": " + hashTable.get(key));
        }
    }

    @Test
    public void testHashInRange() {
        System.out.println("Test: Hash in Range");
        String key = "testKey";
        int hashValue = hashTable.getBucketIndexForKey(key);
        assertTrue(hashValue >= 0 && hashValue < hashTable.numBuckets);
        System.out.println("Hash value for key '" + key + "': " + hashValue);
    }
}
