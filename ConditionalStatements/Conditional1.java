

import java.util.Scanner;

public class Conditional1 {
    public static void main(String[] args) {
        //Comparision of 2 nos
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st no: ");
        int a =sc.nextInt();
        System.out.println("Enter 2nd no: ");
        int b = sc.nextInt();
        
        if(a>b)
        {
            System.out.println("a>b " + a);
        }
        else
        {
            System.out.println("b>a " + b);
        }
    }
}
