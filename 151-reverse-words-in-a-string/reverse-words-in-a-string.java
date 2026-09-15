class Solution {
    public String reverseWords(String s) {
        
        StringBuilder ans=new StringBuilder();
        int i=s.length()-1;

        while(i >=0){
            //remove all the trailing spaces
            while(i>=0 && s.charAt(i)==' '){
                i--;
            }
            //check value i
            if(i<0){
                break;
            }
            int j=i;
            //find the start index of the word
            while(j>=0 && s.charAt(j) !=' '){
                j--;
            }
            //jaise hi space wale index pr aaya toh ruk jaaega 
            //ab iss word ko apne answer mei append kr do
            ans.append(s.substring(j+1, i+1));

            //remove faltu ke space where j is standing and add a space in ans

            while(j >=0 && s.charAt(j)== ' '){
                j--;
            }
            //j<0, iska matlab first word k upar tha main-> no space needed
            //j>=0, space needed
            if(j>=0){
                ans.append(' ');
            }
            i=j;
        }
        return ans.toString();    
    }
}