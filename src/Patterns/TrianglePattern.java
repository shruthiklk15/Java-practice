import java.util.Scanner;
public class TrianglePattern{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n = sc.nextInt();

        for(int j=1;j<=n;j++){
            for(int i=1;i<=j;i++){
                System.out.print("* ");
            } 
            System.out.println();
        }
    }
}