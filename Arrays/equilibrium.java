public class equilibrium {
    public static void main(String[] args) {
        int arr[] = {1,3,2,4,5,6,4};
        int idx;
        if(arr.length>1)
        idx=1;
        else
        idx=0;

        int LS=Integer.MIN_VALUE;
        int RS = Integer.MAX_VALUE;

        while(LS!=RS)
        {
            LS=0;
            RS=0;
            for(int i = 0;i<idx;i++)
            {
                LS+=arr[i];
            }
            for(int j=arr.length-1;j>idx;j--)
            {
                RS+=arr[j];
            }
            if(LS==RS)
            {
                System.out.println(idx);
                break;
            }
            idx++; 
        }

    }
}
