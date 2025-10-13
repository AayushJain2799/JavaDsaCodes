public class pattern12 {
    public static void main(String[] args) {
       int n=6;
       for(int i=1; i<=n/2;i++)
       {
        for(int j=1;j<=i;j++)
        System.out.print("* ");
        System.out.println();
        }
        if(n%2==1)
        {
            for(int k=1; k<=n/2+1;k++)
            System.out.print("* ");
            System.out.println();
        }
        for(int l=1;l<=n/2;l++)
        {
            for(int m=1;m<=n/2+1-l;m++)
            System.out.print("* ");
            System.out.println();
        }
    }
}
