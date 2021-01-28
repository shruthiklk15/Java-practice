import java.util.Scanner;
public class mainclass3{
    public static void main(String[] args)
    {
        int x=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");

        int n = sc.nextInt();
        for(int i =1;i<=n;i++)
        {
            System.out.print(i*i+" ");  //1  , 4, 9, 16
               
        }
        // for(int i =1;i<=n*2;i=i+2)
        // {
        //     x=x+i;
        //     System.out.print(x+" ");  //1  , 4, 9, 16
               
        // }
    }
}