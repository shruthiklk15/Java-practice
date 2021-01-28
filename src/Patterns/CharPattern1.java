import java.util.Scanner;
public class CharPattern1{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n = sc.nextInt();

        // for(int j=1;j<=n;j++){
            for(int i=1 ;i<=n*n;i++){
                System.out.print(i+" ");
            } 
            System.out.println();
        // }
    }
}