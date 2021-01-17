import java.util.*;
class Program26
{
    static int fruit(int n)
    {
        int a[]={5,3,3};
        int sum=0;
        if(n!=0)
        {
                if(n==1)
            {
               sum=(a[0]);
               
            }
            else if(n==2)
            {
                sum=(a[0]+a[1]);
                

            }
            else if(n==3)
            {
                sum=((a[0]+a[1])*a[2]);
            }
        }
        return sum;
        

     }
        
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Input");
        int n=sc.nextInt();
        int k=fruit(n);
        System.out.println(k);

        
    }
}