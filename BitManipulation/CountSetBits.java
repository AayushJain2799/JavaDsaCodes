public class CountSetBits {
    public static void main(String[] args) {
        int count =0;
        int num = 868567;
        int temp = num;
        
        while(temp!=0)
        {
            if((temp&1)==1)
            {
                count++;
            }
            temp=temp>>1;
        }
        System.out.println(count);
    }
}
