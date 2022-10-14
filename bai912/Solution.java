package bai912;

import java.lang.reflect.Array;
import java.util.Arrays;

public  class Solution {
    public static int[] sortArray(int[] nums) {
        return mergeSort(nums);
    }

    public static  int[] mergeSort(int[] nums) {
        if (nums.length == 1)
            return nums;

        int middle = nums.length / 2;
        int[] left = Arrays.copyOfRange(nums, 0, middle);
        int[] right = Arrays.copyOfRange(nums, middle, nums.length);
        return merge(mergeSort(left), mergeSort(right));
    }

    public static int[] merge(int[] left, int[] right) {
        int leftIndex = 0;
        int rightIndex = 0;

        int[] result = new int[left.length + right.length];
        int resultIndex = 0;
        while (leftIndex < left.length && rightIndex < right.length) {
            if (left[leftIndex] < right[rightIndex]) {
                result[resultIndex] = left[leftIndex];
                leftIndex++;
            } else {
                result[resultIndex] = right[rightIndex];
                rightIndex++;
            }
            resultIndex++;
        }

        if (leftIndex < left.length) {
            for (int i = leftIndex; i < left.length; i++) {
                result[resultIndex] = left[i];
                resultIndex++;
            }
        }

        if (rightIndex < right.length) {
            for (int i = rightIndex; i < right.length; i++) {
                result[resultIndex] = right[i];
                resultIndex++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {4,2,1,5,3};
        int sortArr[] = sortArray(arr);
        System.out.println(Arrays.toString(sortArr));
    }
    
}
