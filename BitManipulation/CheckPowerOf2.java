public class CheckPowerOf2 {
    public static void main(String[] args) {
        int num=512;
        int compare = num&(num-1);
        if(compare==0)
        {
            System.out.println("It is power of 2");
        }
        else{
            System.out.println("Not a power of 2");
        }
    }
}
