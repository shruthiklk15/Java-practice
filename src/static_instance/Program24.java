class Program24
{
    static int x = 1;
    int y = 2;
}

class MainClass24
{
    public static void main(String[] args)
    {
        System.out.println("Accessing static variable using dot operator directly with class name" );
        System.out.println("x value is"  + Program24.x); 
        Program24.x = 10;
        System.out.println("x value after updating is"  + Program24.x); 
        System.out.println("Accessing instance variable using dot operator by creating an object" );
        Program24 newObject = new Program24();
        System.out.println("y value is"  + newObject.y); 
        newObject.y=20;
        System.out.println("y value after updating is"  + newObject.y); 
    }
}