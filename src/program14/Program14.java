class Program14{
    public static void main(String[] args){
        int num = 5;
        if(num %3==0 && num%5==0){
            System.out.println("FIZZ-BUZZ");
        }
        else if (num % 3 ==0){
            System.out.println("FIZZ");
        }
        else if(num % 5 ==0){
            System.out.println("BUZZ");
        }
    }
}