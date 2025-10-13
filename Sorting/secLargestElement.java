public class secLargestElement {
    public static void main(String[] args) {
        int[] arr ={2,13,4,1,6,28};
        int max1 = arr[0];
        int max2 = arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(max1<arr[i])
            max1 = arr[i];
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<max1 && max2<arr[i])
            {
                max2 = arr[i];
            }
        }
        System.out.println(max2);

    }
    
}
