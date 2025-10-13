

public class StringCompression {
    public static void main(String[] args) {
        String str="aaabbcccc";
        String newStr="";
        int count=1;
        int n= str.length();
        if(n==0)
        {
            System.out.println("String of length 0");
        }
        else{
        for(int i=1;i<n;i++)
        {
            if(str.charAt(i)==str.charAt(i-1))
            {
                count++;
            }
            else if(count>1 && str.charAt(i)!=str.charAt(i-1) )
            {
                newStr+=str.charAt(i-1)+""+count;
                count=1;
            }
            else{
                newStr+=str.charAt(i-1);
            }

        }
        if(str.charAt(n-1)==str.charAt(n-2))
        {
            newStr+=str.charAt(n-1)+""+count;
                count=1;
        }
        else
        {
            newStr+=str.charAt(n-1);
        }

        
    }
    System.out.println(newStr);
        
    }
}
