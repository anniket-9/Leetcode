class Solution {
    public int maxSubArray(int[] nums) {

        int sum=0;
        int maxi=Integer.MIN_VALUE;

        for(int i=0; i<nums.length;i++){

            sum=sum+nums[i];            //Sum create krte hai
            maxi=Math.max(maxi,sum);    //maxi update krte hai

            if(sum<0)                  //sum check krte hai for -ve value
              sum=0;
        }
        
        return maxi; // return max value
        
    }
}