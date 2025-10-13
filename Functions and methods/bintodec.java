public class bintodec {
    static int btod(int n)
    {   
        int ans = 0;
        int count=0;
        
        while(n!=0)
        {
            int lastdigit = n%10;
            n=n/10;
            ans = ans+ (int)Math.pow(2,count)*lastdigit;
            count++;
        }
        return ans;
    }
    public static void main(String[] args) {
        int n=1010;
        int ans = btod( n);
        System.out.println(ans);
    }
}