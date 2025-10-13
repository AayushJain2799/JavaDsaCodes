public class loop7 {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        System.out.println("old val of a "+a);
        System.out.println("Old val of b "+b);
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println("New val of a "+a);
        System.out.println("New val of b "+b);
    }
    
}
