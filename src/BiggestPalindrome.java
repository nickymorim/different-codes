import java.util.*;

public class BiggestPalindrome {

    private static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    private static String largest(String str) {
        String largestPalindrome = "";
        for (int i = 0; i < str.length(); i++) {
            for (int j = str.length() - 1; j >= i; j--) {
                String substring = str.substring(i, j + 1);
                if (isPalindrome(substring) && substring.length() > largestPalindrome.length()) {
                    largestPalindrome = substring;
                }
            }
        }

        return largestPalindrome;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();

        if (largest(str).length() >= 2) {
            System.out.println("The largest palindrome in this word is " + largest(str));
        } else {
            System.out.println("The word doesn't have/is a palindrome!");
        }
    }

}