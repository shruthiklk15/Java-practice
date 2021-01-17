import java.util.*;
class Program26
{
    int fruit(int n)
    {
        int a[]={5,3,3};
        int sum=0;
        if(n==1)
        {
            return a[0];
        }
        else if(n==2)
        {
             sum=a[0]+a[1];
             return sum;

        }
        else if(n==3)
        {
            return sum+a[2];
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Input");
        int n=sc.next();
        int result=fruit(n);

        
    }
}