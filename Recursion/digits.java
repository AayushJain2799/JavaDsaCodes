public class digits {
    public static int count(int n, int cnt)
    {
        
        if(n==0)
            return cnt;
        //cnt++;
        return count(n/10,cnt+1);
    }
    public static void main(String[] args) {
        int n=6757;
        System.out.println(count(n,0));
    }
}
