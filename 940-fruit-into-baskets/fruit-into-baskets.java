class Solution {
    public int totalFruit(int[] fruits) {
        //for finding unique fruits
        Map<Integer,Integer> basket=new HashMap<>();

        int left=0; //pointers initilised
        int maxFruits=0;

        for(int right=0;right<fruits.length;right++){
            //Add current fruit to basket
            int currentCount=basket.getOrDefault(fruits[right],0);
            basket.put(fruits[right],currentCount+1); //update the count
 
            //if basket has more than 2 type of fruits,
            //then start emptying the basket from left
            while(basket.size()>2){

                int fruitCount=basket.get(fruits[left]);

                if(fruitCount==1){
                    basket.remove(fruits[left]);
                }
                else{
                    basket.put(fruits[left],fruitCount-1);  
                }
                left++;
            }
            maxFruits=Math.max(maxFruits,right-left+1); //update the value of maxfruit

        }
        return maxFruits;

    }
}