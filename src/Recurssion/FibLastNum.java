public class FibonacciSeries {
    static int a=1,b=1,c=0;
    public static void fibo(int count){
        if(count>=1){
            c=a+b;
            a=b;
            b=c;
            fibo(count-1);
        }
        else{
            System.out.println(c-a+"");

        }
        
    }

    public static void main(String[] args) {
        fibo(5);
        // System.out.println(c-a+"");
    }
}

