class Demo1{
    int x=1;
    void m1(){
        System.out.println("m1 method running");
    }
}

class Demo2 extends Demo1{
    int y=2;
    void m2(){
        System.out.println("m2 method running");
    }
}

class Demo3 extends Demo1{
    int z=3;
    void m3(){
        System.out.println("m3 method running");
    }
}

class Mainclass{
    public static void main(String[] args)
    {
        // test(new Demo1());
        // void test(Demo1 arg){
        //     System.out.println("running test()");
        //     System.out.println(arg.x);
        //     arg.m1();
        // }

        test(new Demo2());
        void test(Demo1 arg){
            Demo2 ref1=(Deom2) arg;
            ref1.m2();
        }
    }
}
