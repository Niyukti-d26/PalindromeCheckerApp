import java.util.Scanner;

public class PalindromeCheckerApp {

    // UC2 - Using charAt()
    public static boolean checkPalindrome(String text) {
        for (int i = 0; i < text.length() / 2; i++) {
            if (text.charAt(i) != text.charAt(text.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    // UC3 - Reverse and compare
    private static void reverseAndCheck(String text) {
        String reversed = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            reversed += text.charAt(i);
        }

        System.out.println("UC3: Reversed text is: " + reversed);

        if (text.equals(reversed)) {
            System.out.println("UC3: Text is a palindrome.");
        } else {
            System.out.println("UC3: Text is not a palindrome.");
        }
    }

    // UC4
    private static boolean characterCheck(String text) {

        char[] chars = text.toCharArray();
        int start = 0;
        int end = chars.length - 1;

        while (start < end) {
            if (chars[start] != chars[end]) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {

        // UC1
        System.out.println("System initialized successfully");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the input text: ");
        String text = sc.nextLine();

        // UC2
        boolean isPalindrome = checkPalindrome(text);
        if (isPalindrome) {
            System.out.println("UC2: Text is a palindrome.");
        } else {
            System.out.println("UC2: Text is not a palindrome.");
        }

        // UC3
        reverseAndCheck(text);

        // UC4
        boolean charCheckResult = characterCheck(text);
        if (charCheckResult) {
            System.out.println("UC4: Text is a palindrome (character check).");
        } else {
            System.out.println("UC4: Text is not a palindrome (character check).");
        }

    }
}
