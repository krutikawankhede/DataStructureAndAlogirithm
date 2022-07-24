import Arrays.MajorityElement;
import Arrays.MaxSumSubArrayKadanesAlgo;
import Arrays.QuickFind;
import Arrays.StockBuyAndSell;

public class MainClass {

    public static void main(String args[]){
        /*QuickFind quickFind = new QuickFind(10);
        quickFind.union(9,3);
        quickFind.quickFind(9,3);*/

//        MajorityElement majorityElement = new MajorityElement();
//        int arr[] = new int[]{1,4,4,4,6,7};
//        System.out.println(majorityElement.majorityElement(arr));

//        MaxSumSubArrayKadanesAlgo maxSum = new MaxSumSubArrayKadanesAlgo();
//        int arr[] = new int[]{1,-6,5,4,-1,6,-14,15};
//        System.out.println(maxSum.findMaxSum(arr));

        StockBuyAndSell stock = new StockBuyAndSell();
        int arr[] = new int[]{3,1,4,8,7,};
        stock.maxProfit(arr);
    }
}
