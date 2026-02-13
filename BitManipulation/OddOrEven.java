//package BitManipulation;

public class OddOrEven {
    public static void main(String[] args) {
        int num = 7576542;
        int lastbit = num&1;
        if(lastbit ==1)
            System.out.println("Odd number");
        else
            System.out.println("Even number");
    }
}
