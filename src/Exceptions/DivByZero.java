import java.util.Scanner;
class DivByZero{
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("Enter first number");
        int a = scan.nextInt();
        System.out.println("Enter second number");
        int b = scan.nextInt();

        try{
            System.out.println(a/b);
        }
        catch(ArithmeticException e){
            System.out.println("Do not divide by zero");
        }
    }
}