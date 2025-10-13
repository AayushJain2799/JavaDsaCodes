
public class linearSearch {

    public static int ls(int[] arr, int value)
    {
        for(int i=0;i<=arr.length-1;i++)
        {
            if(arr[i]==value)
            return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,3,2,9,2,8};
        int value =2;
        int ans =ls(arr,value);
        System.out.println(ans);
    }
}
