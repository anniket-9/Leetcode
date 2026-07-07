class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

         //These are pointers
        int i=0;  
        int j=0;
        int id=0;

        int[] res= new int[m+n];
        
        //compare elements of both sorted array
        while(i<m && j<n){ 

         if(nums1[i]<=nums2[j]){
             res[id]=nums1[i];
             i++;
        }else{
            res[id]=nums2[j];
            j++;
        }
        id++;
        }

        //copy remaining elements elements of nums1
        while(i<m){
            res[id]=nums1[i];
            i++;
            id++;
        }

        //copy remaining elements of nums2
        while(j<n){
            res[id]=nums2[j];
            j++;
            id++;

        }
        for(int k=0; k<m+n;k++){
            nums1[k]=res[k];
        }
        
    }
}