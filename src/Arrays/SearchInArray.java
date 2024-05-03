package Arrays;

// Finding a Number in an Array

// Write a program to to check if an array contains a number in Java.

//     int[] intArray = {1,2,3,4,5,6};
//     searchInArray(intArray, 6); // 5

public class SearchInArray {
    public static int searchInArray(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] intArray = { 1, 2, 3, 4, 5, 6 };
        System.out.println(searchInArray(intArray, 6));
    }
}
