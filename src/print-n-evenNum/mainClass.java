import java.util.Scanner;
public class mainClass{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n = sc.nextInt();
        for(int i =1;i<=n;i++)
        {
            if(i%2==0)
            {
                System.out.println(i-1+"");  
            } else{
                System.out.println(i+1+"");  
            }
            
               
        }
    }
}