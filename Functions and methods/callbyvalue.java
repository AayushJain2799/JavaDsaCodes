public class callbyvalue {

    static void swap(int a, int b)
    {
        int temp = a;
        a = b;
        b = temp;
       
    }
    public static void main(String[] args) {
        int a =5;
        int b =10;
        int temp;
        System.out.println("Before swap "+a+" "+b);
        swap(a,b);
        System.out.println("After swap "+a+" "+b);

    }
}
