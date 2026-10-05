class Solution {
    public int[] runningSum(int[] nums) {

        //using this sc increases
        //int []ps=new int[nums.length]; empty array
        //ps[0]=nums[0]; //1st element of ps= array ka 1st element

        for(int i=1; i<nums.length;i++){
            nums[i]=nums[i-1]+nums[i];  //the i-1 th element + current element of nums 

        }
        return nums;
        
    }
}