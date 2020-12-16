class Program18{
    public static void main(String[] args){
        int i = 1;
        for(;i<=10;){
            System.out.println(i);
            i++;
        }
        System.out.println("------------------------");

        for(int j=1; ; j++){
            System.out.println(j);
        } 
        // System.out.println("Program ended");   Unreachable statement
    }
}
