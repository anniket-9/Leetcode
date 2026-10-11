class Solution {
    public int minStartValue(int[] nums) {
        
        int Sum=0; //initilises running sum
        int minSum=0; //initilises prefixsum

        for(int i=0;i<nums.length;i++){
            Sum+=nums[i]; //calculate prefix sum
            minSum=Math.min(minSum,Sum);
        }
        return 1-minSum; //to calculate the starting value
        
    }
}