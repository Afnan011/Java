package Strings;

// Program to convert the string into cipher text with the given key

public class EncryptDecrypt {

    public static String encrypt(String str, int key) {
        int newKey = key % 26;
        char[] charArray = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {

            int letterPosition = str.charAt(i) + newKey;
            if (letterPosition <= 122) {
                charArray[i] = (char) letterPosition;
            } else {
                charArray[i] = (char) (96 + letterPosition % 122);
            }
        }
        return new String(charArray);
    }

    public static String decrypt(String str, int key) {
        int newKey = key % 26;
        char[] charArray = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {

            int letterPosition = str.charAt(i) - newKey;
            if (letterPosition >= 97) {
                charArray[i] = (char) letterPosition;
            } else {
                charArray[i] = (char) (123 - 97 % letterPosition);
            }
        }
        return new String(charArray);
    }


    public static void main(String[] args) {

       String value = "haimynameisafnan";
       int key = 2;

       String encryptedValue = encrypt(value, key);
        System.out.printf("\nEncrypted message is");
        System.out.println(" - " + encryptedValue);

        System.out.printf("\nDecrypted message is");
        System.out.println(" - " + decrypt(encryptedValue, key));

    }

}
