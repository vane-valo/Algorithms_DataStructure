
import java.util.Arrays;

public class ArraysAndHashing{
    public static void main(String[] args) {
        int[] array1 = {2,3,1,3,4};

        System.out.println("\nContains Duplicate");
        System.out.println("First Array: " + Arrays.toString(array1) +
        " Solution: " + Solutions.hasDuplicate(array1));

        String s = "jam";
        String t = "jar";

        System.out.println("\nValid Anagram");
        System.out.println("First String: " + s +
        " String: " + t +
        " Solution: " + Solutions.isAnagram(s, t));
    }
        
    public class Solutions {
        public static boolean hasDuplicate(int[] nums) {
            /*Given an integer array nums, return true if any value appears more than once in the array,
            otherwise return false.*/

            Arrays.sort(nums);

            for (int i = 1; i < nums.length; i++) {
                if (nums[i] == nums[i-1]) {
                    return true;
                }
            }
            return false;
        }

        public static boolean isAnagram(String s, String t) {
            /*Given two strings s and t, return true if the two strings are anagrams of each other,
            otherwise return false.*/

            if (s.length() != t.length()) {
                return false;
            }

            char[] charArrayS = s.toCharArray();
            char[] charArrayT = t.toCharArray();
            Arrays.sort(charArrayS);
            Arrays.sort(charArrayT);
            
            return Arrays.equals(charArrayS, charArrayT);
        }

    }
}