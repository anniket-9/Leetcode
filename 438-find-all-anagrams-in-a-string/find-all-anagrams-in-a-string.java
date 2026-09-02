class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int[] pCount= new int[26]; //frequency of character in p
        int[] sCount=new int[26]; // frequency of character in s 

        List<Integer> result=new java.util.ArrayList<>(); //stores the indices of anagrams

        for(char c: p.toCharArray()){ //count characters of p
           pCount[c-'a']++;
        }

        for(int i=0;i<s.length();i++){ //Sliding Window
            sCount[s.charAt(i)-'a']++; //Add character from right

            if(i>=p.length()){  //Remove character from left
                sCount[s.charAt(i-p.length())-'a']--; 
            }
            if(Arrays.equals(pCount,sCount)){ 
                result.add(i-p.length()+1); //This gives starting index
            }
        }
        return result;
        
    }
}