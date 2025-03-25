package mar19;
public class StringReverse {
    public static void main(String[] args) {
        String s = "hello";
        System.out.println( reverseVowels(s));
    }

    public static void reverseString(char[] s) {
        int mid = s.length / 2;
        for (int i = 0; i < mid; i++) {
            swap(s, i, s.length - 1 - i);
        }
    }

    private static void swap(char[] s, int i, int j) {
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;
    }
    public static String reverseVowels(String s) {
        char[] arr = s.toCharArray(); 
        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            while (start < end && !isVowel(arr[start])) { // Move start pointer
                start++;
            }
            while (start < end && !isVowel(arr[end])) { // Move end pointer
                end--;
            }

            // Swap vowels
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            // Move pointers inward
            start++;
            end--;
        }

        return new String(arr); // Convert character array back to string


    }

    public static boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}