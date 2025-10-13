import java.util.Scanner;

public class Conditional8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no: 1");
        int num1 = sc.nextInt();
        System.out.println("Enter no: 2");
        int num2 = sc.nextInt();
        System.out.println("Enter the operator");
        char ch = sc.next().charAt(0);
        switch (ch) {
            case '+': System.out.println(num1+num2);
            break;
            case '-': System.out.println(num1-num2);
            break;
            case '*': System.out.println(num1*num2);
            break;
            case '/': System.out.println(num1/num2);
            break;
            case '%': System.out.println(num1%num2);
            break;
                
                
        
            default: System.out.println("Please enter correct operator");
                break;
        }
    }
}
