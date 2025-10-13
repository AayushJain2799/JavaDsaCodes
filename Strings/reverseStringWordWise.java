public class reverseStringWordWise {
    public static void main(String[] args) {
        String str = "This is a pen";
        String[] s = str.split(" ");
        for(int i=s.length-1;i>=0;i--)
        {
            System.out.print(s[i]+" "); 
        }
        System.out.println(s.length);
        

    }
}
