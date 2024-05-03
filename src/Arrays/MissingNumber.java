package Arrays;

// Missing Number

// Write Java function called findMissingNumberInArray that takes an integer array containing n-1 unique elements from a range of 1 to n, with one missing number, and returns the missing number.

// Example

//     myArray = {1,2,3,4,6}
//     findMissingNumberInArray(myArray, 6) // 5

public class MissingNumber {
    public static int findMissingNumberInArray(int[] array) {
        var sum = ((array.length + 1) * (array.length + 2)) / 2;
        var actualSum = 0;
        for (int num : array) {
            actualSum += num;
        }

        return sum - actualSum;
    }

    public static void main(String[] args) {
        int[] myArray = { 1, 2, 3, 4, 6 };
        System.out.println(findMissingNumberInArray(myArray));
    }
}
