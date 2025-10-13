public class Intro {
    public static void main(String[] args) {
        // char[] name = {'A','a','y','u','s','h','\n'};
        // for(int i=0;i<name.length;i++)
        // {
        //     System.out.print(name[i]);
        // }
        // String name = "";
        // System.out.println(name);
        // System.out.println(name.charAt(2));

        //concatination
        String s1 = "Aayush";
        String s2 = "Jain";
        String s3 = s1+" "+s2;
        // System.out.println(s3);
        // System.out.println(s1.concat(" ").concat(s2));

        //equals
        String s4 = "Libruary";
        String s5 = "Libruary";
        // System.out.println(s4.equals(s5));
        // System.out.println(s4.toLowerCase());
        System.out.println(s4);
        System.out.println(s4.trim());
        System.out.println(s4.compareTo(s5));
        int length = s4.length();
        System.out.println(length);
        System.out.println(s4.substring(3));
        System.out.println(s4.substring(3, 6));

    }
}
