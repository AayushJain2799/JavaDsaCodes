public class Sorting {

    public static boolean sorted(int[] arr)
    {
        if(arr.length <= 1)
        {
            return true;
        }
        int[] smallArr = new int[arr.length -1];
        for(int i=1;i<arr.length;i++)
        {
            smallArr[i-1] = arr[i];
        }
        if(arr[0]>smallArr[0])
            return false;
        return sorted(smallArr);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,4};
        System.out.println(sorted(arr));
    }
}
