import java.util.Scanner;
public class CharacterPattern{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n = sc.nextInt();

        // for(int j=1;j<=n;j++){
        //     for(char i='A' ;i<='D';i++){
        //         System.out.print(i+" ");
        //     } 
        //     System.out.println();
        // }

        for(int j=1;j<=n;j++){
            for(int i=65 ;i<=65+n;i++){
                System.out.print((char)i+" ");
            } 
            System.out.println();
        }
    }
}

A B C D
A B C D
A B C D
A B C D