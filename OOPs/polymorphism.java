public class polymorphism {
    //compile time
    public static int sum(int a, int b)
    {
        return a+b;
    }
    public static int sum(int a, int b, int c)
    {
        return a+b+c;
    }
    //run time

    public static class Animal
    {
        public void sleep()
        {
            System.out.println("Animal sleeping");
        }
    }
    public static class Horse extends Animal
    {
        @Override
        public void sleep()
        {
            System.out.println("Horse sleeps");
        }
    }

    public static void main(String[] args) {
        System.out.println(sum(1,2,3));
        System.out.println(sum(1,2));
      //  System.out.println(sum(1));

      Animal an = new Animal();
      an.sleep();
      Horse h = new Horse();
      h.sleep();

    }
}
