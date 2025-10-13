public class Inheritance 
{
    // // Single level inheritance
    // public static class A
    // {
    //     public void printA()
    //     {
    //         System.out.println("In A");
    //     }
    // }
    // public static class B extends A
    // {
    //     public void printB()
    //     {
    //         System.out.println("In B");
    //     }
    // }

     // Multi level inheritance
    //  public static class A
    //  {
    //      public void printA()
    //      {
    //          System.out.println("In A");
    //      }
    //  }
    //  public static class B extends A
    //  {
    //      public void printB()
    //      {
    //          System.out.println("In B");
    //      }
    //  }
    //  public static class C extends B
    //  {
    //      public void printC()
    //      {
    //          System.out.println("In C");
    //      }
    //  }

    //Hierarchial Inheritance
    public static class A
    {
        public void printA()
        {
            System.out.println("In A");
        }
    }
    public static class B extends A
    {
        public void printB()
        {
            System.out.println("In B");
        }
    }
    public static class C extends A
    {
        public void printC()
        {
            System.out.println("In C");
        }
    }

    public static void main(String[] args) {
        // A a = new A();
        // a.printA();
        // a.printB();
        // B b = new B();
        // b.printA();
        // b.printB();

        //multiple
        C c = new C();
        c.printA();
        c.printB();
        c.printC();
    }
}
