package datastructures.hashmap;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class HashMapStrings {

    public static String findFirstRepeatedWord(String input) {
        System.out.println("Executing findFirstRepeatedWord function...");

        String[] words = input.split("\\s+");
        Set<String> seenWords = new HashSet<>();

        for (String word : words) {
            if (seenWords.contains(word)) {
                System.out.println("Found repeated word: " + word);
                return word;
            }
            seenWords.add(word);
        }

        System.out.println("No repeated words found.");
        return null; // No repeated words found
    }

    public static Map<String, Integer> countWords(String input) {
        System.out.println("Executing countWords function...");

        String[] words = input.split("\\s+");
        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        System.out.println("Word count: " + wordCount);
        return wordCount;
    }

    public static List<String> mostFrequentWords(String input, int numWords) {
        System.out.println("Executing mostFrequentWords function...");

        Map<String, Integer> wordCount = countWords(input);

        PriorityQueue<Map.Entry<String, Integer>> maxHeap = new PriorityQueue<>(
                (a, b) -> b.getValue().compareTo(a.getValue())
        );
        maxHeap.addAll(wordCount.entrySet());

        List<String> result = new ArrayList<>();
        for (int i = 0; i < numWords && !maxHeap.isEmpty(); i++) {
            result.add(maxHeap.poll().getKey());
        }

        System.out.println("Most frequent words: " + result);
        return result;
    }

    public static String readTextFromFile(String filePath) throws IOException {
        System.out.println("Executing readTextFromFile function...");

        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        }
        System.out.println("Read content from file:\n" + content);
        return content.toString();
    }
}

