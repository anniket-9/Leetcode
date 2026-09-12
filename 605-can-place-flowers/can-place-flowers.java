class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        
        int count=0;
        for(int i=0; i<flowerbed.length;i++){
            if(flowerbed[i]==0){
                int prev=(i==0 || flowerbed[i-1]==0)?0:1; //if pos are empty or not
                //i-1 -> one pos before i
                int next=(i==flowerbed.length-1 || flowerbed[i+1]==0)?0:1; //one pos after i

                if(prev==0 && next==0){ //if there is no flower then plant a flower
                    flowerbed[i]=1;
                    count++;
                }
            }
            if(count>=n){
                return true;
            }
        }
        return false;
    }
}