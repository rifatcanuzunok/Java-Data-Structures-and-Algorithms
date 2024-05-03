package Arrays;

import java.util.Arrays;

// Max Product of Two Integers

// How to find maximum product of two integers in the array where all elements are positive.

// Example

//     int[] intArray = {10,20,30,40,50};
//     maxProduct(intArray) // (40,50)

public class MaxProduct {
    public static int[] maxProduct(int[] array) {
        int[] maxProduct = { Integer.MIN_VALUE, Integer.MIN_VALUE };
        for (int num : array) {
            if (num > maxProduct[0]) {
                maxProduct[1] = maxProduct[0];
                maxProduct[0] = num;
            } else if (num > maxProduct[1] && num < maxProduct[0]) {
                maxProduct[1] = num;
            }
        }
        return maxProduct;
    }

    public static void main(String[] args) {
        int[] intArray = { 10, 20, 30, 40, 50 };
        System.out.println(Arrays.toString(maxProduct(intArray)));
    }
}
