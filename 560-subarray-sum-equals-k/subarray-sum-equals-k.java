class Solution {
    public int subarraySum(int[] nums, int k) {
        
        //to check how many times sum apperead
        HashMap<Integer,Integer> mp=new HashMap<>(); 

        int result=0; //to store no of subarray whose sum is k
        int cumSum=0; //cumulative sum

        mp.put(0,1); //empty prefix sum before array start

        for(int i=0; i<nums.length; i++){
            cumSum=cumSum+nums[i];  //add current element to cumSum
            if(mp.containsKey(cumSum-k)){
                result+=mp.get(cumSum-k); //if that prefix sum exists
            }
            mp.put(cumSum, mp.getOrDefault(cumSum,0)+1); //to store the current prefixsum
        }
        return result;
    }
}