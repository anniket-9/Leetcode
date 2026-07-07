class Solution {
    public void moveZeroes(int[] nums) {

        int j = 0;   // Points to the position where the next non-zero element should be placed

        // Move all non-zero elements to the front
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

                j++;
            }
        }
    }
}