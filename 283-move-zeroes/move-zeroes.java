class Solution {
    public void moveZeroes(int[] nums) {
        int insertPosition=0; //starting with 1st pos

        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){ //fill all non zero elements
                nums[insertPosition]=nums[i];
                insertPosition++;
            }
        }
        while(insertPosition<nums.length){  // fill all remaining zeroes
            nums[insertPosition++]=0;
        }

    }
}