package Arrays;

// Duplicate Number

// Write a function which takes integer array as a parameter and returns a new integer array with unique elements. (remove duplicates)

// Example

//     removeDuplicates({1, 1, 2, 2, 3, 4, 5})
//     Output : [1, 2, 3, 4, 5]

import java.util.Arrays;

public class DuplicateNumber {

    public static int[] removeDuplicates(int[] array) {
        var deduplicatedArray = new int[array.length];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            boolean isDuplicate = false;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                deduplicatedArray[index++] = array[i];
            }
        }

        return Arrays.copyOf(deduplicatedArray, index);
    }

    public static void main(String[] args) {
        int[] myArray = { 1, 1, 2, 2, 3, 4, 5 };
        int[] deduplicatedArray = removeDuplicates(myArray);
        System.out.println(deduplicatedArray);
    }

}
