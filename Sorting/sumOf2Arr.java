public class sumOf2Arr {
    public static void main(String[] args) 
    {
       int arr1[] = {5,6,2,4};
       int arr2[] = {5,7,5,6};
       int i = arr1.length-1;
       int j = arr2.length-1;
       int k = Math.max(i, j) +1;
       int[] arr3 = new int[k+1];
        int sum = 0;
        int mod =0;
        int carry = 0;
        while(i>=0 && j>=0)
        {
            sum = arr1[i]+arr2[j]+carry;
            mod = sum%10;
            carry = sum/10;
            arr3[k] = mod;
            i--;
            j--;
            k--;
        }
        while(i>=0)
        {
            sum = arr1[i]+carry;
            mod = sum%10;
            carry = sum/10;
            arr3[k] = mod;
            i--;
            k--;
        }
        while(j>=0)
        {
            sum = arr2[j]+carry;
            mod = sum%10;
            carry = sum/10;
            arr3[k] = mod;
            
            j--;
            k--;
        }
        arr3[k] = carry;
        for(i=0;i<arr3.length;i++)
        {
            System.out.print(arr3[i]+" ");
        }


    }
}

