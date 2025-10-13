public class maxprofit {
    public static void main(String[] args) {
        int arr[] = {3,2,4,1,2,1,3};
        int buy = Integer.MAX_VALUE;
        int sell = Integer.MIN_VALUE;
        int profit =0;
        int maxProfit =0;
        for(int i = 0;i<arr.length;i++)
        {
            buy = arr[i];
            for(int j=i+1;j<arr.length;j++)
            {
                sell = arr[j];
                profit = sell-buy;
                maxProfit = Math.max(profit,maxProfit);


            }

        }
        System.out.println(maxProfit); 
    }
}
