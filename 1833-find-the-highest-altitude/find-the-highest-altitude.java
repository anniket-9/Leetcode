class Solution {
    public int largestAltitude(int[] gain) {
        
        int max=0; //max altitude
        int current=0; //current altitude

        for(int i=0; i<gain.length;i++){
            current+=gain[i];  //update the altitude
            max=Math.max(current,max); //which one is maximum 
        }
        return max;
    }
}