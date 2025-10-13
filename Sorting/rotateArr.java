public class rotateArr {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int index = 2;
        int arr2[] = new int[arr.length];
        int ptr = 0;
        for(int i=index; i<arr.length; i++)
        {
            arr2[ptr] = arr[i];
            ptr++;
        }
        for(int i=0;i<index;i++)
        {
            arr2[ptr] = arr[i];
            ptr++;
        }
        for(int i=0;i<arr2.length;i++)
        System.out.print(arr2[i]+" ");
    }
}
