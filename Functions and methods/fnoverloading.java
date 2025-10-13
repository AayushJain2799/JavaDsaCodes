public class fnoverloading {

    static void sum(int a,int b)
    {
        System.out.println("I am in fn 1");
        System.out.println(a+b);
    }
    static void sum(float c,float d)
    {
        System.out.println("I am in fn 2");
        System.out.println(a+b);
    }
    static void sum(int a,int b, int c)
    {
        System.out.println("I am in fn 3");
        System.out.println(a+b+c);
    }


    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        sum(a,5,8);
    }
}
