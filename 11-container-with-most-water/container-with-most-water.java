class Solution {
    public int maxArea(int[] height) {

        //this will help to find the area of container
        int left=0;
        int right=height.length-1;
        int maxArea=0; //keep track of maximum area

        while(left<right){
            //find min value of 2 heights*width
            int area=Math.min(height[left], height[right])*(right-left);

            maxArea=Math.max(area,maxArea);

            if(height[left]< height[right]){ //if left stick is smaller then left++ else right--
                left++;
            }
            else{
                right--;
            }
        }
        return maxArea;
    }
}