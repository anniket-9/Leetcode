class Solution {
    public boolean isPalindrome(String s) {
        //2 pointer initilised
        int left=0;
        int right=s.length()-1;

        while(left<right){

            //remove the unwanted character of left side
            while(left<right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            //remove the unwanted character of right side
            while(left<right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }
            //to compare the characters
            if(Character.toLowerCase(s.charAt(left))!=Character.toLowerCase(s.charAt(right))){
                return false;
            }
           
           left++;
           right--;
        }

        return true;   
    }
}