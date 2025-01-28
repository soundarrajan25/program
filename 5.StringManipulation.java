public class StringManipulation {
    public static void main(String[] args) {
        String str1 = "ESSM";
        String str2 = "College";

        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        // a) String Length
        System.out.println("Length of the first string: " + charArray1.length);
        System.out.println("Length of the second string: " + charArray2.length);

        // b) Finding a character at a particular position
        int position = 2;
        try {
            System.out.println("Character at position " + position + " in the first string: " + charArray1[position]);
            System.out.println("Character at position " + position + " in the second string: " + charArray2[position]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

        // c) Concatenating two strings
        StringBuilder sb = new StringBuilder();
        sb.append(charArray1);
        sb.append(charArray2);
        System.out.println("Concatenated String: " + sb.toString());
    }
}
