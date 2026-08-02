class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);    //sort the array
        Set<List<Integer>> result=new HashSet<>();   //Using HashSet to remove the duplicates
        for(int i=0; i<nums.length-2;i++){       //fix first element and find other 2 element
           
            int left=i+1;       // 2 pointers used here
            int right=nums.length-1;

            while(left<right){     

              int sum=nums[i]+nums[left]+nums[right];   //calculate the sum

              if (sum==0){

                result.add(Arrays.asList(nums[i],nums[left],nums[right]));   //to store the result
            
            //Add the set and move to find the other triplet
                left++;     
                right--;

            }else if(sum<0){   //if sum is small then move the left pointer to right
              left++;

            }else{           //if sum is large then move the rigth pointer to left
            right--;
            }

        
    }
}

    return new ArrayList<>(result);  //return result
    
        
    }
}