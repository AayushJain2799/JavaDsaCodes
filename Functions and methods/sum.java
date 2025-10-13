import java.util.Scanner;

public class sum
{
    static void print(int sum) 
    {
        System.out.println(sum);
        
    }
    
    static int sum(int a, int b) //parameterized fn

    {
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println("Enter 1st no: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter 2nd no: ");
        int b = sc.nextInt();
        int sum = sum(a,b); 
        print(sum);

    }
}