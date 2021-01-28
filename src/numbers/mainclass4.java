import java.util.Scanner;
public class mainclass4{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n = sc.nextInt();
        int a=0;
        for(int i =1;i<n;i++)
        {
            a=a+i;
            System.out.println(a);  //1,3,6,10,15,21,28
               
        }
    }
}