public class CheckPermutation {

    public static boolean isPermutation(String str1,String str2)
    {
        if(str1.length()!=str2.length())
        return false;

        int[] freq = new int[26];
        for(int i=0;i<str1.length();i++)
        {
            freq[str1.charAt(i)-'a']++;
        }
        for(int i=0;i<str1.length();i++)
        {
            freq[str2.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++)
        {
            if(freq[i]!=0)
            return false;
        }
        return true;

    }
    public static void main(String[] args) {
        String str1="aayush";
        String str2 = "fayaus";
        System.out.println(isPermutation( str1,str2));
    }
}
