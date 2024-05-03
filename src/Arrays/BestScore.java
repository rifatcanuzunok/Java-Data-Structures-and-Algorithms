package Arrays;

// Best Score

// Given an array, write a function to get first, second best scores from the array and return it in new array.

// Array may contain duplicates.

// Example

//     myArray = {84,85,86,87,85,90,85,83,23,45,84,1,2,0}
//     firstSecond(myArray) // {90, 87}

public class BestScore {
    public static int[] firstSecond(int[] array) {
        int[] bestScore = { Integer.MIN_VALUE, Integer.MIN_VALUE };
        for (int score : array) {
            if (score > bestScore[0]) {
                bestScore[1] = bestScore[0];
                bestScore[0] = score;
            } else if (score > bestScore[1] && score < bestScore[0]) {
                bestScore[1] = score;
            }
        }
        return bestScore;
    }

    public static void main(String[] args) {
        int[] myArray = { 84, 85, 86, 87, 85, 90, 85, 83, 23, 45, 84, 1, 2, 0 };
        firstSecond(myArray);
    }
}
