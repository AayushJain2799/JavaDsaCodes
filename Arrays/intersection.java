public class intersection {
    public static void main(String[] args) {
        int arr1[]={2,6,8,5,4,3};
        int arr2[]={2,3,4,7};
        int[] arr3 = new int[Math.min(arr1.length,arr2.length)];
        int k=0;
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr2.length;j++)
            {
                if(arr1[i]==arr2[j])
                {
                    arr3[k]=arr1[i];
                    k++;
                    arr2[j]=-1;
                    break;
                }
            }
        }
        for(int i=0;i<k;i++)
        System.out.print(arr3[i]+" ");
    }
}
