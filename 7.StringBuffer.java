package StringOperations;

public class StringBufferOperations {
    public static void main(String[] args) {
        // Initialize a StringBuffer with an initial string
        StringBuffer stringBuffer = new StringBuffer("Vijay Shankar E S");

        // a) Length of a string
        System.out.println("Length of the string: " + getStringLength(stringBuffer));

        // b) Reverse a string
        StringBuffer reversedString = reverseString(stringBuffer);
        System.out.println("Reversed String: " + reversedString);

        // c) Delete a substring from the given string
        int startIndex = 5;
        int endIndex = 8;
        StringBuffer modifiedString = deleteSubstring(new StringBuffer("Vijay Shankar E S"), startIndex, endIndex);
        System.out.println("String after deletion: " + modifiedString);
    }

    // Method to get the length of the StringBuffer
    public static int getStringLength(StringBuffer sb) {
        return sb.length();
    }

    // Method to reverse a string
    public static StringBuffer reverseString(StringBuffer sb) {
        return sb.reverse();
    }

    // Method to delete a substring
    public static StringBuffer deleteSubstring(StringBuffer sb, int startIndex, int endIndex) {
        return sb.delete(startIndex, endIndex);
    }
}
