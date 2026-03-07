public class sumOfArr2 
{
    public static int sum(int[]arr,int idx)
    {
        //base case
        if(idx==arr.length)
            return 0;
        return arr[idx]+ sum(arr,idx+1);

    }
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5};
        System.out.println(sum(arr,0));
    }
}
