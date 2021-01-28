import java.util.Scanner;
public class NumPattern2{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n = sc.nextInt();

        for(int j=1;j<=n;j++){
            for(int i=n ;i>=1;i--){
                System.out.print(i+" ");
            } 
            System.out.println();
        }
    }
}


// 5 4 3 2 1
// 5 4 3 2 1
// 5 4 3 2 1
// 5 4 3 2 1
// 5 4 3 2 1