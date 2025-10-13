public class loop6 {
    public static void main(String[] args) {
        int n =1234; //123 12 1
        int newnum=0;
        for(int i=0;n>0;i++)
        {

             newnum = newnum*10+ n%10;
             n=n/10;
        }
        System.out.println(newnum);
    }
    
}
