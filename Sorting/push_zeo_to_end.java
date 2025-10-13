public class push_zeo_to_end {
    public static void main(String[] args) {
        int[] arr = {2,0,0,1,3,0,0};
        int[] arr2 = new int[arr.length];
        int idx = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                arr2[idx] = arr[i];
                idx++;
            }
        }
        for(int i=0;i<arr2.length;i++)
        {
            System.out.print(arr2[i]+" ");
        }
    }    
}
