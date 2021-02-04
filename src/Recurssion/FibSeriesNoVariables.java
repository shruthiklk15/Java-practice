public class FibSeriesNoVariables {
    
    public static int fibo(int count){
        if(count==1){
           return 1;
        }
        else if(count==0){
            return 0;
        }
        else{
            return (fibo(count-1)+fibo(count-2));
        }
    }
    public static void main(String[] args) {
       System.out.println(fibo(6)); 
    }
}

