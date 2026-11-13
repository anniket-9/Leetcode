class Solution {
    public void rotate(int[][] matrix) {
        
        int n=matrix.length;

        //Transpose of a matrix
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){

                int temp= matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }

        //Reverse of a matrix
        for(int i=0;i<n;i++){
            int left=0;
            int right=n-1;

            while(left<right){ //keep swapping elements until the left pointer reaches the right pointer.
               int temp=matrix[i][left];
               matrix[i][left]=matrix[i][right];
               matrix[i][right]=temp;

               left++;
               right--;
            }
            
        }
    }
}