class Program17{
    public static void main(String[] args) {
        for(int i = 1; i<=5; i++){
            System.out.println(i);
        }
        System.out.println("---------------");
        for(int i = 5; i>=1; i --){
            System.out.println(i);
        }
        System.out.println("---------------");
        for(int i = 1; i<=10; i++){
            if(i%2==0){
                System.out.println("even numbers between 1 to 10 are ");
            }
        }
        System.out.println("---------------");
        for(int i=1; i<=10; i++){
            if(i==5){
                continue;
            }
            System.out.println(i);  //continue skips 5 and continues iteration
        }
        System.out.println("---------------");
        for(int i=1; i<=10; i++){
            if(i==5){
                break;
            }
            System.out.println(i);  
        }
    }
}