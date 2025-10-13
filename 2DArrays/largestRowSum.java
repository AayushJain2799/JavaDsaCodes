
public class largestRowSum {
    public static int rowSum(int[][] arr)
    {
        int rowSum=0;
        int colSum = 0;
        int maxRowSum = 0;
        int maxColSum = 0;

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                rowSum = rowSum+arr[i][j];

            }
            maxRowSum = Math.max(maxRowSum, rowSum);
            rowSum=0;
        }
        return maxRowSum;
    }
    public static int largestColSum(int[][] arr)
    {
        int rowSum=0;
        int colSum = 0;
        int maxRowSum = 0;
        int maxColSum = 0;

        for(int i=0;i<arr[0].length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                colSum = colSum+arr[j][i];

            }
            maxColSum = Math.max(maxColSum, colSum);
            colSum=0;
        }
        return maxColSum;
    }
    public static void main(String[] args) {
        
        int[][] arr = {{1,5,8,6},{2,7,3,5},{4,1,3,6}}; 
        System.out.println("Max row sum is "+rowSum(arr));
        System.out.println("Max col sum "+largestColSum(arr));
        
    }
}
