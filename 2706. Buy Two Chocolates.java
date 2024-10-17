class Solution {
    public int buyChoco(int[] prices, int money) {
        int idx=prices.length,min=101;
        for(int i=0;i<prices.length;i++){
            min=Math.min(prices[i],min);
            if(prices[i]==min)      idx=i;
        }
        if(money<=min)      return money;
        int min2=101;
        for(int i=0;i<prices.length;i++){
            if(i!=idx){
                min2=Math.min(prices[i],min2);
            }
        }
        if(money>=min+min2)    money-=min+min2;
        return money;
    }
}
