package Demo;

import java.util.Arrays;

public class AnagramFinder {
    public static void main(String[] args) {
        String[] words = {"catch", "got", "tiger", "mat", "eat", "Pat", "tap", "tea"};
        String targetWord = "ate"; // Word to find anagram for
        boolean hasAnagram = hasAnagram(words, targetWord);
        System.out.println("Does the array contain an anagram of '" + targetWord + "'? " + hasAnagram);
    }

    private static boolean hasAnagram(String[] words, String targetWord) {
        if (words == null || words.length == 0 || targetWord == null || targetWord.isEmpty()) {
            return false; // Handle edge cases
        }

        // Preprocess the target word
        String sortedTarget = sortString(targetWord.toLowerCase());

        // Check each word in the array
        for (String word : words) {
            String sortedWord = sortString(word.toLowerCase());
            if (sortedWord.equals(sortedTarget)) {
                return true; // Anagram found
            }
        }

        return false; // No anagram found
    }

    private static String sortString(String str) {
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }
}