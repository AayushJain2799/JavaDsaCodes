public class reverse {
    public static void reversearr(int[] arr)
    {
        int start = 0;
        int end = arr.length-1;
        while(start<end)
        {
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        printArr(arr);

    }
    public static void printArr(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        System.out.print(arr[i]+" ");
    }

    public static void main(String[] args) {
        int arr[] ={1,3,8,4,5,7,6};
        reversearr(arr);
    }
}
