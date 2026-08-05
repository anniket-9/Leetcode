class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minLenWindow=Integer.MAX_VALUE; //stores minimum window length
        int currentSum=0; //stores the sum of current window

        int low=0; //2pointers of sliding window
        int high=0;
        
        //high will itterated through the whole array
        while(high<nums.length){  
           
           
           currentSum+=nums[high];
           high++;

           while(currentSum>=target){  //if sum>=target then shrink the window
            int currentWindowsize=high-low;

            minLenWindow=Math.min(minLenWindow,currentWindowsize);
            //update the min length 

            currentSum= currentSum-nums[low]; //use to remove the left element
            low++;

           }

        }
        return minLenWindow==Integer.MAX_VALUE ? 0 : minLenWindow;
        //If we didn't find any subarray then return 0 p+otherwise return minLenWindow
    }
}