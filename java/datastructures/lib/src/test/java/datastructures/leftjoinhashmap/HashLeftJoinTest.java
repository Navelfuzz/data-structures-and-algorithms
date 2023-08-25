package datastructures.leftjoinhashmap;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class HashLeftJoinTest {

    private String mapToString(Map<String, String[]> map) {
        if (map.isEmpty()) {
            return "{}"; // Return an empty map representation
        }

        StringBuilder sb = new StringBuilder();
        sb.append("{");
        for (Map.Entry<String, String[]> entry : map.entrySet()) {
            sb.append(entry.getKey()).append("=").append(Arrays.toString(entry.getValue())).append(", ");
        }
        sb.delete(sb.length() - 2, sb.length()); // Remove the trailing comma and space
        sb.append("}");
        return sb.toString();
    }


    @Test
    public void testLeftJoin() {
        System.out.println("Running testLeftJoin...");

        // Create synonyms hashmap
        HashMap<String, String> synonyms = new HashMap<>();
        synonyms.put("happy", "joyful");
        synonyms.put("sad", "unhappy");
        synonyms.put("good", "excellent");

        // Create antonyms hashmap
        HashMap<String, String> antonyms = new HashMap<>();
        antonyms.put("happy", "sad");
        antonyms.put("funny", "serious");
        antonyms.put("good", "bad");

        // Perform left join
        Map<String, String[]> result = HashLeftJoin.leftJoin(synonyms, antonyms);

        assertNotNull(result);
        assertEquals(3, result.size());

        // Print the result for this test
        System.out.println("Result of testLeftJoin: " + mapToString(result));
    }

    @Test
    public void testLeftJoinWithEmptyAntonyms() {
        System.out.println("Running testLeftJoinWithEmptyAntonyms...");

        // Create synonyms hashmap
        HashMap<String, String> synonyms = new HashMap<>();
        synonyms.put("hot", "warm");
        synonyms.put("cold", "chilly");

        // Create empty antonyms hashmap
        HashMap<String, String> antonyms = new HashMap<>();

        // Perform left join
        Map<String, String[]> result = HashLeftJoin.leftJoin(synonyms, antonyms);

        assertNotNull(result);
        assertEquals(2, result.size());

        // Print the result for this test
        System.out.println("Result of testLeftJoinWithEmptyAntonyms: " + mapToString(result));
    }

    @Test
    public void testLeftJoinWithEmptySynonyms() {
        System.out.println("Running testLeftJoinWithEmptySynonyms...");

        // Create empty synonyms hashmap
        HashMap<String, String> synonyms = new HashMap<>();

        // Create antonyms hashmap
        HashMap<String, String> antonyms = new HashMap<>();
        antonyms.put("fast", "slow");
        antonyms.put("up", "down");

        // Perform left join
        Map<String, String[]> result = HashLeftJoin.leftJoin(synonyms, antonyms);

        assertNotNull(result);
        assertEquals(0, result.size());

        // Print the result for this test
        System.out.println("Result of testLeftJoinWithEmptySynonyms: " + mapToString(result));
    }


}
