public class countSort {
    public static void main(String[] args) {
        int arr[] = {2,7,4,6,1,50,9,4,5};
        int max = arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>max)
            max = arr[i];
        }

        int countArr[] = new int[max+1];
        for(int i=0;i<arr.length;i++)
        {
            countArr[arr[i]]++; 
        }
        // for(int i=0;i<countArr.length;i++)
        // System.out.print(countArr[i]  +" ");   
        int index = 0;
        for(int i=0;i<countArr.length;i++)
        {
            while(countArr[i]!=0)
            {
                arr[index] = i;
                index++;
                countArr[i]--;
            }
        }    
        for(int i=0;i<arr.length;i++)
         System.out.print(arr[i]+" ");
    }
}
