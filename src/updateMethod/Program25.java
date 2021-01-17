class Program25
{
    int x = 10;
    void update_x(int arg1)
    {
        System.out.println("updating x value");
        x = arg1;
    }
}

class MainClass25
{
    public static void main(String[] args)
    {
        Program25 object1 = new Program25();
        System.out.println("x value before update" +object1.x);
        object1.update_x(23);
        System.out.println("x value after updating using method" +object1.x);
    }
}