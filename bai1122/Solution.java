package bai1122;

import java.util.Arrays;

public class Solution {

    public static int[] relativeSortArray(int[] arr1, int[] arr2) {

        
        int frequencyArr[] = new int[1001];
        int result[] = new int[arr1.length];

        for (int e : arr1) {
            frequencyArr[e]++;
        }
       
        int j = 0;

       
        for (int e : arr2) {
            while (frequencyArr[e] > 0) {
                result[j++] = e;
                frequencyArr[e]--;
            }
        }

      
        for (int i = 0; i < frequencyArr.length; i++) {
            while (frequencyArr[i] > 0) {
                result[j++] = i;
                frequencyArr[i]--;
            }

        }

   
        return result;

    }

    public static void main(String[] args) {
        int[] arr1 = { 2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19 };
        int[] arr2 = { 2, 1, 4, 3, 9, 6 };

        System.out.println(Arrays.toString(relativeSortArray(arr1, arr2)));

    }
}
