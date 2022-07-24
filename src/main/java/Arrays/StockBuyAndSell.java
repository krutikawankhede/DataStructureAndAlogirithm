package Arrays;

public class StockBuyAndSell {

    public int maxProfit(int arr[])
    {
        int maxProfit=0;
        int minPrice = arr[0];

        for(int i=0; i< arr.length;i++)
        {
           minPrice = Math.min(minPrice, arr[i]);
           int profit = arr[i] - minPrice;
           maxProfit = Math.max(maxProfit,profit);
        }

        return maxProfit;
    }
}
