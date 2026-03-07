public class AllIndexes 
{
    public static int[] allIndexes(int[] arr, int val, int idx)
    {
        //Base case
        if(arr.length==idx)
        {
            int[] op = new int[0];
            return op;
        }
        //Small op
        int smallOp[] =allIndexes(arr, val, idx+1);
        if(arr[idx]==val)
        {
            int[] op = new int[smallOp.length+1];
            op[0] = idx;
            for(int i=0;i<smallOp.length;i++)
            {
                op[i+1]=smallOp[i];

            }
            return op;
        }
        else
        {
            return smallOp;
        }

    }
    public static void main(String[] args) {
        int[] arr = {5,5,4,3,5,5,7,5};
        int val=5;
        int op[] = allIndexes(arr, val, 0);
        for(int i=0;i<op.length;i++)
        {
            System.out.print(op[i]+" ");
        }

    }
}