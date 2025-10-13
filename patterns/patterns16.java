public class patterns16 
{
   public static void main(String[] args) {
   {
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
   }
}}
