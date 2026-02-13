public class abstraction
{
    public interface runner
    {
        void run();
        static void printRunner()
        {
            System.out.println("I can run");
        }
    }

    public interface swimmer
    {
        void swim();
        static void printSwimmer()
        {
            System.out.println("I can swim");
        }
    }

    public static class Athelete implements runner, swimmer
    {

        @Override
        public void swim() {
            System.out.println("I am a swimmer from swim");
        }

        @Override
        public void run() {
            System.out.println("I am a runner from run");
            
        }
        
    }
    public static void main(String[] args) {
        abstraction.Athelete person = new abstraction.Athelete();
        person.run();
        person.swim();
        
    }
}
