class Solution {
    public void sortColors(int[] nums) {
        
        //3pointers assign
        int start=0;
        int mid=0;
        int end=nums.length-1;

        while(mid<=end){
            switch(nums[mid]){

                case 0:  //swap the element at start pointer
                swap(nums,start,mid);
                mid++;
                start++;
                break;

                case 1: //no swapping middle++
                mid++;
                break;

                case 2:  //swap with the end pointer
                swap(nums,mid,end);
                end--;
                break;

            }
        }
    }
    private void swap(int[] arr, int pos1, int pos2){
            int temp=arr[pos1];
            arr[pos1]=arr[pos2];
            arr[pos2]=temp;

    }

}