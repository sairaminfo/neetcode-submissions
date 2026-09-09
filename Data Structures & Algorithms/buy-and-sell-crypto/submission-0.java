class Solution {
    public int maxProfit(int[] prices) {
        int minPrice=Integer.MAX_VALUE;
        int maxProfitValue=0;
        for(int price:prices){
            if(price<minPrice){
                minPrice=price;
            }else{
                maxProfitValue=Math.max(maxProfitValue,price-minPrice);
            }
        }
        //System.out.println("minPrice:"+" "+minPrice);
        return maxProfitValue;
    }
}
