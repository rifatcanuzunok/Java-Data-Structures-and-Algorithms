package Arrays;

// Middle Function

// Write a function called middle that takes an array and returns a new array that contains all but the first and last elements.

//     myArray = [1, 2, 3, 4]
//     middle(myArray)  # [2,3]. 

public class MiddleFunction {
    public static int[] middle(int[] intArray) {
        if (intArray.length <= 2)
            return new int[0];
        int[] returnArray = new int[(intArray.length - 2)];
        for (int i = 0; i < intArray.length; i++) {
            if (i == 0 || i == intArray.length - 1) {
                continue;
            }
            returnArray[i - 1] = intArray[i];
        }
        return returnArray;
    }

    public static void main(String[] args) throws Exception {
        var arr = new int[] { 1, 2, 3, 4, 5 };
        middle(arr);
    }
}
