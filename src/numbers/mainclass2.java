import java.util.Scanner;
public class mainclass2{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n = sc.nextInt();
        int a=1;
        for(int i =0;i<n;i++)
        {
            a=a+i;
            System.out.println(a);
               
        }
    }
}