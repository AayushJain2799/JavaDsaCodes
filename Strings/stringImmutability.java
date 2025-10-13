public class stringImmutability {
    public static void main(String[] args) {
        String s = "Aayush";
        // System.out.println(s.replace('a', 'd'));
        // System.out.println(s);
        String b = "Aayush";
        //if(s==b)
        String c = new String("Aayusah");
        System.out.println(b);
        System.out.println(c);
        //System.out.println("They are same");
        if(b.equals(c))
        System.out.println("They are equal");
        else
        System.out.println("They are not equal");


    }
}
