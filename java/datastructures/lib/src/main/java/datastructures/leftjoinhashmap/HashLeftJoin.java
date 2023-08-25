package datastructures.leftjoinhashmap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class HashLeftJoin {
    public static Map<String, String[]> leftJoin(HashMap<String, String> synonymsMap, HashMap<String, String> antonymsMap) {
        // Create a new HashMap to store the result of the left join
        Map<String, String[]> result = new HashMap<>();

        // Iterate through each entry in the synonymsMap
        for (Map.Entry<String, String> entry : synonymsMap.entrySet()) {
            String word = entry.getKey(); // Get the word from the key
            String synonym = entry.getValue(); // Get the synonym from the value
            String antonym = antonymsMap.getOrDefault(word, null); // Get the antonym from antonymsMap or null if not present
            result.put(word, new String[]{synonym, antonym}); // Store the word, synonym, and antonym in the result map
        }

        return result; // Return the result map containing the left join data
    }

}
