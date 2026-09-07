class Solution {
    public int maxSubArray(int[] nums) {

        int sum=0;
        int maxi=Integer.MIN_VALUE;

        for(int i=0; i<nums.length;i++){
            //Sum create krte hai
            sum=sum+nums[i];  
            //maxi update krte hai
            maxi=Math.max(maxi,sum);
            //sum check krte hai for -ve value
            if(sum<0)
              sum=0;
        }
        return maxi; // return max value
        
    }
}