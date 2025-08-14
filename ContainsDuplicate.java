
import java.util.Arrays;

public class ContainsDuplicate{

    /* 
    Given an integer array nums, return true if any value appears more than once in the array, otherwise return false.

    Example 1:

    Input: nums = [1, 2, 3, 3]

    Output: true

    Example 2:

    Input: nums = [1, 2, 3, 4]

    Output: false 
    */

    public static void main(String[] args) {
        int[] array1 = {2,3,1,3,4};
        int[] array2 = {2,4,1,3,5};

        System.out.println("First Array: " + Arrays.toString(array1) +
        " Solution: " + Solution.hasDuplicate(array1));

        System.out.println("First Array: " + Arrays.toString(array2) +
        " Solution: " + Solution.hasDuplicate(array2));
        
    }
        
    public class Solution {
        public static boolean hasDuplicate(int[] nums) {
            Arrays.sort(nums);

            for (int i = 1; i < nums.length; i++) {
                if (nums[i] == nums[i-1]) {
                    return true;
                }
            }
            return false;
        }
    }
}