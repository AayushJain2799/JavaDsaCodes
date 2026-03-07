public class NumExist2 {
    public static boolean numExists(int[] arr, int value, int idx)
    {
        if(idx == arr.length)
            return false;
        if(arr[idx]==value)
            return true;
        return numExists(arr, value, idx+1);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,6,5};
        int val = 4;
        System.out.println(numExists(arr,val,0));

    }
}
