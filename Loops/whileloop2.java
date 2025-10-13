import java.util.Scanner;

public class whileloop2 {
    public static void main(String[] args) {
    //     int i =1;
    // while(i<=10)
    // {
    //     System.out.println(i);
    //     i++;
    // }

    int i=1;
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter a num");
    int n = sc.nextInt();
    while(i<=n)
    {
        System.out.println(i);
        i++;
    }
    }
    
}
