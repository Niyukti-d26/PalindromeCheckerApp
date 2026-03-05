import java.util.Scanner;

public class PalindromeCheckerApp {
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

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the input text: ");
        String text = sc.nextLine();

        // UC4
        boolean charCheckResult = characterCheck(text);
        if (charCheckResult) {
            System.out.println("UC4: Text is a palindrome (character check).");
        } else {
            System.out.println("UC4: Text is not a palindrome (character check).");
        }

    }
}
