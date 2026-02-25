import java.util.LinkedList;
import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input : ");
        String input = scanner.nextLine();

        LinkedList<Character> list = new LinkedList<>();

        // Convert string to linked list
        for (char c : input.toCharArray()) {
            list.add(c);
        }

        boolean isPalindrome = checkPalindrome(list);

        System.out.println("Is Palindrome? : " + isPalindrome);
        scanner.close();
    }

    private static boolean checkPalindrome(LinkedList<Character> list) {

        int size = list.size();
        int mid = size / 2;

        // Reverse second half
        LinkedList<Character> secondHalf = new LinkedList<>();
        for (int i = size - 1; i >= mid; i--) {
            secondHalf.add(list.get(i));
        }

        // Compare first half and reversed second half
        for (int i = 0; i < mid; i++) {
            if (!list.get(i).equals(secondHalf.get(i))) {
                return false;
            }
        }

        return true;
    }
}