public class printAllSubstrings {
    public static void main(String[] args) {
        String s ="abcd";
        for(int i=0;i<s.length();i++)
        {
            for(int j=i;j<s.length();j++)
            {
                for(int k=i;k<=j;k++)
                {
                    System.out.print(s.charAt(k));
                }
                if(j==s.length()-1)
                {

                }
                else
                System.out.print(", ");
            }
            System.out.println();
        }
    }
}
