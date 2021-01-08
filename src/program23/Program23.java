class Program23
{
    int x=10;
}

class MainClass23
{
   public static void main(String[] args) 
   {
      System.out.println("object creation program started"); 
      Program23 object1 = new Program23();
      object1.x =20;
      System.out.println("updated x value" + object1.x);
      System.out.println("object creation program ended"); 
   }
}