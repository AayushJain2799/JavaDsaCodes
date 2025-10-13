public class binCoeff {

    
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
        int n=5;
        int r = 3;
        int factorialn = factorial(n);
        int factorialr = factorial(r);
        int factorialnmr = factorial(n-r);
        int nCr = binCoeff(factorialn,factorialr,factorialnmr);
        System.out.println(nCr);
    }
    static int binCoeff(int n, int r, int nmr)
    {
        return n/(nmr*r);
    }
    
}


