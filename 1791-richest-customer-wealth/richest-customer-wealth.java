class Solution {
    public int maximumWealth(int[][] accounts) {
        int result=0;
        for(int i=0;i<accounts.length;i++){     
            
            int sum=0;                           
            // it gives every customer a fresh start 

            for(int j=0;j<accounts[i].length;j++){ 
             // this loop is for bank account of every customer

                sum+=accounts[i][j];
            }
            result=Math.max(result,sum);
        }
        return result;

    }
}