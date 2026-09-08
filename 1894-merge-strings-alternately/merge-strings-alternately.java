class Solution {
    public String mergeAlternately(String word1, String word2) {

        StringBuilder sb= new StringBuilder(); // to store the result

        int i=0;     // for word1
        int j=0;    // for word2
        boolean flag=true;

        while(i< word1.length() && j< word2.length()){   
            if(flag){
                sb.append(word1.charAt(i));
                i++;
            }
            else{
                sb.append(word2.charAt(j));
                j++;
            }
            flag=!flag;
        }

        while(i< word1.length()){
            sb.append(word1.charAt(i));
                i++;
        }

        while(j< word2.length()){
            sb.append(word2.charAt(j));
            j++;
        }

        return sb.toString();


    }
}