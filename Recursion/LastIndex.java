public class LastIndex {
    public static int search(int[] arr, int val, int idx)
    {
        if(arr.length==idx)
            return -1;
        int smallArr = search(arr,val,idx+1);
        if(smallArr!=-1)
            return smallArr;
        if(arr[idx] == val)
            return idx;
        else
            return -1;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,4,3,1};
        int val = 3;
        System.out.println(search(arr,val,0));

    }
    
        
     
}
