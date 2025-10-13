public class fact {

    static int factorial(int n)
    {
        if(n<0)
        return -1;
        if(n==0)
        return 1;

        int ans =1;
        for(int i=n;i>=1;i--)
        {
            ans = ans*i;
        }
        return ans;
    }
    public static void main(String[] args) {
        int n=-5;
        int factorial = factorial(n);
        System.out.println(factorial);
    }
    
}
