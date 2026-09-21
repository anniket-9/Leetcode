class Solution {
    public boolean increasingTriplet(int[] nums) {
        
        int n=nums.length;
        
        //to store values
        int num1=Integer.MAX_VALUE;  
        int num2= Integer.MAX_VALUE;

        for(int i=0; i<n; i++){
            int num3 = nums[i]; 

            if(num3 <=num1){  //num1 se poocho
                num1= num3;
            }
            else if(num3 <= num2){ //ask num2
                num2=num3;
            }
            else{    //   num1<num2 already set hai
                return true;
            }
        }
        return false;
    }
}