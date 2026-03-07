public class Count {
    public static int noOf0(int num)
    {
        if(num<10)
        {
            if(num==0)
                return 1;
            else return 0;
        }
        if(num%10==0)
            return (1+noOf0(num/10));
        else
            return noOf0(num/10);
    }
    public static void main(String[] args) {
        int num=10406802;
        System.out.println(noOf0(num));
    }
}
