public class prime {

    static boolean checkPrime(int n)
    {
        
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int n=12;
        for(int i=1;i<=n;i++)
        {
            if(i==1)
            {
                System.out.println(i + " is neither prime nor composite");
                continue;
            }
            else if(checkPrime(i)==true)
            {
                System.out.println(i +" is prime" );
            }
            else
            System.out.println(i+" is not prime");
        }
        //System.out.println(i +" is " +checkPrime(i));
    }
    }

