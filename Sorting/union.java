


public class union {
    public static void main(String[] args) {
        int[] arr1 = {1,3,5,7,8,9};
        int[] arr2 = {2,4,6};
        int len = arr1.length+arr2.length;
        int[] union = new int[len];
        int i=0; int j=0; int k=0;
        while(i!=arr1.length && j!=arr2.length)
        {
            if(arr1[i]<arr2[j])
            {
                union[k] = arr1[i];
                i++;
                k++; 
            }
            else{
                union[k] =arr2[j];
                j++;
                k++;
            }
        }

        while(i!=arr1.length)
        {
                union[k] = arr1[i];
                i++;
                k++; 
            
        }

        while(j!=arr2.length)
        {
            union[k] =arr2[j];
                j++;
                k++;
        }
        for( i=0;i<union.length;i++) 
        {
        System.out.print(union[i]+" ");
        }
     }
}
