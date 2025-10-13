public class RemoveCharacter {
    public static void main(String[] args) {
        String str = "aabbcbebssdb"; //aacessd
        String str2="";
        if(str.length()==0)
        {
            System.out.println("Empty String");
        }
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)!='b')
            {
                str2+=str.charAt(i);
            }
        }
        System.out.println(str2);
    }
}