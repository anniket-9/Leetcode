class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        
      Map<Integer,Integer> map=new HashMap<>();
      map.put(0,-1); //starting the array 
      int prefixSum=0;//stores running sum

      for(int i=0; i<nums.length;i++){

        prefixSum +=nums[i]; //Add current element
        int rem=prefixSum % k; //to find the reminder 

        if(map.containsKey(rem)){ //check if remainder already exists
            if(i-map.get(rem)>=2){ //check subarray length
                return true;
            }
        }
        else{
            map.put(rem,i); //store remainder
        }

      }
      return false;


    }
}