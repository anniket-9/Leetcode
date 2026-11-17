class Solution {
    public int diagonalSum(int[][] mat) {
        
        int Sum=0;
        int n=mat.length;

        for(int i=0; i<mat.length;i++){ //get the sum of both diagonals
            Sum+=mat[i][i];
            Sum+=mat[i][n-i-1];
        }
        if(n%2!=0){  //if matrix is odd then subtract the duplicate element
            Sum-=mat[n/2][n/2];
        }
        return Sum;
    }
}