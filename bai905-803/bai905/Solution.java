class Solution {
	public int[] sortArrayByParity(int[] nums) {
		int[] arr = new int[nums.length];
		int s = 0;
		int i = 0;
		int l = nums.length - 1;
		while (i < nums.length) {
			if (nums[i] % 2 == 0) {
				arr[s++] = nums[i];
			} else {
				arr[l--] = nums[i];
			}
			i++;
		}
		return arr;
	}
}