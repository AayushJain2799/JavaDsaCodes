import java.util.Scanner;

public class Conditional7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter no: b/w 1 and 3");
        int num = sc.nextInt();
        switch (num) {
            case 1: System.out.println("Tea");
                //break;
            case 2: System.out.println("Coffee");
                //break;
            case 3: System.out.println("sandwitch");
                //break;
            default: System.out.println("Please enter valid no:");
                break;
        }
    } 
}
