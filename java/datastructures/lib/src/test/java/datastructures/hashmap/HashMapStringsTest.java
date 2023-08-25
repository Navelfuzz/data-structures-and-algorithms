package datastructures.hashmap;
import org.junit.jupiter.api.Test;
import java.io.IOException;

import static datastructures.hashmap.HashMapStrings.readTextFromFile;
import static org.junit.jupiter.api.Assertions.*;

public class HashMapStringsTest {

    @Test
    public void testFindFirstRepeatedWord() {
        try {
            String fileContent = readTextFromFile("./src/test/resources/gandalf.txt");
            System.out.println("File Content:\n" + fileContent);

            String result = HashMapStrings.findFirstRepeatedWord(fileContent);
            System.out.println("First Repeated Word: " + result);
            assertEquals("that", result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testCountWords() {
        try {
            String fileContent = readTextFromFile("./src/test/resources/gandalf.txt");
            System.out.println("File Content:\n" + fileContent);

            var wordCount = HashMapStrings.countWords(fileContent);
            System.out.println("Word Count: " + wordCount);
            assertEquals(285, wordCount.size()); // This number might vary based on actual content
            assertEquals(1, wordCount.get("Good"));
            assertEquals(6, wordCount.get("morning"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testMostFrequentWords() {
        try {
            String fileContent = readTextFromFile("./src/test/resources/gandalf.txt");
            System.out.println("File Content:\n" + fileContent);

            var mostFrequent = HashMapStrings.mostFrequentWords(fileContent, 5);
            System.out.println("Most Frequent Words: " + mostFrequent);
            assertEquals(5, mostFrequent.size());
            assertTrue(mostFrequent.contains("and"));
            assertTrue(mostFrequent.contains("that"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testReadTextFromFile() {
        try {
            String expectedContent = "All that the unsuspecting Bilbo saw that morning was an old man with a staff.";
            String actualContent = readTextFromFile("./src/test/resources/gandalf.txt");
            System.out.println("Actual File Content:\n" + actualContent);
            assertEquals(expectedContent, actualContent.substring(0, expectedContent.length()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
