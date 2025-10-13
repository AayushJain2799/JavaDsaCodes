public class dectobin {

    static int dtob(int n)
    {
        int ans = 0;
        while(n!=0)
        {
            int mod2 = n%2;
            n=n/2;
            ans = ans*10+mod2;
            
        }
        return reverse(ans);
    }
    static int reverse(int n )
    {
        int ans=0;
        while(n!=0)
        {
        int mod10 = n%10;
        n=n/10;
        ans = ans*10 +mod10;
        }
        return ans;

    }
    public static void main(String[] args) {
        int n=11;
        int decitobin = dtob( n);
        System.out.println(decitobin);
    }
}