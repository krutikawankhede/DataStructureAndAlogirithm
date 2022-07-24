package Arrays;

public class MaxSumSubArrayKadanesAlgo {

    public int findMaxSum(int arr[])
    {
        int maxSum = Integer.MIN_VALUE;
        int curSum = 0;
        for(int i=0;i<arr.length;i++)
        {
            curSum = curSum+arr[i];
            if(curSum>maxSum)
            {
                maxSum  = curSum;
            }
            if(curSum<0)
            {
                curSum=0;
            }
        }
        return maxSum;
    }
}
