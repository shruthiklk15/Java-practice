class ThrowsExample{
    static void div() throws ArithmeticException{
        System.out.println(1/0);
    }
    public static void main(String[] args) {
        try{
            div();
        }
        catch(ArithmeticException e){
            System.out.println("dont div by zero");
        }
    }
}