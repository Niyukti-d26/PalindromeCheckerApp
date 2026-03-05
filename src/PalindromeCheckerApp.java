import java.util.Scanner;

public class PalindromeCheckerApp {
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
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input text: ");
        String text = sc.nextLine();


        // UC3: Reverse the string and compare
        reverseAndCheck(text);

    }
}
