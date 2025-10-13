
import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a string");
        String s = sc.nextLine();
        int i=0;
        int j = s.length()-1;
        boolean b=true;
        while(i<j)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                System.out.println("Not a palindrome");
                b=false;
                break;
            }
            i++;j--; 
        }
        if(b==true)
        System.out.println("It is a palindrome");

    }
}
