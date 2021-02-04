// class BinaryToDecimal{
//     public static int binary(int n) {
//         if(n==1)
//             return 1;
//             return n%10+2*binary(n/10);
//     }
//     public static void main(String[] args) {
//             System.out.println(binary(101));
//     }
// }

class BinaryToDecimal{
  
    public static void binaryToDecimal(int n) {
        if(n>1){
            binaryToDecimal(n/10);
            System.out.println(n%10);
        }
    }
    public static void main(String[] args) {
        binaryToDecimal(101);
    }

}