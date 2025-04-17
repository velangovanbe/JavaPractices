package Demo;

import java.util.Arrays;

public class AlternateSorting {
    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 5, 6, 7};
        int[] result = alternateSort(input);
        System.out.println("Output: " + Arrays.toString(result));
    }

    private static int[] alternateSort(int[] arr) {
        if (arr == null || arr.length == 0) {
            return arr; // Handle null or empty array
        }

        // Step 1: Sort the array in ascending order
        Arrays.sort(arr);

        int[] result = new int[arr.length];
        int left = 0; // Pointer for the smallest element
        int right = arr.length - 1; // Pointer for the largest element
        int index = 0; // Index for the result array

        // Step 2: Alternate placement of largest and smallest elements
        while (left <= right) {
            if (index < arr.length) {
                result[index++] = arr[right--]; // Place the largest element
            }
            if (index < arr.length) {
                result[index++] = arr[left++]; // Place the smallest element
            }
        }

        return result;
    }
}