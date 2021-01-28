import java.util.Scanner;
public class mainclass7{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n = sc.nextInt();
        int a=1,b=1,c=0;
        for(int i =1;i<=n;i++)
        {
            if(i%2==0){
                c=a+b;
            System.out.print(a+"");  //
            a=b;
            b=c;
            }
           else{
           
            System.out.print(i+""); //1 1 3 1 5 2 7 3 
           }

               
        }
    }
}