class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        Set<Character> charSet=new HashSet<>(); //hashset initilises

        int maxLength=0; //2pointer used
        int left=0;

        for(int right=0;right<s.length();right++){
            //this will keep on running until it get a particular character
            while(charSet.contains(s.charAt(right))){
                charSet.remove(s.charAt(left)); 
                //remove the left character
                left++;
            }
            charSet.add(s.charAt(right));
            maxLength=Math.max(maxLength,right-left+1);  //length of window
        }
        return maxLength;
        
    }
}