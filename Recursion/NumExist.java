public class NumExist {
    public static boolean numExists(int[] arr, int value)
    {
        if(arr.length==0)
            return false;
        int[] smallArr = new int[arr.length -1];
        for(int i=1;i<arr.length;i++)
        {
            smallArr[i-1] = arr[i];
        }
        if(arr[0] == value)
        return true;
        return numExists(smallArr, value);
    }
    public static void main(String[] args) {
        int[] arr ={4,2,3,7,5};
        int value = 4;
        System.out.println(numExists(arr,value));
    }
}
