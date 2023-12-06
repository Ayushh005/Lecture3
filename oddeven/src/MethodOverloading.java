class Demo
{
void add (int a, int b)
{
    System.out.println(a+b);
}
    void add (int a, float b)
    {
        System.out.println(a+b);
    }
    void add (float a, int b)
    {
        System.out.println(a+b);
    }

}
public class MethodOverloading
{
    public static void main(String[] args) {

        Demo obj = new Demo();
        obj.add(1,3);
        obj.add(3.5f,5);
        obj.add(6,7.6f);
    }
}