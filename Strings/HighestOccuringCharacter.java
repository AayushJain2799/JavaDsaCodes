public class HighestOccuringCharacter {
    public static void main(String[] args) {
        String str = "abbfbdbrybbsbe";
        int[] freq = new int[26];
        int idx = 0;
        int maxfreq=0;
        for(int i=0;i<str.length();i++)
        {
            freq[str.charAt(i)-'a']++;
        }
        for(int i=0;i<freq.length;i++)
        {
            if(maxfreq<freq[i])
            {
                maxfreq = freq[i];
                idx = i;
            }
            
        }
        System.out.println((char)(idx+'a'));
    }
}