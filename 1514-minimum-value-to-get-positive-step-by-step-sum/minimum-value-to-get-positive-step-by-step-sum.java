class Solution {
    public int minStartValue(int[] nums) {
        
        int Sum=0;
        int minSum=0;

        for(int i=0;i<nums.length;i++){
            Sum+=nums[i];
            minSum=Math.min(minSum,Sum);
        }
        return 1-minSum;
        
    }
}