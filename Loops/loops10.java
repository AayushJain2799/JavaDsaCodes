public class loops10 {
    public static void main(String[] args) {
       int num =12;
       int count = 0;
       for(int i=2;i*i<num;i++)
       {
        if(num%i==0)
        {
            count++;
            System.out.println("Not prime");
            break;
        }
        continue;
       }
       if(count==0)
       System.out.println("prime");

    }
    
}
