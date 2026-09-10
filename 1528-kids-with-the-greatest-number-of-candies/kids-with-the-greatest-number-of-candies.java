class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        int max=-1;
        for(int i:candies){  // this find the maximum candies in the array
            if(i>max){
                max=i;
            }
        }

        List<Boolean> res=new ArrayList();  // To store the res
        for(int i:candies){
            if(i+extraCandies >= max){  //Agar candies jyada ho gai toh return true
                res.add(true);
            }
            else{
                res.add(false);  
            }
        }
        return res;

    }
}