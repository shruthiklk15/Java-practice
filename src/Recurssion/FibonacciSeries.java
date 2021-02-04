public class FibonacciSeries {
    static int a=1,b=1,c=0;
    public static void fibo(int count){
        if(count>=1){
            c=a+b;
            System.out.println(a+"");
            a=b;
            b=c;
            fibo(count-1);
        }
        
    }

    public static void main(String[] args) {
        fibo(5);
    }
}

