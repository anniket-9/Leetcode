class Solution {
    public int threeSumClosest(int[] nums, int target) {
        
        Arrays.sort(nums);

        int resultSum=nums[0]+nums[1]+nums[2];
        //to track the sum of triplet array
        int minDifference=Integer.MAX_VALUE;
        //track how close we are from target value

        for(int i=0;i<nums.length-2;i++){
            //2 pointers assigned
            int left=i+1;
            int right=nums.length-1;

            while(left<right){ 
                int sum=nums[i]+nums[left]+nums[right];

                if(sum==target)
                   return target;
                if(sum<target)
                   left++;
                else
                   right--;

            int diffToTarget=Math.abs(sum-target);
            //used to make the diff always +ve
            
            if(diffToTarget<minDifference){

                resultSum=sum;
                minDifference=diffToTarget;
            }       
            }

        }
        return resultSum;
    }
}