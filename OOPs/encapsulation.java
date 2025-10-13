public class encapsulation {
    private int roll;
    private String name;
    private int marks;

    public encapsulation(int roll, String name, int marks)
    {
        this.roll =roll;
        this.name = name;
        this.marks = marks;
    }

    public int getMarks()
    {
        return marks;
    }
    public void setMarks(int marks)
    {
        this.marks = marks;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public static void main(String[] args) {
        encapsulation e = new encapsulation(1, "Aayush", 105);
      //  System.out.println("Roll no is "+e.getroll);
        System.out.println("Name is "+e.getName());
        System.out.println("Marks are "+e.getMarks());

    }
}
