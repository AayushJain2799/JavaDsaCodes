import java.util.Scanner;

public class table {
    static int table(int n)
        {
            for(int i=1;i<=10;i++)
            {
                System.out.println(n+" * "+i+" = "+n*i);
            }
            return 0;
        }
    public static void main(String[] args) {
        System.out.println("Please enter a no: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        table(num);
        table(num+1);
        table(num+2);

    }
    
}
