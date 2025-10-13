public class maxelement {
    public static int maxi(int[] arr)
    {
        // int max = Integer.MIN_VALUE;
        // for(int i=0;i<arr.length;i++)
        // {
        //     if(arr[i]>max)
        //     {
        //         max = arr[i];
        //     }
        // }
        // return max;

        int max = arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max = arr[i];
            }
        }
        return max;
        
    }
    public static void main(String[] args) {
        int[] arr = {1,3,2,8,7,5};
        int largest = maxi(arr); 
        System.out.println(largest);
    }
}
