public class patterns17 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=9;j++)
            {
                if(j<=n-i)
                {
                    System.out.print(" ");
                }
                else if(j>n-i && j<=n-i+2*i-1 )
                {
                    System.out.print("*");
                }
            }  
            System.out.println();
        }
        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=9-2*i;k++ )
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
