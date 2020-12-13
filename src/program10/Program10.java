class Program10 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int c = 0;
        int d = 0;
        System.out.println(a);
        a++;
        System.out.println(a);
        ++a;
        System.out.println(a);
        a--;
        System.out.println(a);
        --a;
        System.out.println(a);

        // .......................

        b = c++;  //assign then increament(post increament)
        System.out.println(b); 

        b = ++d;  // increament then assign(pre increament)
        System.out.println(b);

    }
}