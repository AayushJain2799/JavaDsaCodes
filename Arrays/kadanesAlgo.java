public class kadanesAlgo {
    public static void main(String[] args) {
        int[] arr={2,-3,6,5,-9,4,-5};
        int sum =0;
        int maxSum = 0;
        for(int i=0;i<arr.length;i++)
        {
            sum = sum+arr[i];
            if(sum<0)
            sum=0;
            
            
                
                maxSum = Math.max(sum, maxSum);

            
        }
        System.out.println(maxSum); 

    }
}
