public class stringReverse {
    public static void main(String[] args) {
        String s = "Aayush";
        int i = 0, j=s.length()-1;
        while(i<j)
        {
            char temp = s.charAt(i);
            s.charAt(i) = s.charAt(j);
            s.charAt(j) = temp;
        }

    }
}
