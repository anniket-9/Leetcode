class Solution {
    public int waysToSplitArray(int[] nums) {
        
        long totalSum=0; //store totalSum

        for(int num:nums){
            totalSum+=num;
        }

        long leftSum=0; //initilizes
        int count=0;

        for(int i=0;i<nums.length-1;i++){
            leftSum+=nums[i]; //update leftSum
            long rightSum=totalSum-leftSum; //calculate rightSum

            if(leftSum>=rightSum){
                count++;
            }
        }
        return count;
    }
}