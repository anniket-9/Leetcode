class Solution {
    public String reverseVowels(String s) {

        char[] arr= s.toCharArray();

        int i=0;      // 2 pointers initilised
        int j=arr.length-1;

        while(i<j){ //the 2 pointers have not crossed each other

            //keep moving until you find a vowel from left.
            while(i<j && !isVowel(arr[i])){ 
                
                i++;
            }
            //find vowel from right
            while(i<j && !isVowel(arr[j])){
                j--;
            }
            
            //swap vowels
            char temp=arr[i]; 
            arr[i]=arr[j];
            arr[j]=temp;

            i++;
            j--;
        }

        return new String(arr);


    }
    private boolean isVowel(char ch){

        return ch=='a' || ch=='e' || ch=='i' ||
               ch=='o' || ch=='u' ||

               ch=='A' || ch=='E' || ch=='I' ||
               ch=='O' || ch=='U';
                     
               
       }
}