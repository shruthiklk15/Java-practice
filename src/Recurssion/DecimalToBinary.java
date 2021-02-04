class DecimalToBinary{
  
    public static void decimalToBinary(int n) {
        if(n>1){
            decimalToBinary(n/2);
            System.out.println(n%2);
        }
    }
    public static void main(String[] args) {
       decimalToBinary(5);
    }

}