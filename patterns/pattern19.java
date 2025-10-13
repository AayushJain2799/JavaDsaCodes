public class pattern19 {
    public static void main(String[] args) {
        int n=5, count=0;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print("  ");
            }
            for(int k=1;k<=2*i-1;k++)
            {
                if(k<=i)
                System.out.print((k)+" ");
                else{
                    count++;
                    System.out.print((k-2*count)+" ");
                    
                }
            }
            count=0;
            System.out.println();
        }
    }
}