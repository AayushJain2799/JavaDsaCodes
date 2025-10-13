public class pattern10 {
    public static void main(String[] args) {
       int n=10, count = 1;
       for(int i=1; i<=n; i++)
       {
        for(int j=1;j<=i;j++)
        {
            System.out.print(count+" ");
            count++;
        }
        System.out.println();
       }
       
    }
}
