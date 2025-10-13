public class selectionSort {
    public static void main(String[] args) {
        int arr[] ={3,2,4,6,5,9,1,8};
        int mini = Integer.MAX_VALUE;
        int index = -1;

        for(int i=0;i<arr.length;i++)
        {
            for(int j=i;j<arr.length;j++)
            {
                if(mini>arr[j])
                {
                mini = arr[j];
                index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;

            mini = Integer.MAX_VALUE;
            index = -1;

        }
        for(int i=0;i<arr.length;i++)
        System.out.print(arr[i]+" ");
    }
}
