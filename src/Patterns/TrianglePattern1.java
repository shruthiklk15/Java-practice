import java.util.Scanner;
public class TrianglePattern1{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){

               System.out.print(n-j+" ");
            } 
            System.out.println();
        }

        // for(int i=n;i>=1;i--){
        //     for(int j=n;j>=i;j--){

        //        System.out.print(j+" ");
        //     } 
        //     System.out.println();
        // }
    }
}