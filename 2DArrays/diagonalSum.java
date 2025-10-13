public class diagonalSum {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int primarySum=0;
        int secondarySum=0;
        for(int i=0;i<matrix.length;i++)
        {
            primarySum+=matrix[i][i];
            secondarySum+=matrix[i][matrix.length-1];
        }
        int totalSum = primarySum+secondarySum;
        if(matrix.length%2!=0)
        {
            totalSum-=matrix[matrix.length/2][matrix.length/2];
        }
        System.out.println(totalSum);
    }
}
