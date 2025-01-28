package StringOperations;

public class StringOperations {
    public static void main(String[] args) {
        // Initialize two strings for concatenation
        String str1 = "Vijay";
        String str2 = "Shankar E S";

        // a) String Concatenation
        String concatenatedString = concatenateStrings(str1, str2);
        System.out.println("Concatenated String: " + concatenatedString);

        // b) Search for a Substring
        String searchString = "ay";
        boolean isSubstringPresent = searchSubstring(str1, searchString);
        System.out.println("Is \"" + searchString + "\" present in \"" + str1 + "\": " + isSubstringPresent);

        // c) Extract a Substring
        int startIndex = 1;
        int endIndex = 4;
        String extractedSubstring = extractSubstring(str1, startIndex, endIndex);
        System.out.println("Substring from index " + startIndex + " to " + endIndex + " in \"" + str1 + "\": " + extractedSubstring);
    }

    // Method to concatenate two strings
    public static String concatenateStrings(String str1, String str2) {
        return str1 + " " + str2;
    }

    // Method to search for a substring
    public static boolean searchSubstring(String str, String subStr) {
        return str.contains(subStr);
    }

    // Method to extract a substring
    public static String extractSubstring(String str, int startIndex, int endIndex) {
        return str.substring(startIndex, endIndex);
    }
}
