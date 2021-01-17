class Demo
{
    static int x=27;
    // Static int y=24;
}
class Program27 {
    public static void main(String[] args)
    {
        Demo d1=new Demo();
        System.out.println("x value is:"+d1.x);
        System.out.println(d1);
        Demo d2=new Demo();
        d2.x=50;
        System.out.println("x value is:"+d2.x);
        System.out.println(d2);
        System.out.println("x value is:"+Demo.x);

    }
}