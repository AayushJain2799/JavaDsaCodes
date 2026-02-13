public class Methods {

    public static int get(int num, int i)
    {
        int mask = 1<<i;
        int val = num&mask;
        if(val==0)
            return 0;
        else
            return 1;
    }

    public static int set(int num, int i)
    {
        int mask = 1<<i;
        int val = num|mask;
        if(val==0)
            return 0;
        else
            return val;
    }
    public static int clear(int num, int i)
    {
        int mask = ~(1<<i);
        int val = num&mask;
        return val;
    }

    public static int update(int num, int i, int val)
    {
        if(val==0)
        {
            return clear(num,i);
        }
        else
        {
            return set(num,i);
        }
    }
    public static int clearLastIBits(int num, int i)
    {
        int mask = (-1)<<i;
        int ans = num &mask;
        return ans;

    }
    public static int clearInARange(int num, int i, int j)
    {
        int mask1 = (~0)<<(j+1);
        int mask2 = (1<<i)-1;
        int mask = mask1|mask2;
        int ans = mask&num;
        return ans;
    }
    

  

    
    public static void main(String[] args) 
    {
        System.out.println(get(46,0));
        System.out.println(set(10,2));
        System.out.println(clear(21,2));
        System.out.println(update(21,2,1));
        System.out.println(clearLastIBits(31,2));
        System.out.println(clearInARange(31,1,3));
        
    }
}
