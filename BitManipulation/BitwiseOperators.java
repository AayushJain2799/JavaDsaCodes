//package BitManipulation;

public class BitwiseOperators {
    public static void main(String[] args) {
        int num = 4&6;
        System.out.println(num);

        int num2 = 4|6;
        System.out.println(num2);

        int num3 = 12^18;
        System.out.println(num3);
        
        System.out.println(~512);

        System.out.println(20<<2);
        System.out.println(20>>2);
    }

}
