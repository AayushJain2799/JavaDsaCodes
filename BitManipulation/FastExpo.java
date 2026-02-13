public class FastExpo 
{
    public static void main(String[] args) 
    {
        int a=3;
        int p=5;
        int ans=1;
        while(p!=0)
        {
            if((p&1)==1)
            {
                ans = ans*a;
            }
            a=a*a;
            p=p>>1;
        }

        System.out.println(ans);
        
    }
    
}
