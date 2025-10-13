public class intro {
    public static void main(String[] args) {
        int[][] arr2D = new int[5][5];
        arr2D[2][3] = 5;
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                System.out.print(arr2D[i][j]+" ");
            }
            System.out.println();
        }
    }    
}
