class Solution {
    public int[] sortedSquares(int[] nums) {

        int[]result=new int[nums.length];

        // Squaring all elements
        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]*nums[i];
        }

        // Two pointers are initialised
        int head=0;
        int tail=nums.length-1;
        
        // Filling array from last element to first element
        for(int pos=nums.length-1;pos>=0;pos--){
            if(nums[head]>nums[tail]){
                result[pos]=nums[head];
                head++;
                
            }else{
                result[pos]=nums[tail];
                tail--;
            
            }
        }
        return result;

    }
}