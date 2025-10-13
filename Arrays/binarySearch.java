public class binarySearch {
    public static int BS(int[] arr, int value)
    {
        int start = 0;
        int end =arr.length-1;
       
        while(start<=end)
        {
            int mid = start+(end-start)/2;   
            if(value == arr[mid])
            return mid;
            else if(value<arr[mid])
            {
                end = mid-1;
            }
            else
            {
                start = mid+1;
            }
        }
        return -1;
    }
public static void main(String[] args) {
    int[] arr ={1,2,3,4,5,6,7,8};
    int value = 6;
    int index = BS(arr, value);
    System.out.println(index);
}
    
}
