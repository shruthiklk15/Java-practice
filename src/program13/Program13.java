class Program13{
    public static void main(String[] args) {
        int n = 31;
        int x= 10;
        int y=20;
        int z = 10;

        if(n%2==0){
            System.out.println("The number "+n+" is even");
        }
        else{
            System.out.println("The number " +n+ " is odd");
        }
        System.out.println("---------------------------------------");
        
        if(x>y && x>z){
            System.out.println("x "+x+" is bigger");
        }
        else if(y>x && y>z){
            System.out.println("y "+y+" is bigger");
        }
        else{
            System.out.println("z "+z+" is bigger");
        }
    }
}