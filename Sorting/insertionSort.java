public class insertionSort {

    public static void printArr(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void insertion(int[] arr)
    {
        for(int j=1;j<arr.length;j++)
        {
            int i = j-1;
            int temp =arr[j];
            while(i>=0 && temp<arr[i])
            {
            arr[i+1] = arr[i];
            i--;
            }
            arr[i+1] = temp;
        }
        printArr(arr);
    }
    
    public static void main(String[] args) {
        int[] arr ={2,1,4,5,3,8,6,7};
        insertion(arr);
    }
}
        
