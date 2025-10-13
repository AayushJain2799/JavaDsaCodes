public class uniqueElement {
    public static int unique(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            int j ;
            for( j=0;j<arr.length;j++)
            {

                if(arr[i] == arr[j] && i!=j )
                break;
            }
            if(j==arr.length)
            return arr[i]; 
        }
        return -1;
    }
   
    public static void main(String[] args) {
        int arr[] ={1,3,1,3,6,6,7,10,7};
        System.out.println(unique(arr));
     }
}
