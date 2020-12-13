class Program9 {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;
        int r1,r2,r3,r4,r5;
        r1 = x + y;
        r2 = x - y;
        r3 = x / y;
        r4 = x * y;
        r5 = x % y;
        System.out.println("addition "+r1);
        System.out.println("subtraction " +r2);
        System.out.println("division " +r3);
        System.out.println("multiplication " +r4);
        System.out.println("division " +r5);
        System.out.println(10/2);  //int division
        System.out.println(10.2/2.0);  //float division
        System.out.println(10/2.0); //float division
        System.out.println(10.0/2); //float division
        System.out.println(1/2);  // int division=> O is output not 0.5
    }
}