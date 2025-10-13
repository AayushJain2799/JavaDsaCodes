import java.util.Scanner;

public class loops4 {
    public static void main(String[] args) {
        int i = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a num");
        int sum=0;
        int n = sc.nextInt();
        do{
            sum+=i;
            i++;
        }while(i<=n);
        System.out.println(sum);
    }
}
