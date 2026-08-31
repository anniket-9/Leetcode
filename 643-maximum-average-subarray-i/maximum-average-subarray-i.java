class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        int sum=0; //store the sum of the window  
        for(int i=0;i<k;i++){ //get sum from 1st window
            sum+=nums[i];
        }

        int maxSum=sum; //store the max sum of window

        int startIndex=0;  //start of SW
        int endIndex=k;

        while(endIndex<nums.length){ 
            sum-=nums[startIndex]; // Removing previous element
            startIndex++;

            sum+=nums[endIndex];  //Adding next element
            endIndex++;

            maxSum=Math.max(maxSum,sum); //to update the max Sum
        }
        return(double)maxSum/k; //to find the average

    }
}