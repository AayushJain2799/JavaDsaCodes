
public class Constructors {
    //1 Default --> Created by compiler
    //2 No arg
    public Constructors()
    {
        System.out.println("Hi I am a constructor");
    }

    //3 Parameterized
    int roll;
    String name;
    public Constructors(int roll, String name)
    {
        this.roll = roll;
        this.name = name;
        System.out.println("Roll no: "+roll);
        System.out.println("Name: "+name);
        
    }
    //4 Copy Const

    public static void main(String[] args) {
        Constructors constructors = new Constructors(); 

        Constructors const2 = new Constructors(1,"Aayush");
        System.out.println("Add of const2 = "+ const2);
        Constructors const3 = new Constructors(2,"Aman");
        System.out.println("Address of const 3 =" +const3);
        const2 = const3;
        System.out.println("new Address of const 2 = "+const2);
        
    }


}
