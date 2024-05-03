package Arrays;

// Remove Duplicates from Sorted Array - LeetCode 26

// Given a sorted array nums, remove the duplicates in-place such that each element appears only once and returns the new length. Do not allocate extra space for another array; you must do this by modifying the input array in-place with O(1) extra memory.

// Example:

//     Input: nums = [1, 1, 2] 
//     Output: 2

public class RemoveDuplicatesFromSortedArray {
    public static int removeDuplicates(int[] array) {
        int i = 0;

        for (int j = 0; j < array.length; j++) {
            if (array[j] != array[i]) {
                i++;
                array[i] = array[j];
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        var nums = new int[] { 1, 1, 2, 2, 2, 2, 2, 2, 2, 3 };
        System.out.println(removeDuplicates(nums));
    }
}
