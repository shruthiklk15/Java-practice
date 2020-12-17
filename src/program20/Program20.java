class Program20{
    public static void main(String[] args){
        double acc_bal = 20000.00;
        double amt = 2000.00;
        double min_bal=1000;
        for(int i=1;i<=10 ;i++){
            if(amt <= acc_bal && acc_bal - amt > min_bal) {
                acc_bal = acc_bal - amt;
                System.out.println("withdraw success " +acc_bal);
            }
            else{
            break;
            }
        }
        System.out.println("Transaction Failed");

        System.out.println("Please maintain min balance . your balance is "+acc_bal);
    }
}