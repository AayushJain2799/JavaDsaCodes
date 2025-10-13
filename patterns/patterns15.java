public class patterns15 {
    public static void main(String[] args) {
        int n=4;
        for(int i=1;i<=n;i++)
        {
            int j;
            for( j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=n;k++)
            {   if(i==1 || i==n || k==1 ||k ==n)
                System.out.print("*");
                else
                System.out.print(" ");
                
            }
            System.out.println();
        }
            
        }
    }

