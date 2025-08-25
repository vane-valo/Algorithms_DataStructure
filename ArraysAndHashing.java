
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class ArraysAndHashing{
    public static void main(String[] args) {
        int[] array1 = {2,3,1,5,4};

        System.out.println("\nContains Duplicate");
        System.out.println("Array: " + Arrays.toString(array1) +
        " Solution: " + SolutionsHash.hasDuplicate(array1));

        String s = "sadder";
        String t = "dreads";

        System.out.println("\nValid Anagram");
        System.out.println("First String: " + s +
        " Second String: " + t +
        " Solution: " + SolutionsHash.isAnagram(s, t));

        int[] nums = {1,5,8,7,4};
        int target = 10;

        System.out.println("\nTwo Sums");
        System.out.println("Array num: " + Arrays.toString(nums) +
        " Target: " + target +
        " Solution: " + Arrays.toString(SolutionsHash.twoSum(nums, target)));
    }
        
    public class SolutionsHash {
        public static boolean hasDuplicate(int[] nums) {
            /*Given an integer array nums, return true if any value appears more than once in the array,
            otherwise return false.*/

            //Create HashSet to store elements from the array
            Set<Integer> numSet = new HashSet<>(); 

            //Itirate through each element in the array
            for (int num : nums) {
                //Check if the element is already in the HashSet
                if (numSet.contains(num)) {
                    return true; //Duplicate found
                }
                //Add Element through the HashSet
                numSet.add(num);
            }
            return false; //No duplicates found
        }

        public static boolean isAnagram(String s, String t) {
            /*Given two strings s and t, return true if the two strings are anagrams of each other,
            otherwise return false.*/

            //Validate if the strings are the same length
            if (s.length() != t.length()) {
                return false;
            }

            //Create a HashMap for each string
            HashMap<Character, Integer> countS = new HashMap<>();
            HashMap<Character, Integer> countT = new HashMap<>();

            //Itiriate through each character from the s string since they are the same length
            for (int i = 0; i < s.length(); i++) {
                //Add each character to the corresponding HashMap
                countS.put(s.charAt(i), countS.getOrDefault(s.charAt(i), 0) + 1);
                countT.put(t.charAt(i), countT.getOrDefault(t.charAt(i), 0) + 1);
            }
            
            return countS.equals(countT); //Return true if they are equal
        }

        public static int[] twoSum(int[] nums, int target){
            /*Given an array of integers nums and an integer target, return the indices i and j such that 
            nums[i] + nums[j] == target and i != j.*/

            HashMap<Integer, Integer> indices = new HashMap<>();

            for (int i = 0; i < nums.length; i++) {
                indices.put(nums[i], i);
            }
            System.out.println("Map: " + indices);

            for (int i = 0; i < nums.length; i++) {
                int diff = target - nums[i];

                System.out.println("Direfencia: " + target + " - " + nums[i] + " = " + diff);
                System.out.println("Contains: " + indices.containsKey(diff));
                System.out.println("Get: " + indices.get(diff));
                System.out.println("i: " + i);

                if (indices.containsKey(diff) && indices.get(diff) != i) {
                    return new int[]{i, indices.get(diff)};
                }
            }
            return new int[0];
        }
    }
}