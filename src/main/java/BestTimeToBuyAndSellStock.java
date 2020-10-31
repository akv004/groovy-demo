public class BestTimeToBuyAndSellStock {

    public static void main(String args[]) {
        int [] stock = {7,2,4,6,9};
        System.out.println(maxProfit(stock));
        System.out.println(maxProfitByOnePass(stock));
    }

    // brute force
    private static int maxProfit(int[] stock) {
        int maxProfit =0;
        for(int i=0; i<stock.length;i++){
            for(int j=i+1; j<stock.length;j++){
               int profit = stock[j]-stock[i];
               if(profit>maxProfit){
                   maxProfit = profit;
               }
            }
        }
        return maxProfit;
    }

    //one pass find valley

    private static int maxProfitByOnePass(int[] stocks){
        int minPrice = Integer.MAX_VALUE;
        int maxProfit =0;
        for(int i=0; i<stocks.length;i++){
            if(stocks[i]<minPrice){
                minPrice = stocks[i];
            }else{
                if(maxProfit<stocks[i]-minPrice){
                    maxProfit = stocks[i]-minPrice;
                }
            }
        }
        return maxProfit;
    }


}
