class Program11{
    public static void main(String[] args){
        int x=0; int y=0;
        int a=0 , b=0;
        int c=0 , d=0;
        int e=0, f=0;
        int g=0, h=0;

        y = x++ + x; //output 1
        System.out.println("y" +y);
// ..........................................

        b = a++ + ++a;
        System.out.println("a"+a); //2
        System.out.println("b"+b);  //output 2

// ............................................

        d = c++ + c + ++c + c++ ;
            
        System.out.println("c"+c); //3
        System.out.println("d"+d); //5

// ............................................

        f = e++ + ++e  + e++ + ++e + ++e + e++ + e++ + ++e + e++ ;
        System.out.println("e " +e); //
        System.out.println("f " +f); //
// .............................................

        g=g++;
        g=g++;
        g=g++;
        System.out.println("g " +g); //0

        h=++h;
        h=++h;
        h=++h;
        System.out.println("h " +h); //3


    }
}