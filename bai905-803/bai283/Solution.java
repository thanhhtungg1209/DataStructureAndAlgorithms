
public class Solution {

    public void moveZeroes1(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == 0) {
                    if (nums[i] != nums[j]) {

                        int temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;
                    }
                }
            }
        }
    }
}
