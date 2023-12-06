class A
{
    int a,b;
    A(int x,int y)
    {
        a=x;
        b=y;
    }
    int two()
    {
        return (a+b);
    }
}
class B extends A
{
    int c;
    B(int x, int y, int z)
    {
        super(x,y);
        c=z;
    }
    int three()
    {
        return (a+b+c);
    }
}
class OverRide
{
    public static void main(String[] args) {
        B obj = new B(10,20,30);
        System.out.println("sum="+obj.two());
        int r = obj.three();
        System.out.println("Result="+r);
    }
}
