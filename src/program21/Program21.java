class Program21{
    public static void main(String[] args){
        double acc_bal = 10000.00;
        double amt = 1000.00;
        int i=1;
        while(i<=10) {
            if(amt <= acc_bal ) {
                acc_bal = acc_bal - amt;
                System.out.println("withdraw success of Rupees " +acc_bal);
                i++;
            }
            else{
            break;
            }
        }
        System.out.println("Transaction Failed");
        System.out.println("your account balance is "+acc_bal);
    }
}