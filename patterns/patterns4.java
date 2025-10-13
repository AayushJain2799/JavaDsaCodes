public class patterns4 {
    public static void main(String[] args) {
        int n=5;
        char alpha = 'A';
        int count = 0;
        for(int row = 1; row<=n;row++)
        {
            for(int col=0; col<row;col++)
            {
                System.out.print((char)(alpha+count));
                count++;

            }
            System.out.println();
        }
    }
}
