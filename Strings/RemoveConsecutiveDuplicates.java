public class RemoveConsecutiveDuplicates {
    public static void main(String[] args) {
        String str = "aaabbca";
        if(str.length()==0)
        {
            System.out.println("String is empty");
            
        }
        else if(str.length()==1)
        {
            System.out.println(str);
            
        }
       else
       {
        String str2 = str.charAt(0)+"";
        for(int i=1;i<str.length();i++)
        {
            if(str.charAt(i) != str.charAt(i-1))
            {
                str2 += str.charAt(i);
            }
        }
    
        System.out.println(str2);
    }
        
    }
}