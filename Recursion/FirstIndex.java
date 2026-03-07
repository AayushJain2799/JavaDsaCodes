public class FirstIndex {

    public static int search(int[] arr, int val, int idx)
    {
        //base case
        if(idx==arr.length)
            return -1;
        if(arr[idx]==val)
            return idx;
        return search(arr,val,idx+1);
        
    }
    public static void main(String[] args) {
        int arr[] = {2,3,4,3,3};
        int value = 3;
        System.out.println(search(arr,value,0) );

    }
}
