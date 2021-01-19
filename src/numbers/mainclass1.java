import java.util.Scanner;
public class mainclass1{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n = sc.nextInt();
        for(int i =0;i<=n;i++)
        {
            System.out.println((int)(Math.pow(i,3))+1+"");
            System.out.println((i*i*i+1)+"");
               
        }
    }
}