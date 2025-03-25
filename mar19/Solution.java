package mar19;
public class Solution {
    public static String reverseVowels(String s) {
        char[] arr = s.toCharArray(); // Convert string to character array
        int start = 0, end = arr.length - 1;

        while (start < end) {
            if (isVowel(arr[start]) && isVowel(arr[end])) {
                // Swap vowels
                char temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;

                // Move both pointers inward
                start++;
                end--;
            } else if (!isVowel(arr[start]) && !isVowel(arr[end])) {
                // If both are consonants, move both pointers inward
                start++;
                end--;
            } else if (!isVowel(arr[start])) {
                start++; // Move start forward if it's not a vowel
            } else {
                end--; // Move end backward if it's not a vowel
            }
        }

        return new String(arr); // Convert character array back to string
    }

    public static boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }

    public static void main(String[] args) {
        System.out.println(reverseVowels("hello"));      // Output: "holle"
        System.out.println(reverseVowels("leetcode"));   // Output: "leotcede"
        System.out.println(reverseVowels("aA"));        // Output: "Aa"
        System.out.println(reverseVowels("programming")); // Output: "prigrammong"
        System.out.println(reverseVowels("bcadefg"));      // Output: "bcdfg" (No change)
    }
}
