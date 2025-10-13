public class reverseString {
    public static void main(String[] args) {
        String s = "Aayush";
        String newStr ="";
        for(int i=s.length()-1;i>=0;i--)
        newStr+=s.charAt(i);

        System.out.println(newStr);
        

        // For showing string can't be changed
        // int start = 0;
        // int end = s.length();
       // System.out.println(temp);
        // while(start<end)
        // {
        //     char temp = s.charAt(start);
        //     s.charAt(start) = s.charAt(end);
        // }
    }
    
     
}
