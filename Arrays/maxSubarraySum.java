public class maxSubarraySum {
    public static void main(String[] args) {
        int[] arr ={2,-3,6,5,-5,4,-5};
        int sum =0;
        int maxSum=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i;j<arr.length;j++)
            {
                for(int k=i;k<=j;k++)
                {
                    System.out.print(arr[k]+" ");
                    sum = sum+arr[k];
                    
                }
                
                System.out.println("sum = "+sum);
                maxSum = Math.max(sum,maxSum);
                System.out.println("Max Sum is "+maxSum); 
                sum=0; 
                System.out.println();
            }
            System.out.println();

        }
        System.out.println("Final ans is "+maxSum);
    }
}
