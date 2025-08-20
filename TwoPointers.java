
import java.util.Arrays;

public class TwoPointers {
    public static void main(String[] args) {

        String s = "Was it a car or a cat I saw?";

        System.out.println("\nValid Palindrome");
        System.out.println("String: " + s +
        " Solution: " + SolutionsTwoPointers.isPalindrome(s));
    }

    public class SolutionsTwoPointers{

        public static  boolean isPalindrome(String s) {

            String plainString = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
            System.out.println("Text with no caracters and spaces: " + plainString);

            char[] charArrayS = plainString.toCharArray();
            System.out.println("Char array: " + Arrays.toString(charArrayS));

            int arrayLength = charArrayS.length - 1;

            for (int i = 0; i < arrayLength; i++) {
                if (charArrayS[i] != charArrayS[arrayLength]) {
                    System.out.println("Comparison[i]: " + charArrayS[i] + " != " + charArrayS[arrayLength]);
                    return false;
                }
                arrayLength--;
            }
            return true;
        }
    }
}
