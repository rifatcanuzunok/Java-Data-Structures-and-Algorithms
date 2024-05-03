package Arrays;

// IsUnique / Contains Duplicate - LeetCode 217

// Write a program to check if an array is unique or not.

// Example

//     int[] intArray = {1,2,3,4,5,6};
//     isUnique(intArray) // true

public class IsUnique {
    public static boolean isUnique(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] intArray = { 1, 2, 3, 4, 5, 6 };
        System.out.println(isUnique(intArray));
    }

}
