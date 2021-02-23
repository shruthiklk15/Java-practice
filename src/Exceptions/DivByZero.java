import java.util.Scanner;
class DivByZero{
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("Enter first number");
        int a = scan.nextInt();
        System.out.println("Enter second number");
        int b = scan.nextInt();

        // try{
        //     System.out.println(a/b);
        // }
        // finally{
        //     System.out.println("Finally");       error: 'catch' without 'try' because we cant use 
        // }
        try{
            
        }
         finally{
            try{
                System.out.println(a/b);
            }
            catch(RuntimeException e){
                System.out.println("Do no divide by zero");
            }
        }
        // catch(ArithmeticException e){                           error: exception ArithmeticException has already been caught
        //     System.out.println("Do not divide by zero");   
        // }
    }
}