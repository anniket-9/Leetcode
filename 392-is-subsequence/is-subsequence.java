class Solution {
    public boolean isSubsequence(String s, String t) {
        
        int i=0; // Initilise pointer for both strings
        int j=0;
        
        //both the string will iterate till end
        while(i<s.length() && j<t.length()){  
            if(s.charAt(i)== t.charAt(j)){ 
                      // if 1st character are same in both string then move both pointer
                i++;
                j++;
            }
            else{
                j++; //else only move 2nd pointer
            }
        }
        return (i==s.length());


    }
}