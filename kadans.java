public class kadans{
    public static void Buyandsellstocks(int prices[]){
      int buyprice = Integer.MAX_VALUE;
      int maxprofit = 0;
      for(int i = 0; i < prices.length; i++){
        if(prices[i] >buyprice){
          int profit = prices[i] - buyprice;
          maxprofit = Math.max(maxprofit, profit);
        } else{
          buyprice = prices[i];

        }
        }
        return maxprofit;
      }
      public static void main(String[] args) {
          int prices[] = {2,4,6,8,10};
          System.out.println(Buyandsellstocks(prices));
      }

    }
    