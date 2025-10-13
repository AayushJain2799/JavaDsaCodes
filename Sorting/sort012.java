
import java.util.Arrays;


public class sort012 {
    public static void main(String[] args) {
        int arr[] ={0,1,2,0,2,0,1 };
        int arr2[] =new int[arr.length];
        Arrays.fill(arr2,1);
        // for(int i=0;i<arr2.length;i++)
        // System.out.print(arr2[i]+" ");
        int zero = 0;
        int two = arr.length-1;
        for(int i=0;i<arr2.length;i++)
        {
            if(arr[i]==0)
            {
                arr2[zero] = 0;
                zero++;
            
            }
            else if(arr[i]==2)
            {
                arr2[two] = 2;
                two--;
            }
        } 
        for(int i=0;i<arr2.length;i++)
        System.out.print(arr2[i]+" ");
    }
}
