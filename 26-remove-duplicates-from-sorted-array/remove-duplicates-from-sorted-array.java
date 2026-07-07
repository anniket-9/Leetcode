class Solution {
    public int removeDuplicates(int[] nums) {

        int n=nums.length;
        int i=0;
        int j=1;

        while(j<n){
            if(nums[i]!=nums[j]) { // Got a unique element
            i++;
            nums[i]=nums[j];   // j is stored in i
            }
            j++;    // to find unique element again
            
    }
        return i+1;

    }  
        
    
}