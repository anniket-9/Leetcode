class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0;  // use to keep track of max no os 1's
        int count=0;  // use to keep track of current count
        
        for(int i=0;i<nums.length;i++){        // Itetrate through all the elements
            if(nums[i]==1){          // and keep a track of the maximum 1's.
                count++;
                max=Math.max(max,count);
            }else{
                count=0;
            }
        }
        return max;
        
    }
}