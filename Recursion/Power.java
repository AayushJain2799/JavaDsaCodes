public class Power {
    public static int pow(int n, int p)
    {
        if(p==0)
            return 1;
        return n*pow(n,p-1);
    }
    public static void main(String[] args) {
        int n=5;
        int p=2;
        System.out.println(pow(n,p));

    }
}
