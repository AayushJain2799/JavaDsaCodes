public class maxSubarraySumPrefix {
    public static void main(String[] args) {
        int[] arr={2,-3,6,5,-9,4,-5};
        int sum = 0;
        int[] prefixSum = new int[arr.length];
        int idx = 0;

        int leftptr = 0;
        int rightptr = arr.length-1; 
        for(int i=0;i<arr.length;i++)
        {
            sum = sum+arr[i];
        }
        prefixSum[idx] = sum;
        idx++;


        while(leftptr!=rightptr)
        {
            if(arr[leftptr]< arr[rightptr])
            {
                sum = sum-arr[leftptr];
            leftptr++;
            prefixSum[idx] =sum;
            idx++;
            }
            else
            {
                sum = sum-arr[rightptr];
                rightptr--;
                prefixSum[idx] =sum;
                idx++;
            }

        }

        int max = Integer.MIN_VALUE;
        for(int i=0;i<prefixSum.length;i++)
        {
            if(prefixSum[i]>max)
            max = prefixSum[i];
        }
        System.out.println(max);
        

    }
}
