package HandsOn_7_Stringbuffer;

public class CorporateCipher {

    // Method to encrypt a message
    public static String encrypt(String message) {
        StringBuilder encrypted = new StringBuilder();

        for (char ch : message.toCharArray()) {
            if (ch >= 'A' && ch <= 'Z') {
                // Uppercase letter shift by +3 with wrap
                char enc = (char) ('A' + (ch - 'A' + 3) % 26);
                encrypted.append(enc);
            } else if (ch >= 'a' && ch <= 'z') {
                // Lowercase letter shift by +3 with wrap
                char enc = (char) ('a' + (ch - 'a' + 3) % 26);
                encrypted.append(enc);
            } else if (ch >= '0' && ch <= '9') {
                // Digits remain unchanged
                encrypted.append(ch);
            } else if (ch == ' ') {
                // Spaces replaced by underscore
                encrypted.append('_');
            } else {
                // Other characters copied as-is
                encrypted.append(ch);
            }
        }

        return encrypted.toString();
    }

    public static void main(String[] args) {
        String message = "Welcome to Corporate Cipher 2026!";
        String encryptedMessage = encrypt(message);

        System.out.println("Original Message: " + message);
        System.out.println("Encrypted Message: " + encryptedMessage);
    }
}
