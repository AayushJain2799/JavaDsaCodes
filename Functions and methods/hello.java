import java.util.*;

public class hello {
    static void hello(String name )
    {
        System.out.println("Hello "+name);
    }
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Please give ur name ");
    String s = sc.next();
    hello(s);
   }
}
