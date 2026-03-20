package HandsOn_7_Stringbuffer;

public class MyTrim {

    // Custom method to trim leading and trailing spaces
    public static String myTrim(String str) {
        int start = 0;
        int end = str.length() - 1;

        // Find first non-space character from the start
        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }

        // Find first non-space character from the end
        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }

        // If all spaces, return empty string
        if (start > end) {
            return "";
        }

        // Build the trimmed string
        StringBuilder trimmed = new StringBuilder();
        for (int i = start; i <= end; i++) {
            trimmed.append(str.charAt(i));
        }

        return trimmed.toString();
    }

    public static void main(String[] args) {
        String input = "   Welcome to Java   ";
        String output = myTrim(input);
        System.out.println("Original: \"" + input + "\"");
        System.out.println("Trimmed : \"" + output + "\"");
    }
}
