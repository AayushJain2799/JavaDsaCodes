public class trappingRainwater {
    public static void main(String[] args) {
        int arr[]  = {0, 1, 0, 2, 1, 0, 1,  3, 2, 1, 2, 1};
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int n = arr.length;
        int max = Integer.MIN_VALUE;
       //1 Create left max array
       int arrL[] = new int[n];
       for(int i=0;i<n;i++)
       {
        if(max<arr[i])
            max = arr[i];
            arrL[i] = max;
            System.out.print(arrL[i]+" ");
        

       }
       System.out.println();
       //2. Create right max array
       max = Integer.MIN_VALUE;
       int arrR[] = new int[n];
       for(int i=n-1;i>=0;i--)
       {
        if(max<arr[i])
        max = arr[i];
        arrR[i] = max;
      

       }
       for(int i=0;i<n;i++)
       System.out.print(arrR[i]+" ");
       System.out.println();
       //3. create min array
       int[] minArr = new int[n];
       for(int i=0;i<n;i++)
       {
        minArr[i] =Math.min(arrL[i],arrR[i]);
        System.out.print(minArr[i]+" ");
       }
       System.out.println();
       //4. min arr - original array
       int ansArr[] = new int[n];
       for(int i=0;i<n;i++)
       {
            ansArr[i] = minArr[i] - arr[i];
            System.out.print(ansArr[i]+" ");
       }
       System.out.println();
       
       //5.sum all values
       int sum = 0;
       for(int i=0;i<n;i++)
       {
         sum +=ansArr[i];
         
       }
       System.out.println("Ans is "+sum); 


    }
}
